/**
 */
package course.impl;

import course.Course;
import course.CoursePackage;
import course.ProgramDirection;
import course.ProgramSemester;

import course.ProgramYear;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link course.impl.ProgramSemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link course.impl.ProgramSemesterImpl#getParentProgramDirection <em>Parent Program Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramSemesterImpl extends SemesterImpl implements ProgramSemester {
	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electiveCourses;

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
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.PROGRAM_SEMESTER__ELECTIVE_COURSES);
		}
		return electiveCourses;
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
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return ((InternalEList<?>)getMandatoryCourses()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				return ((InternalEList<?>)getElectiveCourses()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return basicSetProgramYear(null, msgs);
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return basicSetParentProgramDirection(null, msgs);
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
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case CoursePackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return getSpecializations();
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return getProgramYear();
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return getParentProgramDirection();
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
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
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
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case CoursePackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
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
			case CoursePackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case CoursePackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
			case CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case CoursePackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return getProgramYear() != null;
			case CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION:
				return getParentProgramDirection() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramSemesterImpl
