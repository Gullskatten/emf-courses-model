/**
 */
package course.impl;

import course.CoursePackage;
import course.Program;
import course.ProgramDirection;
import course.ProgramSemester;
import course.ProgramYear;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.ProgramDirectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.ProgramDirectionImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link course.impl.ProgramDirectionImpl#getChosenInSemester <em>Chosen In Semester</em>}</li>
 *   <li>{@link course.impl.ProgramDirectionImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramDirectionImpl extends MinimalEObjectImpl.Container implements ProgramDirection {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected ProgramDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.PROGRAM_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_DIRECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<ProgramSemester>(ProgramSemester.class, this, CoursePackage.PROGRAM_DIRECTION__SEMESTERS, CoursePackage.PROGRAM_SEMESTER__PARENT_PROGRAM_DIRECTION);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramSemester getChosenInSemester() {
		if (eContainerFeatureID() != CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER) return null;
		return (ProgramSemester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChosenInSemester(ProgramSemester newChosenInSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChosenInSemester, CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChosenInSemester(ProgramSemester newChosenInSemester) {
		if (newChosenInSemester != eInternalContainer() || (eContainerFeatureID() != CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER && newChosenInSemester != null)) {
			if (EcoreUtil.isAncestor(this, newChosenInSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChosenInSemester != null)
				msgs = ((InternalEObject)newChosenInSemester).eInverseAdd(this, CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS, ProgramSemester.class, msgs);
			msgs = basicSetChosenInSemester(newChosenInSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER, newChosenInSemester, newChosenInSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		Program program = basicGetProgram();
		return program != null && program.eIsProxy() ? (Program)eResolveProxy((InternalEObject)program) : program;
	}

	/**
	 * <!-- begin-user-doc -->
	 *  Find the "root" program of this program direction.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Program basicGetProgram() {
		if (getChosenInSemester().getParentProgramDirection() != null) {
            ProgramYear programYear = null;
            ProgramSemester nextProgramSemester = getChosenInSemester();
            AtomicBoolean shouldContinue = new AtomicBoolean(true);

            do {
                ProgramDirection nextProgramDirection = nextProgramSemester.getParentProgramDirection();

                if (nextProgramDirection != null) {
                    nextProgramSemester = nextProgramDirection.getChosenInSemester();
                } else {
                    programYear = nextProgramSemester.getProgramYear();
                    shouldContinue.set(false);
                }
            } while (shouldContinue.get());

            return programYear != null ? programYear.getProgram() : null;
        } else if (getChosenInSemester().getProgramYear() != null) {
            return getChosenInSemester().getProgramYear().getProgram();
        } else {
            return null;
        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProgram() {
		// TODO: implement this method to return whether the 'Program' reference is set
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
			case CoursePackage.PROGRAM_DIRECTION__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChosenInSemester((ProgramSemester)otherEnd, msgs);
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
			case CoursePackage.PROGRAM_DIRECTION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				return basicSetChosenInSemester(null, msgs);
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
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PROGRAM_SEMESTER__SPECIALIZATIONS, ProgramSemester.class, msgs);
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
			case CoursePackage.PROGRAM_DIRECTION__NAME:
				return getName();
			case CoursePackage.PROGRAM_DIRECTION__SEMESTERS:
				return getSemesters();
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				return getChosenInSemester();
			case CoursePackage.PROGRAM_DIRECTION__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
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
			case CoursePackage.PROGRAM_DIRECTION__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.PROGRAM_DIRECTION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends ProgramSemester>)newValue);
				return;
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				setChosenInSemester((ProgramSemester)newValue);
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
			case CoursePackage.PROGRAM_DIRECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.PROGRAM_DIRECTION__SEMESTERS:
				getSemesters().clear();
				return;
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				setChosenInSemester((ProgramSemester)null);
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
			case CoursePackage.PROGRAM_DIRECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.PROGRAM_DIRECTION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case CoursePackage.PROGRAM_DIRECTION__CHOSEN_IN_SEMESTER:
				return getChosenInSemester() != null;
			case CoursePackage.PROGRAM_DIRECTION__PROGRAM:
				return isSetProgram();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProgramDirectionImpl
