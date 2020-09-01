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
 * </ul>
 *
 * @see course.CoursePackage#getStudyPlanSemester()
 * @model
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
	 * @see #setTotalCredits(int)
	 * @see course.CoursePackage#getStudyPlanSemester_TotalCredits()
	 * @model
	 * @generated
	 */
	int getTotalCredits();

	/**
	 * Sets the value of the '{@link course.StudyPlanSemester#getTotalCredits <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credits</em>' attribute.
	 * @see #getTotalCredits()
	 * @generated
	 */
	void setTotalCredits(int value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see course.CoursePackage#getStudyPlanSemester_StudyPlan()
	 * @see course.StudyPlan#getSemesters
	 * @model opposite="semesters" transient="false"
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

} // StudyPlanSemester
