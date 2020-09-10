/**
 */
package course;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.StudyPlanSemester#getSelectedCourses <em>Selected Courses</em>}</li>
 *   <li>{@link course.StudyPlanSemester#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link course.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link course.StudyPlanSemester#getRelatedProgramSemester <em>Related Program Semester</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getStudyPlanSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isAllCoursesTaughtThisSemester isValidRelatedProgramSemester'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 isAllCoursesTaughtThisSemester='self.selectedCourses -&gt; collect(selectedCourse | selectedCourse.taughtInSemester) -&gt; forAll(semester | semester == self.semesterType)'"
 * @generated
 */
public interface StudyPlanSemester extends Semester {
	/**
	 * Returns the value of the '<em><b>Selected Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Courses</em>' containment reference list.
	 * @see course.CoursePackage#getStudyPlanSemester_SelectedCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getSelectedCourses();

	/**
	 * Returns the value of the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits</em>' attribute.
	 * @see #isSetTotalCredits()
	 * @see course.CoursePackage#getStudyPlanSemester_TotalCredits()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getTotalCredits();

	/**
	 * Returns whether the value of the '{@link course.StudyPlanSemester#getTotalCredits <em>Total Credits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Credits</em>' attribute is set.
	 * @see #getTotalCredits()
	 * @generated
	 */
	boolean isSetTotalCredits();

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see course.CoursePackage#getStudyPlanSemester_StudyPlan()
	 * @see course.StudyPlan#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link course.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

	/**
	 * Returns the value of the '<em><b>Related Program Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Program Semester</em>' reference.
	 * @see #setRelatedProgramSemester(ProgramSemester)
	 * @see course.CoursePackage#getStudyPlanSemester_RelatedProgramSemester()
	 * @model required="true"
	 * @generated
	 */
	ProgramSemester getRelatedProgramSemester();

	/**
	 * Sets the value of the '{@link course.StudyPlanSemester#getRelatedProgramSemester <em>Related Program Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Program Semester</em>' reference.
	 * @see #getRelatedProgramSemester()
	 * @generated
	 */
	void setRelatedProgramSemester(ProgramSemester value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="course.CourseAlreadyExistsException"
	 * @generated
	 */
	StudyPlanSemester addCourseToSemester(Course course) throws RuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getAllCoursesInSemester();

} // StudyPlanSemester
