/**
 */
package course.impl;

import course.CoursePackage;
import course.ProgramDirection;
import course.ProgramSemester;

import course.ProgramYear;
import course.SemesterType;
import course.Slot;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.ProgramSemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getTeachedInSemester <em>Teached In Semester</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getParentProgramDirection <em>Parent Program Direction</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getSlots <em>Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramSemesterImpl extends MinimalEObjectImpl.Container implements ProgramSemester {
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
	 * The cached value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected SemesterType semesterType;

	/**
	 * The default value of the '{@link #getTeachedInSemester() <em>Teached In Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachedInSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String TEACHED_IN_SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramDirection> specializations;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slots;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterType getSemesterType() {
		return semesterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterType(SemesterType newSemesterType) {
		SemesterType oldSemesterType = semesterType;
		semesterType = newSemesterType == null ? null : newSemesterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_SEMESTER__SEMESTER_TYPE, oldSemesterType, semesterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getTeachedInSemester() {
		if(semesterType == null) {
			return "";
		}
		
		return semesterType.getLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean isSetTeachedInSemester() {
		return semesterType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramDirection> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<ProgramDirection>(ProgramDirection.class, this, CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS, CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramYear getProgramYear() {
		if (eContainerFeatureID() != CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR) return null;
		return (ProgramYear)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramYear(ProgramYear newProgramYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramYear, CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramYear(ProgramYear newProgramYear) {
		if (newProgramYear != eInternalContainer() || (eContainerFeatureID() != CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR && newProgramYear != null)) {
			if (EcoreUtil.isAncestor(this, newProgramYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramYear != null)
				msgs = ((InternalEObject)newProgramYear).eInverseAdd(this, CoursePackage.PROGRAM_YEAR__SEMESTERS, ProgramYear.class, msgs);
			msgs = basicSetProgramYear(newProgramYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR, newProgramYear, newProgramYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramDirection getParentProgramDirection() {
		if (eContainerFeatureID() != CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION) return null;
		return (ProgramDirection)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProgramDirection(ProgramDirection newParentProgramDirection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentProgramDirection, CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentProgramDirection(ProgramDirection newParentProgramDirection) {
		if (newParentProgramDirection != eInternalContainer() || (eContainerFeatureID() != CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION && newParentProgramDirection != null)) {
			if (EcoreUtil.isAncestor(this, newParentProgramDirection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentProgramDirection != null)
				msgs = ((InternalEObject)newParentProgramDirection).eInverseAdd(this, CoursePackage.PROGRAM_DIRECTION__SEMESTERS, ProgramDirection.class, msgs);
			msgs = basicSetParentProgramDirection(newParentProgramDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION, newParentProgramDirection, newParentProgramDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentEList<Slot>(Slot.class, this, CoursePackage.PROGRAM_SEMESTER__SLOTS);
		}
		return slots;
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
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramYear((ProgramYear)otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentProgramDirection((ProgramDirection)otherEnd, msgs);
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
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return basicSetProgramYear(null, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return basicSetParentProgramDirection(null, msgs);
			case CoursePackage.PROGRAM_SEMESTER__SLOTS:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PROGRAM_YEAR__SEMESTERS, ProgramYear.class, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PROGRAM_DIRECTION__SEMESTERS, ProgramDirection.class, msgs);
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
			case CoursePackage.PROGRAM_SEMESTER__YEAR:
				return getYear();
			case CoursePackage.PROGRAM_SEMESTER__SEMESTER_TYPE:
				return getSemesterType();
			case CoursePackage.PROGRAM_SEMESTER__TEACHED_IN_SEMESTER:
				return getTeachedInSemester();
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return getSpecializations();
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return getProgramYear();
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return getParentProgramDirection();
			case CoursePackage.PROGRAM_SEMESTER__SLOTS:
				return getSlots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursePackage.PROGRAM_SEMESTER__YEAR:
				setYear((String)newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType) newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends ProgramDirection>)newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				setProgramYear((ProgramYear)newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				setParentProgramDirection((ProgramDirection)newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__SLOTS:
				getSlots().clear();
				getSlots().addAll((Collection<? extends Slot>)newValue);
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
			case CoursePackage.PROGRAM_SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CoursePackage.PROGRAM_SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType)null);
				return;
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				setProgramYear((ProgramYear)null);
				return;
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				setParentProgramDirection((ProgramDirection)null);
				return;
			case CoursePackage.PROGRAM_SEMESTER__SLOTS:
				getSlots().clear();
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
			case CoursePackage.PROGRAM_SEMESTER__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case CoursePackage.PROGRAM_SEMESTER__SEMESTER_TYPE:
				return semesterType != null;
			case CoursePackage.PROGRAM_SEMESTER__TEACHED_IN_SEMESTER:
				return isSetTeachedInSemester();
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return getProgramYear() != null;
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return getParentProgramDirection() != null;
			case CoursePackage.PROGRAM_SEMESTER__SLOTS:
				return slots != null && !slots.isEmpty();
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
		result.append(", semesterType: ");
		result.append(semesterType);
		result.append(')');
		return result.toString();
	}

} //ProgramSemesterImpl
