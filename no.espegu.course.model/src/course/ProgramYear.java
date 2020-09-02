/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.ProgramYear#getYear <em>Year</em>}</li>
 *   <li>{@link course.ProgramYear#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link course.ProgramYear#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.ProgramYear#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getProgramYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasEitherSpecializationOrSemester'"
 * @generated
 */
public interface ProgramYear extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link course.Specialization}.
	 * It is bidirectional and its opposite is '{@link course.Specialization#getProgramYear <em>Program Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see course.CoursePackage#getProgramYear_Specializations()
	 * @see course.Specialization#getProgramYear
	 * @model opposite="programYear" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getProgramYear_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(Integer)
	 * @see course.CoursePackage#getProgramYear_Year()
	 * @model dataType="course.Year"
	 * @generated
	 */
	Integer getYear();

	/**
	 * Sets the value of the '{@link course.ProgramYear#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Program#getProgramYears <em>Program Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see course.CoursePackage#getProgramYear_Program()
	 * @see course.Program#getProgramYears
	 * @model opposite="programYears" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link course.ProgramYear#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ProgramSemester addSemester();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Specialization addSpecialization();

} // ProgramYear
