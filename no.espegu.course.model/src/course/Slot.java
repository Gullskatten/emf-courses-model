/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Slot#getAvailableCourses <em>Available Courses</em>}</li>
 *   <li>{@link course.Slot#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link course.Slot#getRequiredCredits <em>Required Credits</em>}</li>
 *   <li>{@link course.Slot#getSelectedCoursesInSlot <em>Selected Courses In Slot</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Courses</em>' containment reference list.
	 * @see course.CoursePackage#getSlot_AvailableCourses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getAvailableCourses();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #isSetMandatory()
	 * @see course.CoursePackage#getSlot_Mandatory()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Returns whether the value of the '{@link course.Slot#isMandatory <em>Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mandatory</em>' attribute is set.
	 * @see #isMandatory()
	 * @generated
	 */
	boolean isSetMandatory();

	/**
	 * Returns the value of the '<em><b>Required Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Credits</em>' attribute.
	 * @see #setRequiredCredits(float)
	 * @see course.CoursePackage#getSlot_RequiredCredits()
	 * @model
	 * @generated
	 */
	float getRequiredCredits();

	/**
	 * Sets the value of the '{@link course.Slot#getRequiredCredits <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Credits</em>' attribute.
	 * @see #getRequiredCredits()
	 * @generated
	 */
	void setRequiredCredits(float value);

	/**
	 * Returns the value of the '<em><b>Selected Courses In Slot</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Courses In Slot</em>' containment reference list.
	 * @see course.CoursePackage#getSlot_SelectedCoursesInSlot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getSelectedCoursesInSlot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="course.CourseAlreadyExistsException"
	 * @generated
	 */
	Slot addCourseToSlot(Course course) throws RuntimeException;

} // Slot
