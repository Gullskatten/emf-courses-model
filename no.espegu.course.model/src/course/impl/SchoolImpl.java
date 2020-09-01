/**
 */
package course.impl;

import course.CoursePackage;
import course.Program;
import course.School;
import course.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.SchoolImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link course.impl.SchoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.SchoolImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchoolImpl extends MinimalEObjectImpl.Container implements School {
	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentWithInverseEList<Program>(Program.class, this, CoursePackage.SCHOOL__PROGRAMS, CoursePackage.PROGRAM__SCHOOL);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.SCHOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentWithInverseEList<Student>(Student.class, this, CoursePackage.SCHOOL__STUDENTS, CoursePackage.STUDENT__SCHOOL);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.SCHOOL__PROGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrograms()).basicAdd(otherEnd, msgs);
			case CoursePackage.SCHOOL__STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.SCHOOL__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
			case CoursePackage.SCHOOL__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.SCHOOL__PROGRAMS:
				return getPrograms();
			case CoursePackage.SCHOOL__NAME:
				return getName();
			case CoursePackage.SCHOOL__STUDENTS:
				return getStudents();
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
			case CoursePackage.SCHOOL__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends Program>)newValue);
				return;
			case CoursePackage.SCHOOL__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.SCHOOL__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
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
			case CoursePackage.SCHOOL__PROGRAMS:
				getPrograms().clear();
				return;
			case CoursePackage.SCHOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.SCHOOL__STUDENTS:
				getStudents().clear();
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
			case CoursePackage.SCHOOL__PROGRAMS:
				return programs != null && !programs.isEmpty();
			case CoursePackage.SCHOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.SCHOOL__STUDENTS:
				return students != null && !students.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchoolImpl
