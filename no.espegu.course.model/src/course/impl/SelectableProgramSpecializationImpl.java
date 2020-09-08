/**
 */
package course.impl;

import course.CoursePackage;
import course.ProgramSemester;
import course.ProgramYear;
import course.SelectableProgramSpecialization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selectable Program Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.SelectableProgramSpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.SelectableProgramSpecializationImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.SelectableProgramSpecializationImpl#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.impl.SelectableProgramSpecializationImpl#getSubSpecializations <em>Sub Specializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectableProgramSpecializationImpl extends MinimalEObjectImpl.Container implements SelectableProgramSpecialization {
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
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramSemester> semesters;

	/**
	 * The cached value of the '{@link #getSubSpecializations() <em>Sub Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectableProgramSpecialization> subSpecializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectableProgramSpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.SELECTABLE_PROGRAM_SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetName() {
		// TODO: implement this method to return whether the 'Name' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<ProgramSemester>(ProgramSemester.class, this, CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramYear getProgramYear() {
		if (eContainerFeatureID() != CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR) return null;
		return (ProgramYear)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramYear(ProgramYear newProgramYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramYear, CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramYear(ProgramYear newProgramYear) {
		if (newProgramYear != eInternalContainer() || (eContainerFeatureID() != CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR && newProgramYear != null)) {
			if (EcoreUtil.isAncestor(this, newProgramYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramYear != null)
				msgs = ((InternalEObject)newProgramYear).eInverseAdd(this, CoursePackage.PROGRAM_YEAR__SELECTABLE_PROGRAMS, ProgramYear.class, msgs);
			msgs = basicSetProgramYear(newProgramYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR, newProgramYear, newProgramYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectableProgramSpecialization> getSubSpecializations() {
		if (subSpecializations == null) {
			subSpecializations = new EObjectContainmentEList<SelectableProgramSpecialization>(SelectableProgramSpecialization.class, this, CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SUB_SPECIALIZATIONS);
		}
		return subSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramYear((ProgramYear)otherEnd, msgs);
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
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				return basicSetProgramYear(null, msgs);
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SUB_SPECIALIZATIONS:
				return ((InternalEList<?>)getSubSpecializations()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PROGRAM_YEAR__SELECTABLE_PROGRAMS, ProgramYear.class, msgs);
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
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__NAME:
				return getName();
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SEMESTERS:
				return getSemesters();
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				return getProgramYear();
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SUB_SPECIALIZATIONS:
				return getSubSpecializations();
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
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends ProgramSemester>)newValue);
				return;
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				setProgramYear((ProgramYear)newValue);
				return;
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SUB_SPECIALIZATIONS:
				getSubSpecializations().clear();
				getSubSpecializations().addAll((Collection<? extends SelectableProgramSpecialization>)newValue);
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
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				setProgramYear((ProgramYear)null);
				return;
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SUB_SPECIALIZATIONS:
				getSubSpecializations().clear();
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
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__NAME:
				return isSetName();
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__PROGRAM_YEAR:
				return getProgramYear() != null;
			case CoursePackage.SELECTABLE_PROGRAM_SPECIALIZATION__SUB_SPECIALIZATIONS:
				return subSpecializations != null && !subSpecializations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectableProgramSpecializationImpl
