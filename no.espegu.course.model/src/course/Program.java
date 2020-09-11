/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Program#getName <em>Name</em>}</li>
 *   <li>{@link course.Program#getRequiredCredits <em>Required Credits</em>}</li>
 *   <li>{@link course.Program#getSchool <em>School</em>}</li>
 *   <li>{@link course.Program#getProgramYears <em>Program Years</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course.CoursePackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Credits</em>' attribute.
	 * @see #setRequiredCredits(Float)
	 * @see course.CoursePackage#getProgram_RequiredCredits()
	 * @model dataType="course.PositiveFloatNumber"
	 * @generated
	 */
	Float getRequiredCredits();

	/**
	 * Sets the value of the '{@link course.Program#getRequiredCredits <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Credits</em>' attribute.
	 * @see #getRequiredCredits()
	 * @generated
	 */
	void setRequiredCredits(Float value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.School#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see course.CoursePackage#getProgram_School()
	 * @see course.School#getPrograms
	 * @model opposite="programs" transient="false"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link course.Program#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

	/**
	 * Returns the value of the '<em><b>Program Years</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramYear}.
	 * It is bidirectional and its opposite is '{@link course.ProgramYear#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Years</em>' containment reference list.
	 * @see course.CoursePackage#getProgram_ProgramYears()
	 * @see course.ProgramYear#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<ProgramYear> getProgramYears();

} // Program
