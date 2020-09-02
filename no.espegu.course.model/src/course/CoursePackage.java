/**
 */
package course;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see course.CourseFactory
 * @model kind="package"
 * @generated
 */
public interface CoursePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "course";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.espegu.course.model/model/Courses.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "no.espegu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoursePackage eINSTANCE = course.impl.CoursePackageImpl.init();

	/**
	 * The meta object id for the '{@link course.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.SchoolImpl
	 * @see course.impl.CoursePackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__PROGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__STUDENTS = 2;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.ProgramImpl
	 * @see course.impl.CoursePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__REQUIRED_CREDITS = 1;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SCHOOL = 2;

	/**
	 * The feature id for the '<em><b>Program Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_YEARS = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.ProgramYearImpl <em>Program Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.ProgramYearImpl
	 * @see course.impl.CoursePackageImpl#getProgramYear()
	 * @generated
	 */
	int PROGRAM_YEAR = 9;

	/**
	 * The meta object id for the '{@link course.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.CourseImpl
	 * @see course.impl.CoursePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.StudentImpl
	 * @see course.impl.CoursePackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 3;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDY_PLAN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SCHOOL = 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.StudyPlanImpl
	 * @see course.impl.CoursePackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Starting Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__STARTING_YEAR = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SPECIALIZATION = 3;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.SpecializationImpl
	 * @see course.impl.CoursePackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Program Year</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAM_YEAR = 1;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.SemesterImpl
	 * @see course.impl.CoursePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 6;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Teached In Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__TEACHED_IN_SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.StudyPlanSemesterImpl <em>Study Plan Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.StudyPlanSemesterImpl
	 * @see course.impl.CoursePackageImpl#getStudyPlanSemester()
	 * @generated
	 */
	int STUDY_PLAN_SEMESTER = 7;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__YEAR = SEMESTER__YEAR;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__SEMESTER_TYPE = SEMESTER__SEMESTER_TYPE;

	/**
	 * The feature id for the '<em><b>Teached In Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__TEACHED_IN_SEMESTER = SEMESTER__TEACHED_IN_SEMESTER;

	/**
	 * The feature id for the '<em><b>Selected Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__SELECTED_COURSES = SEMESTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__TOTAL_CREDITS = SEMESTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__STUDY_PLAN = SEMESTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Study Plan Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER_FEATURE_COUNT = SEMESTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Study Plan Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER_OPERATION_COUNT = SEMESTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link course.impl.ProgramSemesterImpl <em>Program Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.ProgramSemesterImpl
	 * @see course.impl.CoursePackageImpl#getProgramSemester()
	 * @generated
	 */
	int PROGRAM_SEMESTER = 8;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__YEAR = SEMESTER__YEAR;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__SEMESTER_TYPE = SEMESTER__SEMESTER_TYPE;

	/**
	 * The feature id for the '<em><b>Teached In Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__TEACHED_IN_SEMESTER = SEMESTER__TEACHED_IN_SEMESTER;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__MANDATORY_COURSES = SEMESTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__OPTIONAL_COURSES = SEMESTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER_FEATURE_COUNT = SEMESTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Program Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER_OPERATION_COUNT = SEMESTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR__SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR__SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR__PROGRAM = 3;

	/**
	 * The number of structural features of the '<em>Program Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Semester</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR___ADD_SEMESTER = 0;

	/**
	 * The operation id for the '<em>Add Specialization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR___ADD_SPECIALIZATION = 1;

	/**
	 * The number of operations of the '<em>Program Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_YEAR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link course.SemesterType <em>Semester Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.SemesterType
	 * @see course.impl.CoursePackageImpl#getSemesterType()
	 * @generated
	 */
	int SEMESTER_TYPE = 10;

	/**
	 * The meta object id for the '{@link course.CourseLevel <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.CourseLevel
	 * @see course.impl.CoursePackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 11;


	/**
	 * The meta object id for the '<em>Year</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see course.impl.CoursePackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 12;


	/**
	 * Returns the meta object for class '{@link course.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see course.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the containment reference list '{@link course.School#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see course.School#getPrograms()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Programs();

	/**
	 * Returns the meta object for the attribute '{@link course.School#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.School#getName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link course.School#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see course.School#getStudents()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Students();

	/**
	 * Returns the meta object for class '{@link course.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see course.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link course.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link course.Program#getRequiredCredits <em>Required Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Credits</em>'.
	 * @see course.Program#getRequiredCredits()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_RequiredCredits();

	/**
	 * Returns the meta object for the container reference '{@link course.Program#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School</em>'.
	 * @see course.Program#getSchool()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_School();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Program#getProgramYears <em>Program Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program Years</em>'.
	 * @see course.Program#getProgramYears()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ProgramYears();

	/**
	 * Returns the meta object for class '{@link course.ProgramYear <em>Program Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Year</em>'.
	 * @see course.ProgramYear
	 * @generated
	 */
	EClass getProgramYear();

	/**
	 * Returns the meta object for the containment reference list '{@link course.ProgramYear#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see course.ProgramYear#getSpecializations()
	 * @see #getProgramYear()
	 * @generated
	 */
	EReference getProgramYear_Specializations();

	/**
	 * Returns the meta object for the containment reference list '{@link course.ProgramYear#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see course.ProgramYear#getSemesters()
	 * @see #getProgramYear()
	 * @generated
	 */
	EReference getProgramYear_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link course.ProgramYear#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see course.ProgramYear#getYear()
	 * @see #getProgramYear()
	 * @generated
	 */
	EAttribute getProgramYear_Year();

	/**
	 * Returns the meta object for the container reference '{@link course.ProgramYear#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see course.ProgramYear#getProgram()
	 * @see #getProgramYear()
	 * @generated
	 */
	EReference getProgramYear_Program();

	/**
	 * Returns the meta object for the '{@link course.ProgramYear#addSemester() <em>Add Semester</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Semester</em>' operation.
	 * @see course.ProgramYear#addSemester()
	 * @generated
	 */
	EOperation getProgramYear__AddSemester();

	/**
	 * Returns the meta object for the '{@link course.ProgramYear#addSpecialization() <em>Add Specialization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Specialization</em>' operation.
	 * @see course.ProgramYear#addSpecialization()
	 * @generated
	 */
	EOperation getProgramYear__AddSpecialization();

	/**
	 * Returns the meta object for class '{@link course.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see course.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see course.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see course.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see course.Course#getDescription()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Description();

	/**
	 * Returns the meta object for class '{@link course.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see course.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the reference '{@link course.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Study Plan</em>'.
	 * @see course.Student#getStudyPlan()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_StudyPlan();

	/**
	 * Returns the meta object for the attribute '{@link course.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the container reference '{@link course.Student#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School</em>'.
	 * @see course.Student#getSchool()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_School();

	/**
	 * Returns the meta object for class '{@link course.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see course.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link course.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see course.StudyPlan#getSemesters()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Semesters();

	/**
	 * Returns the meta object for the reference '{@link course.StudyPlan#getStartingYear <em>Starting Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting Year</em>'.
	 * @see course.StudyPlan#getStartingYear()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_StartingYear();

	/**
	 * Returns the meta object for the reference '{@link course.StudyPlan#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization</em>'.
	 * @see course.StudyPlan#getSpecialization()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Specialization();

	/**
	 * Returns the meta object for the reference '{@link course.StudyPlan#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see course.StudyPlan#getStudent()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Student();

	/**
	 * Returns the meta object for class '{@link course.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see course.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see course.Specialization#getSemesters()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semesters();

	/**
	 * Returns the meta object for the container reference '{@link course.Specialization#getProgramYear <em>Program Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program Year</em>'.
	 * @see course.Specialization#getProgramYear()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_ProgramYear();

	/**
	 * Returns the meta object for class '{@link course.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see course.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link course.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see course.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link course.Semester#getSemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Type</em>'.
	 * @see course.Semester#getSemesterType()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterType();

	/**
	 * Returns the meta object for the attribute '{@link course.Semester#getTeachedInSemester <em>Teached In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teached In Semester</em>'.
	 * @see course.Semester#getTeachedInSemester()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_TeachedInSemester();

	/**
	 * Returns the meta object for class '{@link course.StudyPlanSemester <em>Study Plan Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan Semester</em>'.
	 * @see course.StudyPlanSemester
	 * @generated
	 */
	EClass getStudyPlanSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link course.StudyPlanSemester#getSelectedCourses <em>Selected Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Courses</em>'.
	 * @see course.StudyPlanSemester#getSelectedCourses()
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	EReference getStudyPlanSemester_SelectedCourses();

	/**
	 * Returns the meta object for the attribute '{@link course.StudyPlanSemester#getTotalCredits <em>Total Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credits</em>'.
	 * @see course.StudyPlanSemester#getTotalCredits()
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	EAttribute getStudyPlanSemester_TotalCredits();

	/**
	 * Returns the meta object for the container reference '{@link course.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study Plan</em>'.
	 * @see course.StudyPlanSemester#getStudyPlan()
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	EReference getStudyPlanSemester_StudyPlan();

	/**
	 * Returns the meta object for class '{@link course.ProgramSemester <em>Program Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Semester</em>'.
	 * @see course.ProgramSemester
	 * @generated
	 */
	EClass getProgramSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link course.ProgramSemester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory Courses</em>'.
	 * @see course.ProgramSemester#getMandatoryCourses()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EReference getProgramSemester_MandatoryCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link course.ProgramSemester#getOptionalCourses <em>Optional Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Courses</em>'.
	 * @see course.ProgramSemester#getOptionalCourses()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EReference getProgramSemester_OptionalCourses();

	/**
	 * Returns the meta object for enum '{@link course.SemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Type</em>'.
	 * @see course.SemesterType
	 * @generated
	 */
	EEnum getSemesterType();

	/**
	 * Returns the meta object for enum '{@link course.CourseLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see course.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Year</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getYear();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CourseFactory getCourseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link course.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.SchoolImpl
		 * @see course.impl.CoursePackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__PROGRAMS = eINSTANCE.getSchool_Programs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__NAME = eINSTANCE.getSchool_Name();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__STUDENTS = eINSTANCE.getSchool_Students();

		/**
		 * The meta object literal for the '{@link course.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.ProgramImpl
		 * @see course.impl.CoursePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Required Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__REQUIRED_CREDITS = eINSTANCE.getProgram_RequiredCredits();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SCHOOL = eINSTANCE.getProgram_School();

		/**
		 * The meta object literal for the '<em><b>Program Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PROGRAM_YEARS = eINSTANCE.getProgram_ProgramYears();

		/**
		 * The meta object literal for the '{@link course.impl.ProgramYearImpl <em>Program Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.ProgramYearImpl
		 * @see course.impl.CoursePackageImpl#getProgramYear()
		 * @generated
		 */
		EClass PROGRAM_YEAR = eINSTANCE.getProgramYear();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_YEAR__SPECIALIZATIONS = eINSTANCE.getProgramYear_Specializations();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_YEAR__SEMESTERS = eINSTANCE.getProgramYear_Semesters();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_YEAR__YEAR = eINSTANCE.getProgramYear_Year();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_YEAR__PROGRAM = eINSTANCE.getProgramYear_Program();

		/**
		 * The meta object literal for the '<em><b>Add Semester</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAM_YEAR___ADD_SEMESTER = eINSTANCE.getProgramYear__AddSemester();

		/**
		 * The meta object literal for the '<em><b>Add Specialization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAM_YEAR___ADD_SPECIALIZATION = eINSTANCE.getProgramYear__AddSpecialization();

		/**
		 * The meta object literal for the '{@link course.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.CourseImpl
		 * @see course.impl.CoursePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DESCRIPTION = eINSTANCE.getCourse_Description();

		/**
		 * The meta object literal for the '{@link course.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.StudentImpl
		 * @see course.impl.CoursePackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__STUDY_PLAN = eINSTANCE.getStudent_StudyPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__SCHOOL = eINSTANCE.getStudent_School();

		/**
		 * The meta object literal for the '{@link course.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.StudyPlanImpl
		 * @see course.impl.CoursePackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SEMESTERS = eINSTANCE.getStudyPlan_Semesters();

		/**
		 * The meta object literal for the '<em><b>Starting Year</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__STARTING_YEAR = eINSTANCE.getStudyPlan_StartingYear();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SPECIALIZATION = eINSTANCE.getStudyPlan_Specialization();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__STUDENT = eINSTANCE.getStudyPlan_Student();

		/**
		 * The meta object literal for the '{@link course.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.SpecializationImpl
		 * @see course.impl.CoursePackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTERS = eINSTANCE.getSpecialization_Semesters();

		/**
		 * The meta object literal for the '<em><b>Program Year</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PROGRAM_YEAR = eINSTANCE.getSpecialization_ProgramYear();

		/**
		 * The meta object literal for the '{@link course.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.SemesterImpl
		 * @see course.impl.CoursePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Semester Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_TYPE = eINSTANCE.getSemester_SemesterType();

		/**
		 * The meta object literal for the '<em><b>Teached In Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__TEACHED_IN_SEMESTER = eINSTANCE.getSemester_TeachedInSemester();

		/**
		 * The meta object literal for the '{@link course.impl.StudyPlanSemesterImpl <em>Study Plan Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.StudyPlanSemesterImpl
		 * @see course.impl.CoursePackageImpl#getStudyPlanSemester()
		 * @generated
		 */
		EClass STUDY_PLAN_SEMESTER = eINSTANCE.getStudyPlanSemester();

		/**
		 * The meta object literal for the '<em><b>Selected Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN_SEMESTER__SELECTED_COURSES = eINSTANCE.getStudyPlanSemester_SelectedCourses();

		/**
		 * The meta object literal for the '<em><b>Total Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PLAN_SEMESTER__TOTAL_CREDITS = eINSTANCE.getStudyPlanSemester_TotalCredits();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN_SEMESTER__STUDY_PLAN = eINSTANCE.getStudyPlanSemester_StudyPlan();

		/**
		 * The meta object literal for the '{@link course.impl.ProgramSemesterImpl <em>Program Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.ProgramSemesterImpl
		 * @see course.impl.CoursePackageImpl#getProgramSemester()
		 * @generated
		 */
		EClass PROGRAM_SEMESTER = eINSTANCE.getProgramSemester();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_SEMESTER__MANDATORY_COURSES = eINSTANCE.getProgramSemester_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Optional Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_SEMESTER__OPTIONAL_COURSES = eINSTANCE.getProgramSemester_OptionalCourses();

		/**
		 * The meta object literal for the '{@link course.SemesterType <em>Semester Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.SemesterType
		 * @see course.impl.CoursePackageImpl#getSemesterType()
		 * @generated
		 */
		EEnum SEMESTER_TYPE = eINSTANCE.getSemesterType();

		/**
		 * The meta object literal for the '{@link course.CourseLevel <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.CourseLevel
		 * @see course.impl.CoursePackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

		/**
		 * The meta object literal for the '<em>Year</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see course.impl.CoursePackageImpl#getYear()
		 * @generated
		 */
		EDataType YEAR = eINSTANCE.getYear();

	}

} //CoursePackage
