/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl#getFirstActorStep <em>First Actor Step</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl#getSecondActorStep <em>Second Actor Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMessageImpl extends BPUserActionAnnotationImpl<AbstractUserAction> implements BPMessage {
	/**
	 * The cached value of the '{@link #getFirstActorStep() <em>First Actor Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActorStep()
	 * @generated
	 * @ordered
	 */
	protected ActorStep firstActorStep;
	/**
	 * The cached value of the '{@link #getSecondActorStep() <em>Second Actor Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondActorStep()
	 * @generated
	 * @ordered
	 */
	protected ActorStep secondActorStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep getFirstActorStep() {
		if (firstActorStep != null && firstActorStep.eIsProxy()) {
			InternalEObject oldFirstActorStep = (InternalEObject)firstActorStep;
			firstActorStep = (ActorStep)eResolveProxy(oldFirstActorStep);
			if (firstActorStep != oldFirstActorStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__FIRST_ACTOR_STEP, oldFirstActorStep, firstActorStep));
			}
		}
		return firstActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep basicGetFirstActorStep() {
		return firstActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstActorStep(ActorStep newFirstActorStep) {
		ActorStep oldFirstActorStep = firstActorStep;
		firstActorStep = newFirstActorStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__FIRST_ACTOR_STEP, oldFirstActorStep, firstActorStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep getSecondActorStep() {
		if (secondActorStep != null && secondActorStep.eIsProxy()) {
			InternalEObject oldSecondActorStep = (InternalEObject)secondActorStep;
			secondActorStep = (ActorStep)eResolveProxy(oldSecondActorStep);
			if (secondActorStep != oldSecondActorStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SECOND_ACTOR_STEP, oldSecondActorStep, secondActorStep));
			}
		}
		return secondActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep basicGetSecondActorStep() {
		return secondActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondActorStep(ActorStep newSecondActorStep) {
		ActorStep oldSecondActorStep = secondActorStep;
		secondActorStep = newSecondActorStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SECOND_ACTOR_STEP, oldSecondActorStep, secondActorStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__FIRST_ACTOR_STEP:
				if (resolve) return getFirstActorStep();
				return basicGetFirstActorStep();
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SECOND_ACTOR_STEP:
				if (resolve) return getSecondActorStep();
				return basicGetSecondActorStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__FIRST_ACTOR_STEP:
				setFirstActorStep((ActorStep)newValue);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SECOND_ACTOR_STEP:
				setSecondActorStep((ActorStep)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__FIRST_ACTOR_STEP:
				setFirstActorStep((ActorStep)null);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SECOND_ACTOR_STEP:
				setSecondActorStep((ActorStep)null);
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
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__FIRST_ACTOR_STEP:
				return firstActorStep != null;
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SECOND_ACTOR_STEP:
				return secondActorStep != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMessageImpl
