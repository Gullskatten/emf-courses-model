/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.ProgramDirection#getName <em>Name</em>}</li>
 *   <li>{@link course.ProgramDirection#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.ProgramDirection#getChosenInSemester <em>Chosen In Semester</em>}</li>
 *   <li>{@link course.ProgramDirection#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getProgramDirection()
 * @model
 * @generated
 */
public interface ProgramDirection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course.CoursePackage#getProgramDirection_Name()
	 * @model derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.ProgramDirection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramSemester}.
	 * It is bidirectional and its opposite is '{@link course.ProgramSemester#getParentProgramDirection <em>Parent Program Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getProgramDirection_Semesters()
	 * @see course.ProgramSemester#getParentProgramDirection
	 * @model opposite="parentProgramDirection" containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Chosen In Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.ProgramSemester#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen In Semester</em>' container reference.
	 * @see #setChosenInSemester(ProgramSemester)
	 * @see course.CoursePackage#getProgramDirection_ChosenInSemester()
	 * @see course.ProgramSemester#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	ProgramSemester getChosenInSemester();

	/**
	 * Sets the value of the '{@link course.ProgramDirection#getChosenInSemester <em>Chosen In Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen In Semester</em>' container reference.
	 * @see #getChosenInSemester()
	 * @generated
	 */
	void setChosenInSemester(ProgramSemester value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #isSetProgram()
	 * @see course.CoursePackage#getProgramDirection_Program()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Returns whether the value of the '{@link course.ProgramDirection#getProgram <em>Program</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Program</em>' reference is set.
	 * @see #getProgram()
	 * @generated
	 */
	boolean isSetProgram();

} // ProgramDirection
