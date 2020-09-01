/**
 */
package course.tests;

import course.CourseFactory;
import course.StudyPlanSemester;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Plan Semester</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyPlanSemesterTest extends SemesterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyPlanSemesterTest.class);
	}

	/**
	 * Constructs a new Study Plan Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlanSemesterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Study Plan Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StudyPlanSemester getFixture() {
		return (StudyPlanSemester)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CourseFactory.eINSTANCE.createStudyPlanSemester());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StudyPlanSemesterTest
