/**
 */
package course.impl;

import course.Course;
import course.CoursePackage;
import course.ProgramSemester;
import course.SemesterType;
import course.StudyPlan;
import course.StudyPlanSemester;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getTeachedInSemester <em>Teached In Semester</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link course.impl.StudyPlanSemesterImpl#getRelatedProgramSemester <em>Related Program Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanSemesterImpl extends MinimalEObjectImpl.Container implements StudyPlanSemester {
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
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final Float TOTAL_CREDITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedProgramSemester() <em>Related Program Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedProgramSemester()
	 * @generated
	 * @ordered
	 */
	protected ProgramSemester relatedProgramSemester;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN_SEMESTER__YEAR, oldYear, year));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN_SEMESTER__SEMESTER_TYPE, oldSemesterType, semesterType));
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
		
		switch(semesterType.getValue()) {
		case SemesterType.AUTUMN_VALUE: 
			return "Autumn";
		case SemesterType.SPRING_VALUE:
			return "Spring";
		default:
			return "Unknown";
		}
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
	 * @generated NOT
	 */
	@Override
	public Float getTotalCredits() {
		float totalCredits = 0;
		
		for(Course course : getAllCoursesInSemester()) {
			totalCredits += course.getCredits();
		}
		
		return totalCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetTotalCredits() {
		return getTotalCredits() != 0;
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
	public ProgramSemester getRelatedProgramSemester() {
		if (relatedProgramSemester != null && relatedProgramSemester.eIsProxy()) {
			InternalEObject oldRelatedProgramSemester = (InternalEObject)relatedProgramSemester;
			relatedProgramSemester = (ProgramSemester)eResolveProxy(oldRelatedProgramSemester);
			if (relatedProgramSemester != oldRelatedProgramSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER, oldRelatedProgramSemester, relatedProgramSemester));
			}
		}
		return relatedProgramSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSemester basicGetRelatedProgramSemester() {
		return relatedProgramSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedProgramSemester(ProgramSemester newRelatedProgramSemester) {
		ProgramSemester oldRelatedProgramSemester = relatedProgramSemester;
		relatedProgramSemester = newRelatedProgramSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER, oldRelatedProgramSemester, relatedProgramSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ArrayList<Course> getAllCoursesInSemester() {
		ArrayList<Course> allCourses = new ArrayList<>();
		
		if(relatedProgramSemester != null) {
			if(!relatedProgramSemester.getSlots().isEmpty()) {
				relatedProgramSemester.getSlots().forEach(slot -> {
					if(slot.isMandatory()) {
						allCourses.addAll(slot.getAvailableCourses());
					} else {
						allCourses.addAll(slot.getSelectedCoursesInSlot());
					}
				});
			}
		}
		
		return allCourses;
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
			case CoursePackage.STUDY_PLAN_SEMESTER__YEAR:
				return getYear();
			case CoursePackage.STUDY_PLAN_SEMESTER__SEMESTER_TYPE:
				return getSemesterType();
			case CoursePackage.STUDY_PLAN_SEMESTER__TEACHED_IN_SEMESTER:
				return getTeachedInSemester();
			case CoursePackage.STUDY_PLAN_SEMESTER__TOTAL_CREDITS:
				return getTotalCredits();
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				return getStudyPlan();
			case CoursePackage.STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER:
				if (resolve) return getRelatedProgramSemester();
				return basicGetRelatedProgramSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursePackage.STUDY_PLAN_SEMESTER__YEAR:
				setYear((String)newValue);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType) newValue);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER:
				setRelatedProgramSemester((ProgramSemester)newValue);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType)null);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
				return;
			case CoursePackage.STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER:
				setRelatedProgramSemester((ProgramSemester)null);
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
			case CoursePackage.STUDY_PLAN_SEMESTER__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case CoursePackage.STUDY_PLAN_SEMESTER__SEMESTER_TYPE:
				return semesterType != null;
			case CoursePackage.STUDY_PLAN_SEMESTER__TEACHED_IN_SEMESTER:
				return isSetTeachedInSemester();
			case CoursePackage.STUDY_PLAN_SEMESTER__TOTAL_CREDITS:
				return isSetTotalCredits();
			case CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN:
				return getStudyPlan() != null;
			case CoursePackage.STUDY_PLAN_SEMESTER__RELATED_PROGRAM_SEMESTER:
				return relatedProgramSemester != null;
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
			case CoursePackage.STUDY_PLAN_SEMESTER___GET_ALL_COURSES_IN_SEMESTER:
				return getAllCoursesInSemester();
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
		result.append(", semesterType: ");
		result.append(semesterType);
		result.append(')');
		return result.toString();
	}

} //StudyPlanSemesterImpl
