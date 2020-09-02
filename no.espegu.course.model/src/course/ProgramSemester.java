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
 *   <li>{@link course.ProgramSemester#getOptionalCourses <em>Optional Courses</em>}</li>
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
	 * Returns the value of the '<em><b>Optional Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Courses</em>' containment reference list.
	 * @see course.CoursePackage#getProgramSemester_OptionalCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getOptionalCourses();

} // ProgramSemester
