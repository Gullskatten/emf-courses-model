/**
 */
package course.util;

import course.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see course.CoursePackage
 * @generated
 */
public class CourseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final CourseValidator INSTANCE = new CourseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "course";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public CourseValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CoursePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CoursePackage.SCHOOL:
			return validateSchool((School) value, diagnostics, context);
		case CoursePackage.PROGRAM:
			return validateProgram((Program) value, diagnostics, context);
		case CoursePackage.PROGRAM_YEAR:
			return validateProgramYear((ProgramYear) value, diagnostics, context);
		case CoursePackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case CoursePackage.STUDENT:
			return validateStudent((Student) value, diagnostics, context);
		case CoursePackage.STUDY_PLAN:
			return validateStudyPlan((StudyPlan) value, diagnostics, context);
		case CoursePackage.SPECIALIZATION:
			return validateSpecialization((Specialization) value, diagnostics, context);
		case CoursePackage.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case CoursePackage.STUDY_PLAN_SEMESTER:
			return validateStudyPlanSemester((StudyPlanSemester) value, diagnostics, context);
		case CoursePackage.PROGRAM_SEMESTER:
			return validateProgramSemester((ProgramSemester) value, diagnostics, context);
		case CoursePackage.SEMESTER_TYPE:
			return validateSemesterType((SemesterType) value, diagnostics, context);
		case CoursePackage.COURSE_LEVEL:
			return validateCourseLevel((CourseLevel) value, diagnostics, context);
		case CoursePackage.YEAR:
			return validateYear((String) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchool(School school, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(school, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramYear(ProgramYear programYear, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programYear, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectableProgramSpecialization(SelectableProgramSpecialization selectableProgramSpecialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectableProgramSpecialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyPlan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyPlan_hasRequiredCreditsForProgram(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyPlan_hasAllMandatoryCourses(studyPlan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasRequiredCreditsForProgram constraint of '<em>Study Plan</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStudyPlan_hasRequiredCreditsForProgram(StudyPlan studyPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasRequiredCreditsForProgram", getObjectLabel(studyPlan, context) },
						 new Object[] { studyPlan },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasAllMandatoryCourses constraint of '<em>Study Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan_hasAllMandatoryCourses(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasAllMandatoryCourses", getObjectLabel(studyPlan, context) },
						 new Object[] { studyPlan },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlanSemester(StudyPlanSemester studyPlanSemester, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyPlanSemester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyPlanSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyPlanSemester_isAllCoursesTaughtThisSemester(studyPlanSemester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isAllCoursesTaughtThisSemester constraint of '<em>Study Plan Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STUDY_PLAN_SEMESTER__IS_ALL_COURSES_TAUGHT_THIS_SEMESTER__EEXPRESSION = "aql:self.selectedCourses -> collect(selectedCourse | selectedCourse.taughtInSemester) -> forAll(semester | semester == self.semesterType)";

	/**
	 * Validates the isAllCoursesTaughtThisSemester constraint of '<em>Study Plan Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlanSemester_isAllCoursesTaughtThisSemester(StudyPlanSemester studyPlanSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CoursePackage.Literals.STUDY_PLAN_SEMESTER,
				 studyPlanSemester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "isAllCoursesTaughtThisSemester",
				 STUDY_PLAN_SEMESTER__IS_ALL_COURSES_TAUGHT_THIS_SEMESTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the isAllCoursesTaughtInSemester constraint of '<em>Study Plan
	 * Semester</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateStudyPlanSemester_isAllCoursesTaughtInSemester(StudyPlanSemester studyPlanSemester,
			DiagnosticChain diagnostics, Map<Object, Object> context) {		
		
		SemesterType currentTeachingSemester = studyPlanSemester.getSemesterType();
		
		// Validate that each course is taught in the current semester
		for(Course selectedCourse : studyPlanSemester.getSelectedCourses()) {
			if(currentTeachingSemester != selectedCourse.getTaughtInSemester()) {
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(
							Diagnostic.ERROR, 
							DIAGNOSTIC_SOURCE, 
							0,
							"_UI_GenericConstraint_diagnostic",
							new Object[] { "isAllCoursesTaughtInSemester", getObjectLabel(studyPlanSemester, context) },
							new Object[] { studyPlanSemester }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramSemester(ProgramSemester programSemester, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programSemester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType semesterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(String year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateYear_hasCorrectYearLength(year, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasCorrectYearLength constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String YEAR__HAS_CORRECT_YEAR_LENGTH__EEXPRESSION = "aql:self.year.toLower() == 'default' or self.year.size() == 4";

	/**
	 * Validates the hasCorrectYearLength constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_hasCorrectYearLength(String year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CoursePackage.Literals.YEAR,
				 year,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "hasCorrectYearLength",
				 YEAR__HAS_CORRECT_YEAR_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCredit(Float courseCredit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCourseCredit_isGreaterOrEqualToZero(courseCredit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isGreaterOrEqualToZero constraint of '<em>Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE_CREDIT__IS_GREATER_OR_EQUAL_TO_ZERO__EEXPRESSION = "aql:self >= 0";

	/**
	 * Validates the isGreaterOrEqualToZero constraint of '<em>Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCredit_isGreaterOrEqualToZero(Float courseCredit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CoursePackage.Literals.COURSE_CREDIT,
				 courseCredit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "isGreaterOrEqualToZero",
				 COURSE_CREDIT__IS_GREATER_OR_EQUAL_TO_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // CourseValidator
