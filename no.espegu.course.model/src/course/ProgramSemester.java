/**
 */
package course;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.ProgramSemester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link course.ProgramSemester#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link course.ProgramSemester#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link course.ProgramSemester#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.ProgramSemester#getParentProgramDirection <em>Parent Program Direction</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getProgramSemester()
 * @model
 * @generated
 */
public interface ProgramSemester extends Semester {
	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference list.
	 * @see course.CoursePackage#getProgramSemester_MandatoryCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' containment reference list.
	 * @see course.CoursePackage#getProgramSemester_ElectiveCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getElectiveCourses();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link course.ProgramDirection}.
	 * It is bidirectional and its opposite is '{@link course.ProgramDirection#getChosenInSemester <em>Chosen In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see course.CoursePackage#getProgramSemester_Specializations()
	 * @see course.ProgramDirection#getChosenInSemester
	 * @model opposite="chosenInSemester" containment="true"
	 * @generated
	 */
	EList<ProgramDirection> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.ProgramYear#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' container reference.
	 * @see #setProgramYear(ProgramYear)
	 * @see course.CoursePackage#getProgramSemester_ProgramYear()
	 * @see course.ProgramYear#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	ProgramYear getProgramYear();

	/**
	 * Sets the value of the '{@link course.ProgramSemester#getProgramYear <em>Program Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Year</em>' container reference.
	 * @see #getProgramYear()
	 * @generated
	 */
	void setProgramYear(ProgramYear value);

	/**
	 * Returns the value of the '<em><b>Parent Program Direction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.ProgramDirection#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Program Direction</em>' container reference.
	 * @see #setParentProgramDirection(ProgramDirection)
	 * @see course.CoursePackage#getProgramSemester_ParentProgramDirection()
	 * @see course.ProgramDirection#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	ProgramDirection getParentProgramDirection();

	/**
	 * Sets the value of the '{@link course.ProgramSemester#getParentProgramDirection <em>Parent Program Direction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Program Direction</em>' container reference.
	 * @see #getParentProgramDirection()
	 * @generated
	 */
	void setParentProgramDirection(ProgramDirection value);

} // ProgramSemester
