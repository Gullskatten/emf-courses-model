/**
 */
package course.impl;

import course.Course;
import course.CoursePackage;
import course.ProgramSemester;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.ProgramSemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getOptionalCourses <em>Optional Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramSemesterImpl extends SemesterImpl implements ProgramSemester {
	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * The cached value of the '{@link #getOptionalCourses() <em>Optional Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> optionalCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.PROGRAM_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getOptionalCourses() {
		if (optionalCourses == null) {
			optionalCourses = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.PROGRAM_SEMESTER__OPTIONAL_COURSES);
		}
		return optionalCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return ((InternalEList<?>)getMandatoryCourses()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__OPTIONAL_COURSES:
				return ((InternalEList<?>)getOptionalCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case CoursePackage.PROGRAM_SEMESTER__OPTIONAL_COURSES:
				return getOptionalCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__OPTIONAL_COURSES:
				getOptionalCourses().clear();
				getOptionalCourses().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case CoursePackage.PROGRAM_SEMESTER__OPTIONAL_COURSES:
				getOptionalCourses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case CoursePackage.PROGRAM_SEMESTER__OPTIONAL_COURSES:
				return optionalCourses != null && !optionalCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramSemesterImpl
