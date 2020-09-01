/**
 */
package course.impl;

import course.CoursePackage;
import course.School;
import course.Student;
import course.StudyPlan;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudentImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link course.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.StudentImpl#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The cached value of the '{@link #getStudyPlan() <em>Study Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlan()
	 * @generated
	 * @ordered
	 */
	protected StudyPlan studyPlan;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Ola Nordmann";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan getStudyPlan() {
		if (studyPlan != null && studyPlan.eIsProxy()) {
			InternalEObject oldStudyPlan = (InternalEObject)studyPlan;
			studyPlan = (StudyPlan)eResolveProxy(oldStudyPlan);
			if (studyPlan != oldStudyPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.STUDENT__STUDY_PLAN, oldStudyPlan, studyPlan));
			}
		}
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan basicGetStudyPlan() {
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(StudyPlan newStudyPlan, NotificationChain msgs) {
		StudyPlan oldStudyPlan = studyPlan;
		studyPlan = newStudyPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.STUDENT__STUDY_PLAN, oldStudyPlan, newStudyPlan);
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
	public void setStudyPlan(StudyPlan newStudyPlan) {
		if (newStudyPlan != studyPlan) {
			NotificationChain msgs = null;
			if (studyPlan != null)
				msgs = ((InternalEObject)studyPlan).eInverseRemove(this, CoursePackage.STUDY_PLAN__STUDENT, StudyPlan.class, msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, CoursePackage.STUDY_PLAN__STUDENT, StudyPlan.class, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDENT__STUDY_PLAN, newStudyPlan, newStudyPlan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public School getSchool() {
		if (eContainerFeatureID() != CoursePackage.STUDENT__SCHOOL) return null;
		return (School)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, CoursePackage.STUDENT__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchool(School newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != CoursePackage.STUDENT__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, CoursePackage.SCHOOL__STUDENTS, School.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDENT__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.STUDENT__STUDY_PLAN:
				if (studyPlan != null)
					msgs = ((InternalEObject)studyPlan).eInverseRemove(this, CoursePackage.STUDY_PLAN__STUDENT, StudyPlan.class, msgs);
				return basicSetStudyPlan((StudyPlan)otherEnd, msgs);
			case CoursePackage.STUDENT__SCHOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchool((School)otherEnd, msgs);
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
			case CoursePackage.STUDENT__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
			case CoursePackage.STUDENT__SCHOOL:
				return basicSetSchool(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CoursePackage.STUDENT__SCHOOL:
				return eInternalContainer().eInverseRemove(this, CoursePackage.SCHOOL__STUDENTS, School.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursePackage.STUDENT__STUDY_PLAN:
				if (resolve) return getStudyPlan();
				return basicGetStudyPlan();
			case CoursePackage.STUDENT__NAME:
				return getName();
			case CoursePackage.STUDENT__SCHOOL:
				return getSchool();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursePackage.STUDENT__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
				return;
			case CoursePackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.STUDENT__SCHOOL:
				setSchool((School)newValue);
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
			case CoursePackage.STUDENT__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
				return;
			case CoursePackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.STUDENT__SCHOOL:
				setSchool((School)null);
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
			case CoursePackage.STUDENT__STUDY_PLAN:
				return studyPlan != null;
			case CoursePackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.STUDENT__SCHOOL:
				return getSchool() != null;
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

} //StudentImpl
