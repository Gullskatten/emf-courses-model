/**
 */
package course.impl;

import course.CoursePackage;
import course.Program;
import course.ProgramYear;
import course.School;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.ProgramImpl#getRequiredCredits <em>Required Credits</em>}</li>
 *   <li>{@link course.impl.ProgramImpl#getSchool <em>School</em>}</li>
 *   <li>{@link course.impl.ProgramImpl#getProgramYears <em>Program Years</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The default value of the '{@link #getRequiredCredits() <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredCredits() <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected int requiredCredits = REQUIRED_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgramYears() <em>Program Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramYears()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramYear> programYears;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRequiredCredits() {
		return requiredCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredCredits(int newRequiredCredits) {
		int oldRequiredCredits = requiredCredits;
		requiredCredits = newRequiredCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM__REQUIRED_CREDITS, oldRequiredCredits, requiredCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public School getSchool() {
		if (eContainerFeatureID() != CoursePackage.PROGRAM__SCHOOL) return null;
		return (School)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, CoursePackage.PROGRAM__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchool(School newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != CoursePackage.PROGRAM__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, CoursePackage.SCHOOL__PROGRAMS, School.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramYear> getProgramYears() {
		if (programYears == null) {
			programYears = new EObjectContainmentWithInverseEList<ProgramYear>(ProgramYear.class, this, CoursePackage.PROGRAM__PROGRAM_YEARS, CoursePackage.PROGRAM_YEAR__PROGRAM);
		}
		return programYears;
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
			case CoursePackage.PROGRAM__SCHOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchool((School)otherEnd, msgs);
			case CoursePackage.PROGRAM__PROGRAM_YEARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgramYears()).basicAdd(otherEnd, msgs);
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
			case CoursePackage.PROGRAM__SCHOOL:
				return basicSetSchool(null, msgs);
			case CoursePackage.PROGRAM__PROGRAM_YEARS:
				return ((InternalEList<?>)getProgramYears()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.PROGRAM__SCHOOL:
				return eInternalContainer().eInverseRemove(this, CoursePackage.SCHOOL__PROGRAMS, School.class, msgs);
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
			case CoursePackage.PROGRAM__NAME:
				return getName();
			case CoursePackage.PROGRAM__REQUIRED_CREDITS:
				return getRequiredCredits();
			case CoursePackage.PROGRAM__SCHOOL:
				return getSchool();
			case CoursePackage.PROGRAM__PROGRAM_YEARS:
				return getProgramYears();
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
			case CoursePackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.PROGRAM__REQUIRED_CREDITS:
				setRequiredCredits((Integer)newValue);
				return;
			case CoursePackage.PROGRAM__SCHOOL:
				setSchool((School)newValue);
				return;
			case CoursePackage.PROGRAM__PROGRAM_YEARS:
				getProgramYears().clear();
				getProgramYears().addAll((Collection<? extends ProgramYear>)newValue);
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
			case CoursePackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.PROGRAM__REQUIRED_CREDITS:
				setRequiredCredits(REQUIRED_CREDITS_EDEFAULT);
				return;
			case CoursePackage.PROGRAM__SCHOOL:
				setSchool((School)null);
				return;
			case CoursePackage.PROGRAM__PROGRAM_YEARS:
				getProgramYears().clear();
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
			case CoursePackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.PROGRAM__REQUIRED_CREDITS:
				return requiredCredits != REQUIRED_CREDITS_EDEFAULT;
			case CoursePackage.PROGRAM__SCHOOL:
				return getSchool() != null;
			case CoursePackage.PROGRAM__PROGRAM_YEARS:
				return programYears != null && !programYears.isEmpty();
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
		result.append(", requiredCredits: ");
		result.append(requiredCredits);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
