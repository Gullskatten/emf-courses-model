/**
 */
package course.tests;

import org.junit.Assert;
import org.junit.Test;

import course.Course;
import course.CourseFactory;
import course.ProgramSemester;
import course.Slot;
import course.StudyPlan;
import course.StudyPlanSemester;
import course.tests.util.TestObjectInitializer;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link course.StudyPlan#getTotalCredits() <em>Total Credits</em>}</li>
 * </ul>
 * </p>
 * @generated NOT
 */
public class StudyPlanTest extends TestCase {

	/**
	 * The fixture for this Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyPlanTest.class);
	}

	/**
	 * Constructs a new Study Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyPlan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlan getFixture() {
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
		setFixture(CourseFactory.eINSTANCE.createStudyPlan());
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
	 * Tests the '{@link course.StudyPlan#getTotalCredits() <em>Total Credits</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 *  Verify that getTotalCredits() adds all course credits (from all semesters).
	 * <!-- end-user-doc -->
	 * @see course.StudyPlan#getTotalCredits()
	 * @generated NOT
	 */
	public void testGetTotalCredits() {
		final float courseCredits = 30.0f;
		
		// Given that we add 10 semesters with the same course in the study plan
		// the total credits should sum all semester courses together
		for(int i = 1; i <= 10; i++) {
			StudyPlanSemester aSemester = CourseFactory.eINSTANCE.createStudyPlanSemester();
			Course aCourse = TestObjectInitializer.createAnyCourse(CourseFactory.eINSTANCE);
			aCourse.setCredits(courseCredits);
			ProgramSemester relatedProgram = CourseFactory.eINSTANCE.createProgramSemester();
			Slot aCourseSlot = CourseFactory.eINSTANCE.createSlot();
			aCourseSlot.getAvailableCourses().add(aCourse);
			relatedProgram.getSlots().add(aCourseSlot);
			aSemester.setRelatedProgramSemester(relatedProgram);
			fixture.getSemesters().add(aSemester);
			Assert.assertTrue(fixture.getTotalCredits() == courseCredits * i);
		}
		
		// Clear the list of semesters
		fixture.getSemesters().clear();
		
		// Given that we add mandatory courses in to a related program semester
		// This should count towards the total credits (having 0 selected courses per semester)
		for(int i = 1; i <= 10; i++) {
			StudyPlanSemester aSemester = CourseFactory.eINSTANCE.createStudyPlanSemester();
			
			Course aCourse = TestObjectInitializer.createAnyCourse(CourseFactory.eINSTANCE);
			aCourse.setCredits(courseCredits);
			
			ProgramSemester aRelatedProgramSemester = CourseFactory.eINSTANCE.createProgramSemester();
			Slot aMandatoryCourseSlot = CourseFactory.eINSTANCE.createSlot();
			aMandatoryCourseSlot.getAvailableCourses().add(aCourse);
			aRelatedProgramSemester.getSlots().add(aMandatoryCourseSlot);
			
			aSemester.setRelatedProgramSemester(aRelatedProgramSemester);
			
			fixture.getSemesters().add(aSemester);
			Assert.assertTrue(fixture.getTotalCredits() == courseCredits * i);
		}			
	}


	/**
	 * Tests the '{@link course.StudyPlan#isSetTotalCredits() <em>isSetTotalCredits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.StudyPlan#isSetTotalCredits()
	 * @generated NOT
	 */
	public void testIsSetTotalCredits() {
		// Semesters should be empty when starting this test
		Assert.assertTrue(fixture.getSemesters().isEmpty());
		
		// If no semesters are added, total credits is not set
		Assert.assertFalse(fixture.isSetTotalCredits());
		
		StudyPlanSemester aSemesterWithoutCourses = CourseFactory.eINSTANCE.createStudyPlanSemester();
		
		
		fixture.getSemesters().add(aSemesterWithoutCourses);
		
		// If semester has no courses with credits, total credits is not set
		Assert.assertFalse(fixture.isSetTotalCredits());
		
		StudyPlanSemester aSemesterWithCourses = CourseFactory.eINSTANCE.createStudyPlanSemester();
		Course aCourse = TestObjectInitializer.createAnyCourse(CourseFactory.eINSTANCE);
		aCourse.setCredits(30.0f);
		ProgramSemester relatedProgram = CourseFactory.eINSTANCE.createProgramSemester();
		Slot aCourseSlot = CourseFactory.eINSTANCE.createSlot();
		aCourseSlot.getAvailableCourses().add(aCourse);
		relatedProgram.getSlots().add(aCourseSlot);
		aSemesterWithCourses.setRelatedProgramSemester(relatedProgram);
		fixture.getSemesters().add(aSemesterWithCourses);
		
		// If semester added to study plan has courses with credits, total credits is set
		Assert.assertTrue(fixture.isSetTotalCredits());
	}

} //StudyPlanTest
