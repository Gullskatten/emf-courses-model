/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable Program Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.SelectableProgramSpecialization#getName <em>Name</em>}</li>
 *   <li>{@link course.SelectableProgramSpecialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.SelectableProgramSpecialization#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.SelectableProgramSpecialization#getSubSpecializations <em>Sub Specializations</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getSelectableProgramSpecialization()
 * @model
 * @generated
 */
public interface SelectableProgramSpecialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see course.CoursePackage#getSelectableProgramSpecialization_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link course.SelectableProgramSpecialization#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getSelectableProgramSpecialization_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.ProgramYear#getSelectablePrograms <em>Selectable Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' container reference.
	 * @see #setProgramYear(ProgramYear)
	 * @see course.CoursePackage#getSelectableProgramSpecialization_ProgramYear()
	 * @see course.ProgramYear#getSelectablePrograms
	 * @model opposite="selectablePrograms" transient="false"
	 * @generated
	 */
	ProgramYear getProgramYear();

	/**
	 * Sets the value of the '{@link course.SelectableProgramSpecialization#getProgramYear <em>Program Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Year</em>' container reference.
	 * @see #getProgramYear()
	 * @generated
	 */
	void setProgramYear(ProgramYear value);

	/**
	 * Returns the value of the '<em><b>Sub Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link course.SelectableProgramSpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specializations</em>' containment reference list.
	 * @see course.CoursePackage#getSelectableProgramSpecialization_SubSpecializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectableProgramSpecialization> getSubSpecializations();

} // SelectableProgramSpecialization
