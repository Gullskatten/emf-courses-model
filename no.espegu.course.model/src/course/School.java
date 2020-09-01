/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.School#getPrograms <em>Programs</em>}</li>
 *   <li>{@link course.School#getName <em>Name</em>}</li>
 *   <li>{@link course.School#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link course.Program}.
	 * It is bidirectional and its opposite is '{@link course.Program#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see course.CoursePackage#getSchool_Programs()
	 * @see course.Program#getSchool
	 * @model opposite="school" containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course.CoursePackage#getSchool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.School#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link course.Student}.
	 * It is bidirectional and its opposite is '{@link course.Student#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see course.CoursePackage#getSchool_Students()
	 * @see course.Student#getSchool
	 * @model opposite="school" containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

} // School
