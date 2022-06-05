/**
 */
package org.metable.hex.ch02.domain.entity;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.metable.hex.ch02.domain.valueobject.Protocol;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Event Emf</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.entity.EventEmf#getEntity <em>Entity</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.entity.EventEmf#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.entity.EntityPackage#getEventEmf()
 * @model kind="class" superTypes="org.metable.hex.ch02.domain.entity.IEvent"
 * @extends CDOObject
 * @generated
 */
public class EventEmf extends CDOObjectImpl implements CDOObject, IEvent {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EventEmf() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EntityPackage.Literals.EVENT_EMF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * Returns the value of the '<em><b>Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Entity</em>' attribute.
     * @see #setEntity(Event)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getEventEmf_Entity()
     * @model dataType="org.metable.hex.ch02.domain.entity.EventEntity" transient="true"
     * @generated
     */
    public Event getEntity() {
        return (Event) eGet(EntityPackage.Literals.EVENT_EMF__ENTITY, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.EventEmf#getEntity <em>Entity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newEntity the new value of the '<em>Entity</em>' attribute.
     * @see #getEntity()
     * @generated
     */
    public void setEntity(Event newEntity) {
        eSet(EntityPackage.Literals.EVENT_EMF__ENTITY, newEntity);
    }

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Protocol</em>' attribute.
     * @see #setProtocol(Protocol)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getEventEmf_Protocol()
     * @model dataType="org.metable.hex.ch02.domain.entity.Protocol" volatile="true"
     * @generated
     */
    public Protocol getProtocol() {
        return (Protocol) eGet(EntityPackage.Literals.EVENT_EMF__PROTOCOL, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.EventEmf#getProtocol <em>Protocol</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newProtocol the new value of the '<em>Protocol</em>' attribute.
     * @see #getProtocol()
     * @generated
     */
    public void setProtocol(Protocol newProtocol) {
        eSet(EntityPackage.Literals.EVENT_EMF__PROTOCOL, newProtocol);
    }

    @Override
    public void updateProtocol(Protocol protocol) {
        getEntity().updateProtocol(protocol);
    }

} // EventEmf
