/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.StudyPlan#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.StudyPlan#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link course.StudyPlan#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getStudyPlan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasRequiredCreditsForSpecialization'"
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link course.StudyPlanSemester}.
	 * It is bidirectional and its opposite is '{@link course.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see course.CoursePackage#getStudyPlan_Semesters()
	 * @see course.StudyPlanSemester#getStudyPlan
	 * @model opposite="studyPlan" containment="true"
	 * @generated
	 */
	EList<StudyPlanSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference.
	 * @see #setSpecialization(Specialization)
	 * @see course.CoursePackage#getStudyPlan_Specialization()
	 * @model
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link course.StudyPlan#getSpecialization <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link course.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see course.CoursePackage#getStudyPlan_Student()
	 * @see course.Student#getStudyPlan
	 * @model opposite="studyPlan"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link course.StudyPlan#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

} // StudyPlan
