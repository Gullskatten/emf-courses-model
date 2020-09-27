/**
 */
package course.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>CoursesGenMod</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoursesGenModAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CoursesGenModAllTests("CoursesGenMod Tests");
		suite.addTest(CourseTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursesGenModAllTests(String name) {
		super(name);
	}

} //CoursesGenModAllTests
