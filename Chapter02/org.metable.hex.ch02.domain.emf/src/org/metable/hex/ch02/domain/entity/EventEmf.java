/**
 */
package org.metable.hex.ch02.domain.entity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 * @generated
 */
public class EventEmf extends MinimalEObjectImpl.Container implements EObject, IEvent {
    /**
     * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected static final Event ENTITY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected Event entity = ENTITY_EDEFAULT;
    /**
     * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected static final Protocol PROTOCOL_EDEFAULT = null;

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
     * Returns the value of the '<em><b>Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Entity</em>' attribute.
     * @see #setEntity(Event)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getEventEmf_Entity()
     * @model dataType="org.metable.hex.ch02.domain.entity.EventEntity" transient="true"
     * @generated
     */
    public Event getEntity() {
        return entity;
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
        Event oldEntity = entity;
        entity = newEntity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EVENT_EMF__ENTITY, oldEntity, entity));
    }

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Protocol</em>' attribute.
     * @see #setProtocol(Protocol)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getEventEmf_Protocol()
     * @model dataType="org.metable.hex.ch02.domain.entity.Protocol" volatile="true"
     * @generated OFF
     */
    public Protocol getProtocol() {
        return entity.getProtocol();
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.EventEmf#getProtocol <em>Protocol</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newProtocol the new value of the '<em>Protocol</em>' attribute.
     * @see #getProtocol()
     * @generated OFF
     */
    public void setProtocol(Protocol newProtocol) {
        entity.setProtocol(newProtocol);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EntityPackage.EVENT_EMF__ENTITY:
            return getEntity();
        case EntityPackage.EVENT_EMF__PROTOCOL:
            return getProtocol();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EntityPackage.EVENT_EMF__ENTITY:
            setEntity((Event) newValue);
            return;
        case EntityPackage.EVENT_EMF__PROTOCOL:
            setProtocol((Protocol) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case EntityPackage.EVENT_EMF__ENTITY:
            setEntity(ENTITY_EDEFAULT);
            return;
        case EntityPackage.EVENT_EMF__PROTOCOL:
            setProtocol(PROTOCOL_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case EntityPackage.EVENT_EMF__ENTITY:
            return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
        case EntityPackage.EVENT_EMF__PROTOCOL:
            return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (entity: ");
        result.append(entity);
        result.append(')');
        return result.toString();
    }

    @Override
    public void updateProtocol(Protocol protocol) {
        entity.updateProtocol(protocol);
    }

} // EventEmf
