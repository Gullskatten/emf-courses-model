/**
 */
package course.impl;

import course.CoursePackage;
import course.ProgramYear;
import course.Specialization;
import course.SpecializationSemester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link course.impl.SpecializationImpl#getStartingYear <em>Starting Year</em>}</li>
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
	protected EList<SpecializationSemester> semesters;

	/**
	 * The cached value of the '{@link #getStartingYear() <em>Starting Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingYear()
	 * @generated
	 * @ordered
	 */
	protected ProgramYear startingYear;

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
	public EList<SpecializationSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<SpecializationSemester>(SpecializationSemester.class, this, CoursePackage.SPECIALIZATION__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramYear getStartingYear() {
		if (startingYear != null && startingYear.eIsProxy()) {
			InternalEObject oldStartingYear = (InternalEObject)startingYear;
			startingYear = (ProgramYear)eResolveProxy(oldStartingYear);
			if (startingYear != oldStartingYear) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.SPECIALIZATION__STARTING_YEAR, oldStartingYear, startingYear));
			}
		}
		return startingYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramYear basicGetStartingYear() {
		return startingYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartingYear(ProgramYear newStartingYear) {
		ProgramYear oldStartingYear = startingYear;
		startingYear = newStartingYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.SPECIALIZATION__STARTING_YEAR, oldStartingYear, startingYear));
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
			case CoursePackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
			case CoursePackage.SPECIALIZATION__STARTING_YEAR:
				if (resolve) return getStartingYear();
				return basicGetStartingYear();
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
				getSemesters().addAll((Collection<? extends SpecializationSemester>)newValue);
				return;
			case CoursePackage.SPECIALIZATION__STARTING_YEAR:
				setStartingYear((ProgramYear)newValue);
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
			case CoursePackage.SPECIALIZATION__STARTING_YEAR:
				setStartingYear((ProgramYear)null);
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
			case CoursePackage.SPECIALIZATION__STARTING_YEAR:
				return startingYear != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationImpl
