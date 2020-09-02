/**
 */
package course.impl;

import course.CoursePackage;
import course.NonSpecializedProgram;
import course.ProgramSemester;
import course.ProgramYear;

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
 * An implementation of the model object '<em><b>Non Specialized Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.NonSpecializedProgramImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.NonSpecializedProgramImpl#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.impl.NonSpecializedProgramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonSpecializedProgramImpl extends MinimalEObjectImpl.Container implements NonSpecializedProgram {
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
	 * The cached value of the '{@link #getProgramYear() <em>Program Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramYear()
	 * @generated
	 * @ordered
	 */
	protected ProgramYear programYear;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonSpecializedProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.NON_SPECIALIZED_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<ProgramSemester>(ProgramSemester.class, this, CoursePackage.NON_SPECIALIZED_PROGRAM__SEMESTERS);
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
		if (programYear != null && programYear.eIsProxy()) {
			InternalEObject oldProgramYear = (InternalEObject)programYear;
			programYear = (ProgramYear)eResolveProxy(oldProgramYear);
			if (programYear != oldProgramYear) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR, oldProgramYear, programYear));
			}
		}
		return programYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramYear basicGetProgramYear() {
		return programYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramYear(ProgramYear newProgramYear, NotificationChain msgs) {
		ProgramYear oldProgramYear = programYear;
		programYear = newProgramYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR, oldProgramYear, newProgramYear);
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
	public void setProgramYear(ProgramYear newProgramYear) {
		if (newProgramYear != programYear) {
			NotificationChain msgs = null;
			if (programYear != null)
				msgs = ((InternalEObject)programYear).eInverseRemove(this, CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM, ProgramYear.class, msgs);
			if (newProgramYear != null)
				msgs = ((InternalEObject)newProgramYear).eInverseAdd(this, CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM, ProgramYear.class, msgs);
			msgs = basicSetProgramYear(newProgramYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR, newProgramYear, newProgramYear));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR:
				if (programYear != null)
					msgs = ((InternalEObject)programYear).eInverseRemove(this, CoursePackage.PROGRAM_YEAR__NON_SPECIALIZED_PROGRAM, ProgramYear.class, msgs);
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
			case CoursePackage.NON_SPECIALIZED_PROGRAM__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursePackage.NON_SPECIALIZED_PROGRAM__SEMESTERS:
				return getSemesters();
			case CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR:
				if (resolve) return getProgramYear();
				return basicGetProgramYear();
			case CoursePackage.NON_SPECIALIZED_PROGRAM__NAME:
				return getName();
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
			case CoursePackage.NON_SPECIALIZED_PROGRAM__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends ProgramSemester>)newValue);
				return;
			case CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR:
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
			case CoursePackage.NON_SPECIALIZED_PROGRAM__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR:
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
			case CoursePackage.NON_SPECIALIZED_PROGRAM__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.NON_SPECIALIZED_PROGRAM__PROGRAM_YEAR:
				return programYear != null;
			case CoursePackage.NON_SPECIALIZED_PROGRAM__NAME:
				return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //NonSpecializedProgramImpl
