/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.Specialization#getStartingYear <em>Starting Year</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.SpecializationSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getSpecialization_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecializationSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Starting Year</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Year</em>' reference.
	 * @see #setStartingYear(ProgramYear)
	 * @see course.CoursePackage#getSpecialization_StartingYear()
	 * @model
	 * @generated
	 */
	ProgramYear getStartingYear();

	/**
	 * Sets the value of the '{@link course.Specialization#getStartingYear <em>Starting Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Year</em>' reference.
	 * @see #getStartingYear()
	 * @generated
	 */
	void setStartingYear(ProgramYear value);

} // Specialization
