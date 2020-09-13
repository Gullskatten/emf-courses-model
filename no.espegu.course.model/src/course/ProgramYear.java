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
 *   <li>{@link course.ProgramYear#getProgram <em>Program</em>}</li>
 *   <li>{@link course.ProgramYear#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getProgramYear()
 * @model
 * @generated
 */
public interface ProgramYear extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * The default value is <code>"2020"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see course.CoursePackage#getProgramYear_Year()
	 * @model default="2020" dataType="course.Year"
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link course.ProgramYear#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

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
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramSemester}.
	 * It is bidirectional and its opposite is '{@link course.ProgramSemester#getProgramYear <em>Program Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getProgramYear_Semesters()
	 * @see course.ProgramSemester#getProgramYear
	 * @model opposite="programYear" containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

} // ProgramYear
