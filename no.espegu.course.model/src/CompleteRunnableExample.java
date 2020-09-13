import course.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.EList;
import java.util.List;

public class CompleteRunnableExample {
	
	private static final String DELIMITER = "_________________________________";

    public static void main(String[] args) {

        // Top "domain" object is School
        School school = CourseFactory.eINSTANCE.createSchool();
        school.setName("NTNU");

        // A program is defined by its name and credits required to complete the program
        Program aProgram = generateProgram("Informatics - master 2 year", 120f);

        // A program may change its availability in courses / specializations on a "year-to-year" basis
        // Field 'year' corresponds to the 'starting year' of a program degree
        ProgramYear aProgramYear = generateProgramYear("2020");

        // A semester consist of a set of mandatory and elective courses
        // A semester may also offer directions (specializations) - with continuation of more semesters
        ProgramSemester firstProgramSemester = generateProgramSemester("2020", SemesterType.AUTUMN);

        // A direction is in its simplest form a collection of semesters
        // A direction may nest multiple semesters which has more directions, making a complex structure of
        // multiple level of directions (specializations) within a program.
        ProgramDirection softwareEngineeringSpecialization = generateProgramDirection("Software Engineering");

        // Creating a few semesters for the specialization Software Engineering
        ProgramSemester firstSoftwareEngineeringSemester = generateProgramSemester("2020", SemesterType.AUTUMN);
        ProgramSemester secondSoftwareEngineeringSemester = generateProgramSemester("2021", SemesterType.SPRING);

        // Import courses from an xmi resource and add them to the Software Engineering first semester course lists (mandatory and elective courses)
        firstSoftwareEngineeringSemester.getMandatoryCourses().addAll(
                generateListOfCoursesFromProgramSemesterXmi("man-courses-software-engi-autumn2020.xmi", true));
        firstSoftwareEngineeringSemester.getElectiveCourses().addAll(
                generateListOfCoursesFromProgramSemesterXmi("elective-courses-software-engi-autumn2020.xmi", false));

        // Add the complete first semester with courses to the specialization
        softwareEngineeringSpecialization.getSemesters().add(firstSoftwareEngineeringSemester);

        // A new direction (sub-specialization) becomes available in the second semester of Software Engineering (not in reality, but in this example)
        ProgramDirection uxDesignSpecialization = generateProgramDirection("UX & Software Design");

        // The first semester of UX design is SPRING 2021, equal to the second semester of Software Engineering (when this specialization becomes available)
        ProgramSemester firstUxDesignSemester = generateProgramSemester("2021", SemesterType.SPRING);

        // Import courses for UX design from an xmi resource, and add them to the UX design first semester (mandatory and elective courses)
        firstUxDesignSemester.getMandatoryCourses().addAll(generateListOfCoursesFromProgramSemesterXmi("man-courses-ux-spec-spring2021.xmi", true));
        firstUxDesignSemester.getElectiveCourses().addAll(generateListOfCoursesFromProgramSemesterXmi("elective-courses-ux-spec-spring2021.xmi", false));

        // Add the first semester to the UX Design specialization
        uxDesignSpecialization.getSemesters().add(firstUxDesignSemester);

        // Add the UX Design specialization to the second semester of Software Engineering
        // Here, more specializations could have been added as well
        secondSoftwareEngineeringSemester.getSpecializations().add(uxDesignSpecialization);

        // Add the second semester to the Software Engineering specialization
        softwareEngineeringSpecialization.getSemesters().add(secondSoftwareEngineeringSemester);

        // Add Software Engineering to the initial program semester
        firstProgramSemester.getSpecializations().add(softwareEngineeringSpecialization);

        // Add the default program semester (containing Software Engineering as a specialization) to the program year
        aProgramYear.getSemesters().add(firstProgramSemester);

        // Add the program year to the Informatics programme
        aProgram.getProgramYears().add(aProgramYear);

        // Add the Informatics programme to the school's list of programs
        school.getPrograms().add(aProgram);

        // Creates a student
        Student aStudent = generateStudent("Espen Gudmundsen");

        // Creates a study plan instance
        StudyPlan studyPlan = CourseFactory.eINSTANCE.createStudyPlan();

        // A study plan has a reference to a ProgramYear (start of study),
        // which again has a reference to the Program.
        studyPlan.setProgramStartingYear(aProgramYear);

        // Creates the first study plan semester, where Software Engineering is selected as specialization
        StudyPlanSemester firstStudyPlanSemester = generateStudyPlanSemester("2020", SemesterType.AUTUMN, firstSoftwareEngineeringSemester);
        // Creates the second study plan semester, where UX Design is selected as a specialization
        StudyPlanSemester secondStudyPlanSemester = generateStudyPlanSemester("2021", SemesterType.SPRING, firstUxDesignSemester);

        // Add a course to the study plan semester (list of selected courses), operation also validates that course is not already selected
        secondStudyPlanSemester.addCourseToSemester(generateCourse("Master in Informatics, Preparatory Project", "IT3915", 15, CourseLevel.HIGHER_DEGREE, SemesterType.SPRING));

        // Add the two semesters to the study plan
        studyPlan.getSemesters().add(firstStudyPlanSemester);
        studyPlan.getSemesters().add(secondStudyPlanSemester);

        // Add study plan reference to the student
        aStudent.setStudyPlan(studyPlan);
        // Add student to school
        school.getStudents().add(aStudent);
        
        // Debug print
        System.out.println(System.lineSeparator());
        System.out.println("Student: " + aStudent.getName());
        System.out.println(DELIMITER);
        studyPlan.getSemesters().forEach(semester -> {
            System.out.println(System.lineSeparator());
            System.out.println("Semester: " + semester.getTeachedInSemester() + " - " + semester.getYear());
            System.out.println(DELIMITER);
            System.out.println("Total courses: " + semester.getAllCoursesInSemester().size());
            semester.getAllCoursesInSemester().forEach(course -> System.out.println(course.toString()));
            System.out.println(DELIMITER);
            System.out.println("Mandatory courses: " + semester.getRelatedProgramSemester().getMandatoryCourses().size());
            System.out.println("Selected courses: " + semester.getSelectedCourses().size());
            System.out.println("Total credits this semester: " + semester.getTotalCredits());
            if(semester.getRelatedProgramSemester().getParentProgramDirection() != null) {
                System.out.println("Choice of specialization: " + semester.getRelatedProgramSemester().getParentProgramDirection().getName());
                System.out.println("Part of program: " + semester.getRelatedProgramSemester().getParentProgramDirection().getProgram().getName());
            }
            System.out.println(DELIMITER);
        });

        System.out.println(System.lineSeparator());
        System.out.println("Program: " + aProgram.getName());
        System.out.println("Required credits: " + aProgram.getRequiredCredits());
        System.out.println(DELIMITER);

        aProgram.getProgramYears().forEach(programYear -> {
            System.out.println("Program year: " + programYear.getYear());
            System.out.println(DELIMITER);
            programYear.getSemesters().forEach(CompleteRunnableExample::printProgramSemester);
        });
    }

    private static void printProgramSemester(ProgramSemester programSemester) {
        System.out.println("Semester: " + programSemester.getTeachedInSemester() + " - " + programSemester.getYear());
        if(programSemester.getParentProgramDirection() != null) {
            System.out.println("Semester is contained in " + programSemester.getParentProgramDirection().getName());
        }
        System.out.println("Specializations: " + programSemester.getSpecializations().size());

        boolean hasMandatoryCourses = programSemester.getMandatoryCourses() != null && !programSemester.getMandatoryCourses().isEmpty();
        if(hasMandatoryCourses) {
            System.out.println("Mandatory courses: " + programSemester.getMandatoryCourses().size());
        }
        boolean hasElectiveCourses = programSemester.getElectiveCourses() != null && !programSemester.getElectiveCourses().isEmpty();
        if(hasElectiveCourses) {
            System.out.println("Elective courses: " + programSemester.getElectiveCourses().size());
        }

        if(!hasMandatoryCourses && !hasElectiveCourses) {
            if(programSemester.getSpecializations() != null && !programSemester.getSpecializations().isEmpty()) {
                System.out.println("This semester only contains specializations - future semesters are defined by the choice of specialization.");
            } else {
                System.out.println("This semester is empty.");
            }
        }
        System.out.println(DELIMITER);
        printSpecializations(programSemester.getSpecializations());
    }

    private static void printSpecializations(EList<ProgramDirection> specializations) {
        specializations.forEach(specialization -> {
            System.out.println("Specialization name: " + specialization.getName());
            System.out.println(DELIMITER);
            specialization.getSemesters().forEach(CompleteRunnableExample::printProgramSemester);
        });
    }

    private static Course generateCourse(String name, String code, float credits, CourseLevel courseLevel, SemesterType taughtIn) {
        Course course = CourseFactory.eINSTANCE.createCourse();
        course.setName(name);
        course.setCode(code);
        course.setCredits(credits);
        course.setLevel(courseLevel);
        course.setTaughtInSemester(taughtIn);
        return course;
    }

    private static StudyPlanSemester generateStudyPlanSemester(String literalYear, SemesterType type, ProgramSemester relatedProgramSemester) {
        StudyPlanSemester semester = CourseFactory.eINSTANCE.createStudyPlanSemester();
        semester.setYear(literalYear);
        semester.setSemesterType(type);
        semester.setRelatedProgramSemester(relatedProgramSemester);
        return semester;
    }

    private static Resource loadXmiResource(String fileName) {
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getPackageRegistry().put(CoursePackage.eNS_URI, CoursePackage.eINSTANCE);
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        return resSet.getResource(URI.createURI(CompleteRunnableExample.class.getResource(fileName).toString()), true);
    }

    private static List<Course> generateListOfCoursesFromProgramSemesterXmi(String fileName, boolean isMandatoryCourses) {
        Resource resource = loadXmiResource(fileName);
        ProgramSemester programSemester = (ProgramSemester) resource.getContents().get(0);

        if (isMandatoryCourses) {
            return programSemester.getMandatoryCourses();
        } else {
            return programSemester.getElectiveCourses();
        }
    }

    private static ProgramSemester generateProgramSemester(String literalYear, SemesterType semester) {
        ProgramSemester programSemester = CourseFactory.eINSTANCE.createProgramSemester();
        programSemester.setYear(literalYear);
        programSemester.setSemesterType(semester);
        return programSemester;
    }

    private static ProgramDirection generateProgramDirection(String name) {
        ProgramDirection programDirection = CourseFactory.eINSTANCE.createProgramDirection();
        programDirection.setName(name);
        return programDirection;
    }

    private static ProgramYear generateProgramYear(String literalYear) {
        ProgramYear programYear = CourseFactory.eINSTANCE.createProgramYear();
        programYear.setYear(literalYear);
        return programYear;
    }

    private static Student generateStudent(String name) {
        Student student = CourseFactory.eINSTANCE.createStudent();
        student.setName(name);
        return student;
    }

    public static Program generateProgram(String name,
                                          float credits) {
        Program program = CourseFactory.eINSTANCE.createProgram();
        program.setName(name);
        program.setRequiredCredits(credits);
        return program;
    }
}
