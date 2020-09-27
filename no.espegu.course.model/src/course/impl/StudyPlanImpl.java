/**
 */
package course.impl;

import course.CoursePackage;
import course.ProgramYear;
import course.Student;
import course.StudyPlan;
import course.StudyPlanSemester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudyPlanImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.StudyPlanImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link course.impl.StudyPlanImpl#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link course.impl.StudyPlanImpl#getProgramStartingYear <em>Program Starting Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlanSemester> semesters;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected Student student;

	/**
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProgramStartingYear() <em>Program Starting Year</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramStartingYear()
	 * @generated
	 * @ordered
	 */
	protected ProgramYear programStartingYear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyPlanSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<StudyPlanSemester>(StudyPlanSemester.class, this, CoursePackage.STUDY_PLAN__SEMESTERS, CoursePackage.STUDY_PLAN_SEMESTER__STUDY_PLAN);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (student != null && student.eIsProxy()) {
			InternalEObject oldStudent = (InternalEObject)student;
			student = (Student)eResolveProxy(oldStudent);
			if (student != oldStudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.STUDY_PLAN__STUDENT, oldStudent, student));
			}
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetStudent() {
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN__STUDENT, oldStudent, newStudent);
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
	public void setStudent(Student newStudent) {
		if (newStudent != student) {
			NotificationChain msgs = null;
			if (student != null)
				msgs = ((InternalEObject)student).eInverseRemove(this, CoursePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, CoursePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public float getTotalCredits() {
		float totalCredits = 0f;
		
		for(StudyPlanSemester semester : semesters) {
			totalCredits += semester.getTotalCredits();
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
		return semesters != null && !semesters.isEmpty() && getTotalCredits() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramYear getProgramStartingYear() {
		if (programStartingYear != null && programStartingYear.eIsProxy()) {
			InternalEObject oldProgramStartingYear = (InternalEObject)programStartingYear;
			programStartingYear = (ProgramYear)eResolveProxy(oldProgramStartingYear);
			if (programStartingYear != oldProgramStartingYear) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.STUDY_PLAN__PROGRAM_STARTING_YEAR, oldProgramStartingYear, programStartingYear));
			}
		}
		return programStartingYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramYear basicGetProgramStartingYear() {
		return programStartingYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramStartingYear(ProgramYear newProgramStartingYear) {
		ProgramYear oldProgramStartingYear = programStartingYear;
		programStartingYear = newProgramStartingYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDY_PLAN__PROGRAM_STARTING_YEAR, oldProgramStartingYear, programStartingYear));
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case CoursePackage.STUDY_PLAN__STUDENT:
				if (student != null)
					msgs = ((InternalEObject)student).eInverseRemove(this, CoursePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
				return basicSetStudent((Student)otherEnd, msgs);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.STUDY_PLAN__STUDENT:
				return basicSetStudent(null, msgs);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return getSemesters();
			case CoursePackage.STUDY_PLAN__STUDENT:
				if (resolve) return getStudent();
				return basicGetStudent();
			case CoursePackage.STUDY_PLAN__TOTAL_CREDITS:
				return getTotalCredits();
			case CoursePackage.STUDY_PLAN__PROGRAM_STARTING_YEAR:
				if (resolve) return getProgramStartingYear();
				return basicGetProgramStartingYear();
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends StudyPlanSemester>)newValue);
				return;
			case CoursePackage.STUDY_PLAN__STUDENT:
				setStudent((Student)newValue);
				return;
			case CoursePackage.STUDY_PLAN__PROGRAM_STARTING_YEAR:
				setProgramStartingYear((ProgramYear)newValue);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.STUDY_PLAN__STUDENT:
				setStudent((Student)null);
				return;
			case CoursePackage.STUDY_PLAN__PROGRAM_STARTING_YEAR:
				setProgramStartingYear((ProgramYear)null);
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
			case CoursePackage.STUDY_PLAN__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.STUDY_PLAN__STUDENT:
				return student != null;
			case CoursePackage.STUDY_PLAN__TOTAL_CREDITS:
				return isSetTotalCredits();
			case CoursePackage.STUDY_PLAN__PROGRAM_STARTING_YEAR:
				return programStartingYear != null;
		}
		return super.eIsSet(featureID);
	}

} //StudyPlanImpl
