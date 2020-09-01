/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link course.Semester#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link course.Semester#getTeachedInSemester <em>Teached In Semester</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * The default value is <code>"2020"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(Integer)
	 * @see course.CoursePackage#getSemester_Year()
	 * @model default="2020" dataType="course.Year"
	 * @generated
	 */
	Integer getYear();

	/**
	 * Sets the value of the '{@link course.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The default value is <code>"Autumn"</code>.
	 * The literals are from the enumeration {@link course.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see course.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see course.CoursePackage#getSemester_SemesterType()
	 * @model default="Autumn" dataType="course.SemesterType"
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link course.Semester#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see course.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Teached In Semester</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teached In Semester</em>' attribute.
	 * @see #isSetTeachedInSemester()
	 * @see course.CoursePackage#getSemester_TeachedInSemester()
	 * @model default="" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getTeachedInSemester();

	/**
	 * Returns whether the value of the '{@link course.Semester#getTeachedInSemester <em>Teached In Semester</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Teached In Semester</em>' attribute is set.
	 * @see #getTeachedInSemester()
	 * @generated
	 */
	boolean isSetTeachedInSemester();

} // Semester
