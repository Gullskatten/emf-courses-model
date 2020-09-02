/**
 */
package course.impl;

import course.CoursePackage;
import course.ProgramSemester;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.SpecializationImpl#getProgramYear <em>Program Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<ProgramSemester>(ProgramSemester.class, this, CoursePackage.SPECIALIZATION__SEMESTERS);
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
		if (eContainerFeatureID() != CoursePackage.SPECIALIZATION__PROGRAM_YEAR) return null;
		return (ProgramYear)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramYear(ProgramYear newProgramYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramYear, CoursePackage.SPECIALIZATION__PROGRAM_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramYear(ProgramYear newProgramYear) {
		if (newProgramYear != eInternalContainer() || (eContainerFeatureID() != CoursePackage.SPECIALIZATION__PROGRAM_YEAR && newProgramYear != null)) {
			if (EcoreUtil.isAncestor(this, newProgramYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramYear != null)
				msgs = ((InternalEObject)newProgramYear).eInverseAdd(this, CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS, ProgramYear.class, msgs);
			msgs = basicSetProgramYear(newProgramYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.SPECIALIZATION__PROGRAM_YEAR, newProgramYear, newProgramYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
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
			case CoursePackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
				return basicSetProgramYear(null, msgs);
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
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS, ProgramYear.class, msgs);
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
			case CoursePackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
				return getProgramYear();
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
			case CoursePackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends ProgramSemester>)newValue);
				return;
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
				setProgramYear((ProgramYear)newValue);
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
			case CoursePackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
				setProgramYear((ProgramYear)null);
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
			case CoursePackage.SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.SPECIALIZATION__PROGRAM_YEAR:
				return getProgramYear() != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationImpl
