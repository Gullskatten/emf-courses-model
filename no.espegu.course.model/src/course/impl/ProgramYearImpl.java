/**
 */
package course.impl;

import course.CoursePackage;
import course.NonSpecializedProgram;
import course.Program;
import course.ProgramYear;
import course.Specialization;
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
 * An implementation of the model object '<em><b>Program Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.ProgramYearImpl#getYear <em>Year</em>}</li>
 *   <li>{@link course.impl.ProgramYearImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link course.impl.ProgramYearImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link course.impl.ProgramYearImpl#getNonSpecializedProgram <em>Non Specialized Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramYearImpl extends MinimalEObjectImpl.Container implements ProgramYear {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = "2020";

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The cached value of the '{@link #getNonSpecializedProgram() <em>Non Specialized Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonSpecializedProgram()
	 * @generated
	 * @ordered
	 */
	protected NonSpecializedProgram nonSpecializedProgram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramYearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.PROGRAM_YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS, CoursePackage.SPECIALIZATION__PROGRAM_YEAR);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_YEAR__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != CoursePackage.PROGRAM_YEAR__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, CoursePackage.PROGRAM_YEAR__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != CoursePackage.PROGRAM_YEAR__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, CoursePackage.PROGRAM__PROGRAM_YEARS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_YEAR__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonSpecializedProgram getNonSpecializedProgram() {
		if (nonSpecializedProgram != null && nonSpecializedProgram.eIsProxy()) {
			InternalEObject oldNonSpecializedProgram = (InternalEObject)nonSpecializedProgram;
			nonSpecializedProgram = (NonSpecializedProgram)eResolveProxy(oldNonSpecializedProgram);
			if (nonSpecializedProgram != oldNonSpecializedProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM, oldNonSpecializedProgram, nonSpecializedProgram));
			}
		}
		return nonSpecializedProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonSpecializedProgram basicGetNonSpecializedProgram() {
		return nonSpecializedProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonSpecializedProgram(NonSpecializedProgram newNonSpecializedProgram, NotificationChain msgs) {
		NonSpecializedProgram oldNonSpecializedProgram = nonSpecializedProgram;
		nonSpecializedProgram = newNonSpecializedProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM, oldNonSpecializedProgram, newNonSpecializedProgram);
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
	public void setNonSpecializedProgram(NonSpecializedProgram newNonSpecializedProgram) {
		if (newNonSpecializedProgram != nonSpecializedProgram) {
			NotificationChain msgs = null;
			if (nonSpecializedProgram != null)
				msgs = ((InternalEObject)nonSpecializedProgram).eInverseRemove(this, CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR, NonSpecializedProgram.class, msgs);
			if (newNonSpecializedProgram != null)
				msgs = ((InternalEObject)newNonSpecializedProgram).eInverseAdd(this, CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR, NonSpecializedProgram.class, msgs);
			msgs = basicSetNonSpecializedProgram(newNonSpecializedProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM, newNonSpecializedProgram, newNonSpecializedProgram));
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
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
			case CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM:
				if (nonSpecializedProgram != null)
					msgs = ((InternalEObject)nonSpecializedProgram).eInverseRemove(this, CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR, NonSpecializedProgram.class, msgs);
				return basicSetNonSpecializedProgram((NonSpecializedProgram)otherEnd, msgs);
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
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return basicSetProgram(null, msgs);
			case CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM:
				return basicSetNonSpecializedProgram(null, msgs);
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
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PROGRAM__PROGRAM_YEARS, Program.class, msgs);
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
			case CoursePackage.PROGRAM_YEAR__YEAR:
				return getYear();
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				return getSpecializations();
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return getProgram();
			case CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM:
				if (resolve) return getNonSpecializedProgram();
				return basicGetNonSpecializedProgram();
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
			case CoursePackage.PROGRAM_YEAR__YEAR:
				setYear((String)newValue);
				return;
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				setProgram((Program)newValue);
				return;
			case CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM:
				setNonSpecializedProgram((NonSpecializedProgram)newValue);
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
			case CoursePackage.PROGRAM_YEAR__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				setProgram((Program)null);
				return;
			case CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM:
				setNonSpecializedProgram((NonSpecializedProgram)null);
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
			case CoursePackage.PROGRAM_YEAR__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return getProgram() != null;
			case CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM:
				return nonSpecializedProgram != null;
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
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //ProgramYearImpl
