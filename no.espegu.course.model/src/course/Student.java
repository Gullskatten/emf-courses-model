/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Student#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link course.Student#getName <em>Name</em>}</li>
 *   <li>{@link course.Student#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link course.StudyPlan#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see course.CoursePackage#getStudent_StudyPlan()
	 * @see course.StudyPlan#getStudent
	 * @model opposite="student"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link course.Student#getStudyPlan <em>Study Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Ola Nordmann"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course.CoursePackage#getStudent_Name()
	 * @model default="Ola Nordmann"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.School#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see course.CoursePackage#getStudent_School()
	 * @see course.School#getStudents
	 * @model opposite="students" transient="false"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link course.Student#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

} // Student
