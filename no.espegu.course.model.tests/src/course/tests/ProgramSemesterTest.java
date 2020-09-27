/**
 */
package course.tests;

import org.junit.Assert;

import course.CourseFactory;
import course.ProgramSemester;
import course.SemesterType;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link course.Semester#getTeachedInSemester() <em>Teached In Semester</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProgramSemesterTest extends TestCase {

	/**
	 * The fixture for this Program Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramSemesterTest.class);
	}

	/**
	 * Constructs a new Program Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgramSemester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemester getFixture() {
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
		setFixture(CourseFactory.eINSTANCE.createProgramSemester());
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
	 * Tests the '{@link course.Semester#getTeachedInSemester() <em>Teached In Semester</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Semester#getTeachedInSemester()
	 * @generated NOT
	 */
	public void testGetTeachedInSemester() {
		fixture.setSemesterType(SemesterType.AUTUMN);
		
		Assert.assertTrue(SemesterType.AUTUMN.getLiteral().equals(fixture.getTeachedInSemester()));
		
		fixture.setSemesterType(null);
		
		Assert.assertTrue(fixture.getTeachedInSemester().isEmpty());
		
		fixture.setSemesterType(SemesterType.SPRING);
		Assert.assertTrue(SemesterType.SPRING.getLiteral().equals(fixture.getTeachedInSemester()));
		
	}

	/**
	 * Tests the '{@link course.Semester#isSetTeachedInSemester() <em>isSetTeachedInSemester()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Semester#isSetTeachedInSemester()
	 * @generated NOT 
	 */
	public void testIsSetTeachedInSemester() {
		// Teached in semester should never return 'null' (only empty string if not set).
		Assert.assertTrue(fixture.getTeachedInSemester() != null);
	}

} //ProgramSemesterTest
