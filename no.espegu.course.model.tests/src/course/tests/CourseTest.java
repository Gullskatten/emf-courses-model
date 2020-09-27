/**
 */
package course.tests;

import org.junit.Assert;

import course.Course;
import course.CourseFactory;
import course.CourseLevel;
import course.SemesterType;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link course.Course#isSameCourse(course.Course) <em>Is Same Course</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CourseTest extends TestCase {

	/**
	 * The fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Course fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseTest.class);
	}

	/**
	 * Constructs a new Course test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Course fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Course getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CourseFactory.eINSTANCE.createCourse());
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

	/**
	 * Tests the '{@link course.Course#isSameCourse(course.Course) <em>Is Same Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 *  Test to verify that two courses are equal if they share the same degree level, name and code
	 * <!-- end-user-doc -->
	 * @see course.Course#isSameCourse(course.Course)
	 * @generated NOT
	 */
	public void testIsSameCourse__Course() {
		final String name = "Avansert Programvaredesign";
		final String code = "TDT4252";
		final CourseLevel level = CourseLevel.HIGHER_DEGREE;
		
		Course aCourse = CourseFactory.eINSTANCE.createCourse();
		
		fixture.setCode(code);
		fixture.setName(name);
		fixture.setLevel(level);
		
		aCourse.setCode(code);
		aCourse.setLevel(level);
		aCourse.setName(name);
		
		Assert.assertTrue(aCourse.isSameCourse(fixture));
		
		// Different taught in semester should not affect course comparison
		fixture.setTaughtInSemester(SemesterType.AUTUMN);
		aCourse.setTaughtInSemester(SemesterType.SPRING);
		Assert.assertTrue(aCourse.isSameCourse(fixture));
		
		// Different credits should not affect course comparison
		fixture.setCredits(15.0f);
		aCourse.setCredits(6.5f);
		Assert.assertTrue(aCourse.isSameCourse(fixture));
		
		// Different names should affect course comparison
		aCourse.setName(name + "_new");
		Assert.assertFalse(aCourse.isSameCourse(fixture));
		aCourse.setName(name);
		
		// Different codes should affect course comparison
		aCourse.setCode(code + "_new");
		Assert.assertFalse(aCourse.isSameCourse(fixture));
		aCourse.setCode(code);
		
		// Different levels should affect course comparison
		aCourse.setLevel(CourseLevel.FIRST_DEGREE);
		Assert.assertFalse(aCourse.isSameCourse(fixture));
	}

} //CourseTest
