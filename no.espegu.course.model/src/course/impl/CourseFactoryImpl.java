/**
 */
package course.impl;

import course.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseFactoryImpl extends EFactoryImpl implements CourseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CourseFactory init() {
		try {
			CourseFactory theCourseFactory = (CourseFactory)EPackage.Registry.INSTANCE.getEFactory(CoursePackage.eNS_URI);
			if (theCourseFactory != null) {
				return theCourseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CourseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoursePackage.SCHOOL: return createSchool();
			case CoursePackage.PROGRAM: return createProgram();
			case CoursePackage.COURSE: return createCourse();
			case CoursePackage.STUDENT: return createStudent();
			case CoursePackage.STUDY_PLAN: return createStudyPlan();
			case CoursePackage.PROGRAM_DIRECTION: return createProgramDirection();
			case CoursePackage.STUDY_PLAN_SEMESTER: return createStudyPlanSemester();
			case CoursePackage.PROGRAM_SEMESTER: return createProgramSemester();
			case CoursePackage.PROGRAM_YEAR: return createProgramYear();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CoursePackage.SEMESTER_TYPE:
				return createSemesterTypeFromString(eDataType, initialValue);
			case CoursePackage.COURSE_LEVEL:
				return createCourseLevelFromString(eDataType, initialValue);
			case CoursePackage.YEAR:
				return createYearFromString(eDataType, initialValue);
			case CoursePackage.POSITIVE_FLOAT_NUMBER:
				return createPositiveFloatNumberFromString(eDataType, initialValue);
			case CoursePackage.COURSE_ALREADY_EXISTS_EXCEPTION:
				return createCourseAlreadyExistsExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CoursePackage.SEMESTER_TYPE:
				return convertSemesterTypeToString(eDataType, instanceValue);
			case CoursePackage.COURSE_LEVEL:
				return convertCourseLevelToString(eDataType, instanceValue);
			case CoursePackage.YEAR:
				return convertYearToString(eDataType, instanceValue);
			case CoursePackage.POSITIVE_FLOAT_NUMBER:
				return convertPositiveFloatNumberToString(eDataType, instanceValue);
			case CoursePackage.COURSE_ALREADY_EXISTS_EXCEPTION:
				return convertCourseAlreadyExistsExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public School createSchool() {
		SchoolImpl school = new SchoolImpl();
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan createStudyPlan() {
		StudyPlanImpl studyPlan = new StudyPlanImpl();
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramDirection createProgramDirection() {
		ProgramDirectionImpl programDirection = new ProgramDirectionImpl();
		return programDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlanSemester createStudyPlanSemester() {
		StudyPlanSemesterImpl studyPlanSemester = new StudyPlanSemesterImpl();
		return studyPlanSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramSemester createProgramSemester() {
		ProgramSemesterImpl programSemester = new ProgramSemesterImpl();
		return programSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramYear createProgramYear() {
		ProgramYearImpl programYear = new ProgramYearImpl();
		return programYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterType createSemesterTypeFromString(EDataType eDataType, String initialValue) {
		SemesterType result = SemesterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseLevel createCourseLevelFromString(EDataType eDataType, String initialValue) {
		CourseLevel result = CourseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createYearFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYearToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPositiveFloatNumberFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveFloatNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeException createCourseAlreadyExistsExceptionFromString(EDataType eDataType, String initialValue) {
		return (RuntimeException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseAlreadyExistsExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoursePackage getCoursePackage() {
		return (CoursePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoursePackage getPackage() {
		return CoursePackage.eINSTANCE;
	}

} //CourseFactoryImpl
