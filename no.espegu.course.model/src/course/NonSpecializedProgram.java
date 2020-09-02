/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Specialized Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.NonSpecializedProgram#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.NonSpecializedProgram#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.NonSpecializedProgram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getNonSpecializedProgram()
 * @model
 * @generated
 */
public interface NonSpecializedProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getNonSpecializedProgram_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link course.ProgramYear#getNonSpecializedProgram <em>Non Specialized Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' reference.
	 * @see #setProgramYear(ProgramYear)
	 * @see course.CoursePackage#getNonSpecializedProgram_ProgramYear()
	 * @see course.ProgramYear#getNonSpecializedProgram
	 * @model opposite="nonSpecializedProgram"
	 * @generated
	 */
	ProgramYear getProgramYear();

	/**
	 * Sets the value of the '{@link course.NonSpecializedProgram#getProgramYear <em>Program Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Year</em>' reference.
	 * @see #getProgramYear()
	 * @generated
	 */
	void setProgramYear(ProgramYear value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see course.CoursePackage#getNonSpecializedProgram_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link course.NonSpecializedProgram#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // NonSpecializedProgram
