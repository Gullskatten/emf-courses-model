/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Course#getName <em>Name</em>}</li>
 *   <li>{@link course.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link course.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link course.Course#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course.CoursePackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see course.CoursePackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link course.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"First Degree Subject"</code>.
	 * The literals are from the enumeration {@link course.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see course.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see course.CoursePackage#getCourse_Level()
	 * @model default="First Degree Subject"
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link course.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see course.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Add a description to this course."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see course.CoursePackage#getCourse_Description()
	 * @model default="Add a description to this course."
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link course.Course#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Course
