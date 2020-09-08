/**
 */
package course.impl;

import course.Course;
import course.CoursePackage;
import course.StudyPlan;
import course.StudyPlanSemester;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getSelectedCourses <em>Selected Courses</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanSemesterImpl extends ProgramSemesterImpl implements StudyPlanSemester {
	/**
	 * The cached value of the '{@link #getSelectedCourses() <em>Selected Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> selectedCourses;

	/**
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CREDITS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.STUDY_PLAN_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getSelectedCourses() {
		if (selectedCourses == null) {
			selectedCourses = new EObjectContainmentEList<Course>(Course.class, this, CoursePackage.STUDY_PLAN_SEMESTER__SELECTED_COURSES);
		}
		return selectedCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalCredits() {
		// TODO: implement this method to return the 'Total Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCredits(int newTotalCredits) {
		// TODO: implement this method to set the 'Total Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTotalCredits() {
		// TODO: implement this method to unset the 'Total Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTotalCredits() {
		// TODO: implement this method to return whether the 'Total Credits' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan getStudyPlan() {
		if (eContainerFeatureID() != CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN) return null;
		return (StudyPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(StudyPlan newStudyPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyPlan, CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyPlan(StudyPlan newStudyPlan) {
		if (newStudyPlan != eInternalContainer() || (eContainerFeatureID() != CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN && newStudyPlan != null)) {
			if (EcoreUtil.isAncestor(this, newStudyPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, CoursePackage.STUDY_PLAN__SEMESTERS, StudyPlan.class, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN, newStudyPlan, newStudyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlanSemester addCourseToSemester(Course course) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyPlan((StudyPlan)otherEnd, msgs);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__SELECTED_COURSES:
				return ((InternalEList<?>)getSelectedCourses()).basicRemove(otherEnd, msgs);
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				return eInternalContainer().eInverseRemove(this, CoursePackage.STUDY_PLAN__SEMESTERS, StudyPlan.class, msgs);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__SELECTED_COURSES:
				return getSelectedCourses();
			case CoursePackage.STUDY_PLAN_SEMESTER__TOTAL_CREDITS:
				return getTotalCredits();
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				return getStudyPlan();
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
			case CoursePackage.STUDY_PLAN_SEMESTER__SELECTED_COURSES:
				getSelectedCourses().clear();
				getSelectedCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__TOTAL_CREDITS:
				setTotalCredits((Integer)newValue);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__SELECTED_COURSES:
				getSelectedCourses().clear();
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__TOTAL_CREDITS:
				unsetTotalCredits();
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__SELECTED_COURSES:
				return selectedCourses != null && !selectedCourses.isEmpty();
			case CoursePackage.STUDY_PLAN_SEMESTER__TOTAL_CREDITS:
				return isSetTotalCredits();
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				return getStudyPlan() != null;
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
			case CoursePackage.STUDY_PLAN_SEMESTER___ADD_COURSE_TO_SEMESTER__COURSE:
				return addCourseToSemester((Course)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StudyPlanSemesterImpl
