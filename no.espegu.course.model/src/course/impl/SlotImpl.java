/**
 */
package course.impl;

import course.Course;
import course.CoursePackage;
import course.Slot;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.SlotImpl#getAvailableCourses <em>Available Courses</em>}</li>
 *   <li>{@link course.impl.SlotImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link course.impl.SlotImpl#getRequiredCredits <em>Required Credits</em>}</li>
 *   <li>{@link course.impl.SlotImpl#getSelectedCoursesInSlot <em>Selected Courses In Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends MinimalEObjectImpl.Container implements Slot {
	/**
	 * The cached value of the '{@link #getAvailableCourses() <em>Available Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> availableCourses;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getRequiredCredits() <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float REQUIRED_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRequiredCredits() <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected float requiredCredits = REQUIRED_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectedCoursesInSlot() <em>Selected Courses In Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedCoursesInSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> selectedCoursesInSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getAvailableCourses() {
		if (availableCourses == null) {
			availableCourses = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.SLOT__AVAILABLE_COURSES);
		}
		return availableCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isMandatory() {
		return availableCourses != null && availableCourses.size() == 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetMandatory() {
		return availableCourses != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRequiredCredits() {
		return requiredCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredCredits(float newRequiredCredits) {
		float oldRequiredCredits = requiredCredits;
		requiredCredits = newRequiredCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.SLOT__REQUIRED_CREDITS, oldRequiredCredits, requiredCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Course> getSelectedCoursesInSlot() {
		if (selectedCoursesInSlot == null) {
			selectedCoursesInSlot = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.SLOT__SELECTED_COURSES_IN_SLOT);
		}
		
		if(selectedCoursesInSlot.isEmpty() && availableCourses != null && availableCourses.size() == 1) {
			selectedCoursesInSlot.addAll(availableCourses);
		}
		
		return selectedCoursesInSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Slot addCourseToSlot(Course course) throws RuntimeException {
		float totalCredits = 0f;
		
		if(availableCourses.size() == 1) {
			throw new IllegalArgumentException("Courses cannot be added to a mandatory slot.");
		}
		
		for(Course selectedCourse : selectedCoursesInSlot) {
			if(selectedCourse.isSameCourse(course)) {
				throw new CourseAlreadyExistsException(course);
			}
			
			totalCredits += selectedCourse.getCredits();
		}
		
		if(totalCredits == requiredCredits) {
			throw new IllegalStateException("Slot is already full.");
		}
		
		if(totalCredits + course.getCredits() > requiredCredits) {
			throw new IllegalStateException("Course does not fit in this slot (too many credits).");
		}
		
		selectedCoursesInSlot.add(course);
		
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.SLOT__AVAILABLE_COURSES:
				return ((InternalEList<?>)getAvailableCourses()).basicRemove(otherEnd, msgs);
			case CoursePackage.SLOT__SELECTED_COURSES_IN_SLOT:
				return ((InternalEList<?>)getSelectedCoursesInSlot()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.SLOT__AVAILABLE_COURSES:
				return getAvailableCourses();
			case CoursePackage.SLOT__MANDATORY:
				return isMandatory();
			case CoursePackage.SLOT__REQUIRED_CREDITS:
				return getRequiredCredits();
			case CoursePackage.SLOT__SELECTED_COURSES_IN_SLOT:
				return getSelectedCoursesInSlot();
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
			case CoursePackage.SLOT__AVAILABLE_COURSES:
				getAvailableCourses().clear();
				getAvailableCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.SLOT__REQUIRED_CREDITS:
				setRequiredCredits((Float)newValue);
				return;
			case CoursePackage.SLOT__SELECTED_COURSES_IN_SLOT:
				getSelectedCoursesInSlot().clear();
				getSelectedCoursesInSlot().addAll((Collection<? extends Course>)newValue);
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
			case CoursePackage.SLOT__AVAILABLE_COURSES:
				getAvailableCourses().clear();
				return;
			case CoursePackage.SLOT__REQUIRED_CREDITS:
				setRequiredCredits(REQUIRED_CREDITS_EDEFAULT);
				return;
			case CoursePackage.SLOT__SELECTED_COURSES_IN_SLOT:
				getSelectedCoursesInSlot().clear();
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
			case CoursePackage.SLOT__AVAILABLE_COURSES:
				return availableCourses != null && !availableCourses.isEmpty();
			case CoursePackage.SLOT__MANDATORY:
				return isSetMandatory();
			case CoursePackage.SLOT__REQUIRED_CREDITS:
				return requiredCredits != REQUIRED_CREDITS_EDEFAULT;
			case CoursePackage.SLOT__SELECTED_COURSES_IN_SLOT:
				return selectedCoursesInSlot != null && !selectedCoursesInSlot.isEmpty();
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
			case CoursePackage.SLOT___ADD_COURSE_TO_SLOT__COURSE:
				return addCourseToSlot((Course)arguments.get(0));
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
		result.append(" (requiredCredits: ");
		result.append(requiredCredits);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
