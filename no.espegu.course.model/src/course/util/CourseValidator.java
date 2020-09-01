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
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final CourseValidator INSTANCE = new CourseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource()
	 * source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode()
	 * codes} from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * Returns the package of this validator switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
		case CoursePackage.SPECIALIZATION_SEMESTER:
			return validateSpecializationSemester((SpecializationSemester) value, diagnostics, context);
		case CoursePackage.SEMESTER_TYPE:
			return validateSemesterType((SemesterType) value, diagnostics, context);
		case CoursePackage.COURSE_LEVEL:
			return validateCourseLevel((CourseLevel) value, diagnostics, context);
		case CoursePackage.YEAR:
			return validateYear((Integer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSchool(School school, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(school, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateProgramYear(ProgramYear programYear, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programYear, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyPlan, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStudyPlan_hasRequiredCreditsForSpecialization(studyPlan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasRequiredCreditsForSpecialization constraint of '<em>Study
	 * Plan</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateStudyPlan_hasRequiredCreditsForSpecialization(StudyPlan studyPlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		// If a student has not specified a specialization,
		// e.g. the student is taking "single courses" (enkeltemner),
		// then specialization should not be validated.
		if (studyPlan.getSpecialization() == null) {
			return true;
		}

		int requiredCredits = studyPlan.getSpecialization().getStartingYear().getProgram().getRequiredCredits();

		int totalCredits = 0;

		for (StudyPlanSemester semester : studyPlan.getSemesters()) {
			totalCredits += semester.getTotalCredits();
		}

		if (requiredCredits != totalCredits) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "hasRequiredCreditsForSpecialization", getObjectLabel(studyPlan, context) },
						new Object[] { studyPlan }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStudyPlanSemester(StudyPlanSemester studyPlanSemester, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlanSemester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSpecializationSemester(SpecializationSemester specializationSemester,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specializationSemester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateYear(Integer year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this
		// validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // CourseValidator
