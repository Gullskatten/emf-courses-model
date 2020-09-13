/**
 */
package course.impl;

import course.Course;
import course.CourseFactory;
import course.CourseLevel;
import course.CoursePackage;
import course.Program;
import course.ProgramDirection;
import course.ProgramSemester;
import course.ProgramYear;
import course.School;
import course.Semester;
import course.SemesterType;
import course.Student;
import course.StudyPlan;
import course.StudyPlanSemester;

import course.util.CourseValidator;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoursePackageImpl extends EPackageImpl implements CoursePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyPlanSemesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programSemesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programYearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yearEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveFloatNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType courseAlreadyExistsExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allCoursesListEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see course.CoursePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoursePackageImpl() {
		super(eNS_URI, CourseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CoursePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoursePackage init() {
		if (isInited) return (CoursePackage)EPackage.Registry.INSTANCE.getEPackage(CoursePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCoursePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CoursePackageImpl theCoursePackage = registeredCoursePackage instanceof CoursePackageImpl ? (CoursePackageImpl)registeredCoursePackage : new CoursePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCoursePackage.createPackageContents();

		// Initialize created meta-data
		theCoursePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCoursePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return CourseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCoursePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoursePackage.eNS_URI, theCoursePackage);
		return theCoursePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchool() {
		return schoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchool_Programs() {
		return (EReference)schoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchool_Name() {
		return (EAttribute)schoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchool_Students() {
		return (EReference)schoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_Name() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_RequiredCredits() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_School() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_ProgramYears() {
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Level() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Description() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_TaughtInSemester() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourse__IsSameCourse__Course() {
		return courseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_StudyPlan() {
		return (EReference)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_Name() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_School() {
		return (EReference)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudyPlan() {
		return studyPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyPlan_Semesters() {
		return (EReference)studyPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyPlan_Student() {
		return (EReference)studyPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudyPlan_TotalCredits() {
		return (EAttribute)studyPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyPlan_ProgramStartingYear() {
		return (EReference)studyPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_Year() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_SemesterType() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_TeachedInSemester() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramDirection() {
		return programDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramDirection_Name() {
		return (EAttribute)programDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramDirection_Semesters() {
		return (EReference)programDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramDirection_ChosenInSemester() {
		return (EReference)programDirectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramDirection_Program() {
		return (EReference)programDirectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudyPlanSemester() {
		return studyPlanSemesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyPlanSemester_SelectedCourses() {
		return (EReference)studyPlanSemesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudyPlanSemester_TotalCredits() {
		return (EAttribute)studyPlanSemesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyPlanSemester_StudyPlan() {
		return (EReference)studyPlanSemesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyPlanSemester_RelatedProgramSemester() {
		return (EReference)studyPlanSemesterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStudyPlanSemester__AddCourseToSemester__Course() {
		return studyPlanSemesterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStudyPlanSemester__GetAllCoursesInSemester() {
		return studyPlanSemesterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramSemester() {
		return programSemesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramSemester_MandatoryCourses() {
		return (EReference)programSemesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramSemester_ElectiveCourses() {
		return (EReference)programSemesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramSemester_Specializations() {
		return (EReference)programSemesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramSemester_ProgramYear() {
		return (EReference)programSemesterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramSemester_ParentProgramDirection() {
		return (EReference)programSemesterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramYear() {
		return programYearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramYear_Year() {
		return (EAttribute)programYearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramYear_Program() {
		return (EReference)programYearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramYear_Semesters() {
		return (EReference)programYearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemesterType() {
		return semesterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCourseLevel() {
		return courseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getYear() {
		return yearEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveFloatNumber() {
		return positiveFloatNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCourseAlreadyExistsException() {
		return courseAlreadyExistsExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAllCoursesList() {
		return allCoursesListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseFactory getCourseFactory() {
		return (CourseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		schoolEClass = createEClass(SCHOOL);
		createEReference(schoolEClass, SCHOOL__PROGRAMS);
		createEAttribute(schoolEClass, SCHOOL__NAME);
		createEReference(schoolEClass, SCHOOL__STUDENTS);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__NAME);
		createEAttribute(programEClass, PROGRAM__REQUIRED_CREDITS);
		createEReference(programEClass, PROGRAM__SCHOOL);
		createEReference(programEClass, PROGRAM__PROGRAM_YEARS);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEAttribute(courseEClass, COURSE__DESCRIPTION);
		createEAttribute(courseEClass, COURSE__TAUGHT_IN_SEMESTER);
		createEAttribute(courseEClass, COURSE__CODE);
		createEOperation(courseEClass, COURSE___IS_SAME_COURSE__COURSE);

		studentEClass = createEClass(STUDENT);
		createEReference(studentEClass, STUDENT__STUDY_PLAN);
		createEAttribute(studentEClass, STUDENT__NAME);
		createEReference(studentEClass, STUDENT__SCHOOL);

		studyPlanEClass = createEClass(STUDY_PLAN);
		createEReference(studyPlanEClass, STUDY_PLAN__SEMESTERS);
		createEReference(studyPlanEClass, STUDY_PLAN__STUDENT);
		createEAttribute(studyPlanEClass, STUDY_PLAN__TOTAL_CREDITS);
		createEReference(studyPlanEClass, STUDY_PLAN__PROGRAM_STARTING_YEAR);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__YEAR);
		createEAttribute(semesterEClass, SEMESTER__SEMESTER_TYPE);
		createEAttribute(semesterEClass, SEMESTER__TEACHED_IN_SEMESTER);

		programDirectionEClass = createEClass(PROGRAM_DIRECTION);
		createEAttribute(programDirectionEClass, PROGRAM_DIRECTION__NAME);
		createEReference(programDirectionEClass, PROGRAM_DIRECTION__SEMESTERS);
		createEReference(programDirectionEClass, PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER);
		createEReference(programDirectionEClass, PROGRAM_DIRECTION__PROGRAM);

		studyPlanSemesterEClass = createEClass(STUDY_PLAN_SEMESTER);
		createEReference(studyPlanSemesterEClass, STUDY_PLAN_SEMESTER__SELECTED_COURSES);
		createEAttribute(studyPlanSemesterEClass, STUDY_PLAN_SEMESTER__TOTAL_CREDITS);
		createEReference(studyPlanSemesterEClass, STUDY_PLAN_SEMESTER__STUDY_PLAN);
		createEReference(studyPlanSemesterEClass, STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER);
		createEOperation(studyPlanSemesterEClass, STUDY_PLAN_SEMESTER___ADD_COURSE_TO_SEMESTER__COURSE);
		createEOperation(studyPlanSemesterEClass, STUDY_PLAN_SEMESTER___GET_ALL_COURSES_IN_SEMESTER);

		programSemesterEClass = createEClass(PROGRAM_SEMESTER);
		createEReference(programSemesterEClass, PROGRAM_SEMESTER__MANDATORY_COURSES);
		createEReference(programSemesterEClass, PROGRAM_SEMESTER__ELECTIVE_COURSES);
		createEReference(programSemesterEClass, PROGRAM_SEMESTER__SPECIALIZATIONS);
		createEReference(programSemesterEClass, PROGRAM_SEMESTER__PROGRAM_YEAR);
		createEReference(programSemesterEClass, PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION);

		programYearEClass = createEClass(PROGRAM_YEAR);
		createEAttribute(programYearEClass, PROGRAM_YEAR__YEAR);
		createEReference(programYearEClass, PROGRAM_YEAR__PROGRAM);
		createEReference(programYearEClass, PROGRAM_YEAR__SEMESTERS);

		// Create enums
		semesterTypeEEnum = createEEnum(SEMESTER_TYPE);
		courseLevelEEnum = createEEnum(COURSE_LEVEL);

		// Create data types
		yearEDataType = createEDataType(YEAR);
		positiveFloatNumberEDataType = createEDataType(POSITIVE_FLOAT_NUMBER);
		courseAlreadyExistsExceptionEDataType = createEDataType(COURSE_ALREADY_EXISTS_EXCEPTION);
		allCoursesListEDataType = createEDataType(ALL_COURSES_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		studyPlanSemesterEClass.getESuperTypes().add(this.getSemester());
		programSemesterEClass.getESuperTypes().add(this.getSemester());

		// Initialize classes, features, and operations; add parameters
		initEClass(schoolEClass, School.class, "School", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchool_Programs(), this.getProgram(), this.getProgram_School(), "programs", null, 0, -1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchool_Name(), ecorePackage.getEString(), "name", null, 0, 1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchool_Students(), this.getStudent(), this.getStudent_School(), "students", null, 0, -1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_RequiredCredits(), this.getPositiveFloatNumber(), "requiredCredits", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_School(), this.getSchool(), this.getSchool_Programs(), "school", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_ProgramYears(), this.getProgramYear(), this.getProgramYear_Program(), "programYears", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), this.getPositiveFloatNumber(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), this.getCourseLevel(), "level", "First Degree Subject", 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Description(), ecorePackage.getEString(), "description", "Add a description to this course.", 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_TaughtInSemester(), this.getSemesterType(), "taughtInSemester", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCourse__IsSameCourse__Course(), ecorePackage.getEBoolean(), "isSameCourse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "otherCourse", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudent_StudyPlan(), this.getStudyPlan(), this.getStudyPlan_Student(), "studyPlan", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Name(), ecorePackage.getEString(), "name", "Ola Nordmann", 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_School(), this.getSchool(), this.getSchool_Students(), "school", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyPlanEClass, StudyPlan.class, "StudyPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyPlan_Semesters(), this.getStudyPlanSemester(), this.getStudyPlanSemester_StudyPlan(), "semesters", null, 0, -1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPlan_Student(), this.getStudent(), this.getStudent_StudyPlan(), "student", null, 0, 1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyPlan_TotalCredits(), ecorePackage.getEFloat(), "totalCredits", null, 0, 1, StudyPlan.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPlan_ProgramStartingYear(), this.getProgramYear(), null, "programStartingYear", null, 0, 1, StudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_Year(), this.getYear(), "year", "2020", 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_SemesterType(), this.getSemesterType(), "semesterType", "Autumn", 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_TeachedInSemester(), ecorePackage.getEString(), "teachedInSemester", null, 0, 1, Semester.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(programDirectionEClass, ProgramDirection.class, "ProgramDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramDirection_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProgramDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgramDirection_Semesters(), this.getProgramSemester(), this.getProgramSemester_ParentProgramDirection(), "semesters", null, 0, -1, ProgramDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramDirection_ChosenInSemester(), this.getProgramSemester(), this.getProgramSemester_Specializations(), "chosenInSemester", null, 0, 1, ProgramDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramDirection_Program(), this.getProgram(), null, "program", null, 0, 1, ProgramDirection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(studyPlanSemesterEClass, StudyPlanSemester.class, "StudyPlanSemester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyPlanSemester_SelectedCourses(), this.getCourse(), null, "selectedCourses", null, 0, -1, StudyPlanSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyPlanSemester_TotalCredits(), this.getPositiveFloatNumber(), "totalCredits", null, 0, 1, StudyPlanSemester.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPlanSemester_StudyPlan(), this.getStudyPlan(), this.getStudyPlan_Semesters(), "studyPlan", null, 1, 1, StudyPlanSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPlanSemester_RelatedProgramSemester(), this.getProgramSemester(), null, "relatedProgramSemester", null, 1, 1, StudyPlanSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStudyPlanSemester__AddCourseToSemester__Course(), this.getStudyPlanSemester(), "addCourseToSemester", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "course", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCourseAlreadyExistsException());

		initEOperation(getStudyPlanSemester__GetAllCoursesInSemester(), this.getAllCoursesList(), "getAllCoursesInSemester", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programSemesterEClass, ProgramSemester.class, "ProgramSemester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramSemester_MandatoryCourses(), this.getCourse(), null, "mandatoryCourses", null, 0, -1, ProgramSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramSemester_ElectiveCourses(), this.getCourse(), null, "electiveCourses", null, 0, -1, ProgramSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramSemester_Specializations(), this.getProgramDirection(), this.getProgramDirection_ChosenInSemester(), "specializations", null, 0, -1, ProgramSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramSemester_ProgramYear(), this.getProgramYear(), this.getProgramYear_Semesters(), "programYear", null, 0, 1, ProgramSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramSemester_ParentProgramDirection(), this.getProgramDirection(), this.getProgramDirection_Semesters(), "parentProgramDirection", null, 0, 1, ProgramSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programYearEClass, ProgramYear.class, "ProgramYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramYear_Year(), this.getYear(), "year", "2020", 0, 1, ProgramYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramYear_Program(), this.getProgram(), this.getProgram_ProgramYears(), "program", null, 0, 1, ProgramYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramYear_Semesters(), this.getProgramSemester(), this.getProgramSemester_ProgramYear(), "semesters", null, 0, -1, ProgramYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(semesterTypeEEnum, SemesterType.class, "SemesterType");
		addEEnumLiteral(semesterTypeEEnum, SemesterType.AUTUMN);
		addEEnumLiteral(semesterTypeEEnum, SemesterType.SPRING);

		initEEnum(courseLevelEEnum, CourseLevel.class, "CourseLevel");
		addEEnumLiteral(courseLevelEEnum, CourseLevel.FIRST_DEGREE);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.SECOND_DEGREE);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.THIRD_DEGREE);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.HIGHER_DEGREE);

		// Initialize data types
		initEDataType(yearEDataType, String.class, "Year", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveFloatNumberEDataType, Float.class, "PositiveFloatNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(courseAlreadyExistsExceptionEDataType, RuntimeException.class, "CourseAlreadyExistsException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(allCoursesListEDataType, ArrayList.class, "AllCoursesList", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (studyPlanEClass,
		   source,
		   new String[] {
			   "constraints", "hasRequiredCreditsForProgram"
		   });
		addAnnotation
		  (studyPlanSemesterEClass,
		   source,
		   new String[] {
			   "constraints", "isAllCoursesTaughtThisSemester isValidRelatedProgramSemester"
		   });
		addAnnotation
		  (yearEDataType,
		   source,
		   new String[] {
			   "constraints", "hasCorrectYearFormat"
		   });
		addAnnotation
		  (positiveFloatNumberEDataType,
		   source,
		   new String[] {
			   "constraints", "isGreaterOrEqualToZero"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (studyPlanSemesterEClass,
		   source,
		   new String[] {
			   "isAllCoursesTaughtThisSemester", "self.selectedCourses -> collect(selectedCourse | selectedCourse.taughtInSemester) -> forAll(semester | semester == self.semesterType)"
		   });
		addAnnotation
		  (yearEDataType,
		   source,
		   new String[] {
			   "hasCorrectYearFormat", "self.size() == 4 AND self.matches(\'[0-9]+\')"
		   });
	}

} //CoursePackageImpl
