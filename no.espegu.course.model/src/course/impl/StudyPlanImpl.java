/**
 */
package course.impl;

import course.CoursePackage;
import course.Specialization;
import course.Student;
import course.StudyPlan;
import course.StudyPlanSemester;

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
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudyPlanImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.StudyPlanImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link course.impl.StudyPlanImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlanSemester> semesters;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization specialization;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected Student student;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyPlanSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<StudyPlanSemester>(StudyPlanSemester.class, this, CoursePackage.STUDY_PLAN__SEMESTERS, CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getSpecialization() {
		if (specialization != null && specialization.eIsProxy()) {
			InternalEObject oldSpecialization = (InternalEObject)specialization;
			specialization = (Specialization)eResolveProxy(oldSpecialization);
			if (specialization != oldSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.STUDY_PLAN__SPECIALIZATION, oldSpecialization, specialization));
			}
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(Specialization newSpecialization) {
		Specialization oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN__SPECIALIZATION, oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (student != null && student.eIsProxy()) {
			InternalEObject oldStudent = (InternalEObject)student;
			student = (Student)eResolveProxy(oldStudent);
			if (student != oldStudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.STUDY_PLAN__STUDENT, oldStudent, student));
			}
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetStudent() {
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN__STUDENT, oldStudent, newStudent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != student) {
			NotificationChain msgs = null;
			if (student != null)
				msgs = ((InternalEObject)student).eInverseRemove(this, CoursePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, CoursePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN__STUDENT, newStudent, newStudent));
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case CoursePackage.STUDY_PLAN__STUDENT:
				if (student != null)
					msgs = ((InternalEObject)student).eInverseRemove(this, CoursePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
				return basicSetStudent((Student)otherEnd, msgs);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.STUDY_PLAN__STUDENT:
				return basicSetStudent(null, msgs);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return getSemesters();
			case CoursePackage.STUDY_PLAN__SPECIALIZATION:
				if (resolve) return getSpecialization();
				return basicGetSpecialization();
			case CoursePackage.STUDY_PLAN__STUDENT:
				if (resolve) return getStudent();
				return basicGetStudent();
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends StudyPlanSemester>)newValue);
				return;
			case CoursePackage.STUDY_PLAN__SPECIALIZATION:
				setSpecialization((Specialization)newValue);
				return;
			case CoursePackage.STUDY_PLAN__STUDENT:
				setStudent((Student)newValue);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.STUDY_PLAN__SPECIALIZATION:
				setSpecialization((Specialization)null);
				return;
			case CoursePackage.STUDY_PLAN__STUDENT:
				setStudent((Student)null);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.STUDY_PLAN__SPECIALIZATION:
				return specialization != null;
			case CoursePackage.STUDY_PLAN__STUDENT:
				return student != null;
		}
		return super.eIsSet(featureID);
	}

} //StudyPlanImpl
