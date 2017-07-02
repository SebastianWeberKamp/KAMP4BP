/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getFirstActorStep <em>First Actor Step</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getSecondActorStep <em>Second Actor Step</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPMessage()
 * @model
 * @generated
 */
public interface BPMessage extends BPUserActionAnnotation<AbstractUserAction> {

	/**
	 * Returns the value of the '<em><b>First Actor Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Actor Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Actor Step</em>' reference.
	 * @see #setFirstActorStep(ActorStep)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPMessage_FirstActorStep()
	 * @model
	 * @generated
	 */
	ActorStep getFirstActorStep();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getFirstActorStep <em>First Actor Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Actor Step</em>' reference.
	 * @see #getFirstActorStep()
	 * @generated
	 */
	void setFirstActorStep(ActorStep value);

	/**
	 * Returns the value of the '<em><b>Second Actor Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Actor Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Actor Step</em>' reference.
	 * @see #setSecondActorStep(ActorStep)
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#getBPMessage_SecondActorStep()
	 * @model
	 * @generated
	 */
	ActorStep getSecondActorStep();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getSecondActorStep <em>Second Actor Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Actor Step</em>' reference.
	 * @see #getSecondActorStep()
	 * @generated
	 */
	void setSecondActorStep(ActorStep value);
} // BPMessage
