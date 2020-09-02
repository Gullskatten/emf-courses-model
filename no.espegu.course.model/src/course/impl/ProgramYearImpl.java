/**
 */
package course.impl;

import course.CoursePackage;
import course.Program;
import course.ProgramSemester;
import course.ProgramYear;
import course.Specialization;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Program Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.ProgramYearImpl#getYear <em>Year</em>}</li>
 *   <li>{@link course.impl.ProgramYearImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link course.impl.ProgramYearImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.ProgramYearImpl#getProgram <em>Program</em>}</li>
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
	protected static final Integer YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Integer year = YEAR_EDEFAULT;

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
	public EList<ProgramSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<ProgramSemester>(ProgramSemester.class, this, CoursePackage.PROGRAM_YEAR__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(Integer newYear) {
		Integer oldYear = year;
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
	public ProgramSemester addSemester() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization addSpecialization() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case CoursePackage.PROGRAM_YEAR__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return basicSetProgram(null, msgs);
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
			case CoursePackage.PROGRAM_YEAR__SEMESTERS:
				return getSemesters();
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return getProgram();
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
				setYear((Integer)newValue);
				return;
			case CoursePackage.PROGRAM_YEAR__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case CoursePackage.PROGRAM_YEAR__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends ProgramSemester>)newValue);
				return;
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				setProgram((Program)newValue);
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
			case CoursePackage.PROGRAM_YEAR__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				setProgram((Program)null);
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
			case CoursePackage.PROGRAM_YEAR__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.PROGRAM_YEAR__PROGRAM:
				return getProgram() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CoursePackage.PROGRAM_YEAR___ADD_SEMESTER:
				return addSemester();
			case CoursePackage.PROGRAM_YEAR___ADD_SPECIALIZATION:
				return addSpecialization();
		}
		return super.eInvoke(operationID, arguments);
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
