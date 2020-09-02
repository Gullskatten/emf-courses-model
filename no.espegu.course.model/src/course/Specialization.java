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
 *   <li>{@link course.Specialization#getProgramYear <em>Program Year</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getSpecialization_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.ProgramYear#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' container reference.
	 * @see #setProgramYear(ProgramYear)
	 * @see course.CoursePackage#getSpecialization_ProgramYear()
	 * @see course.ProgramYear#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	ProgramYear getProgramYear();

	/**
	 * Sets the value of the '{@link course.Specialization#getProgramYear <em>Program Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Year</em>' container reference.
	 * @see #getProgramYear()
	 * @generated
	 */
	void setProgramYear(ProgramYear value);

} // Specialization
