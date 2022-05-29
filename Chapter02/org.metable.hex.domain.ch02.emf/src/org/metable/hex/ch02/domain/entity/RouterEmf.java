/**
 */
package org.metable.hex.ch02.domain.entity;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Router Emf</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf()
 * @model kind="class" superTypes="org.metable.hex.domain.ch02.entity.IRouter"
 * @generated
 */
public class RouterEmf extends MinimalEObjectImpl.Container implements EObject, IRouter {
    /**
     * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected static final Router ENTITY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected Router entity = ENTITY_EDEFAULT;
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final RouterId ID_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitch()
     * @generated
     * @ordered
     */
    protected SwitchEmf switch_;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final RouterType TYPE_EDEFAULT = null;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RouterEmf() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EntityPackage.Literals.ROUTER_EMF;
    }

    /**
     * Returns the value of the '<em><b>Entity</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the value of the '<em>Entity</em>' attribute.
     * @see #setEntity(Router)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Entity()
     * @model dataType="org.metable.hex.domain.ch02.entity.RouterEntity" transient="true"
     * @generated
     */
    public Router getEntity() {
        return entity;
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getEntity <em>Entity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param newEntity the new value of the '<em>Entity</em>' attribute.
     * @see #getEntity()
     * @generated
     */
    public void setEntity(Router newEntity) {
        Router oldEntity = entity;
        entity = newEntity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ROUTER_EMF__ENTITY, oldEntity, entity));
    }

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(RouterId)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Id()
     * @model dataType="org.metable.hex.domain.ch02.entity.RouterId" volatile="true"
     * @generated OFF
     */
    public RouterId getId() {
        return entity.getId();
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getId <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newId the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated OFF
     */
    public void setId(RouterId newId) {
        entity.setId(newId);
    }

    /**
     * Returns the value of the '<em><b>Switch</b></em>' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the value of the '<em>Switch</em>' containment reference.
     * @see #setSwitch(SwitchEmf)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Switch()
     * @model containment="true"
     * @generated
     */
    public SwitchEmf getSwitch() {
        return switch_;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitch(SwitchEmf newSwitch, NotificationChain msgs) {
        SwitchEmf oldSwitch = switch_;
        switch_ = newSwitch;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.ROUTER_EMF__SWITCH, oldSwitch, newSwitch);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getSwitch <em>Switch</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newSwitch the new value of the '<em>Switch</em>' containment reference.
     * @see #getSwitch()
     * @generated OFF
     */
    public void setSwitch(SwitchEmf newSwitch) {
        entity.setSwitch(newSwitch.getEntity());

        if (newSwitch != switch_) {
            NotificationChain msgs = null;
            if (switch_ != null)
                msgs = switch_.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.ROUTER_EMF__SWITCH, null,
                        msgs);
            if (newSwitch != null)
                msgs = newSwitch.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.ROUTER_EMF__SWITCH, null,
                        msgs);
            msgs = basicSetSwitch(newSwitch, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ROUTER_EMF__SWITCH, newSwitch,
                    newSwitch));
    }

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(RouterType)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Type()
     * @model dataType="org.metable.hex.domain.ch02.entity.RouterType" volatile="true"
     * @generated OFF
     */
    public RouterType getType() {
        return entity.getType();
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param newType the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated OFF
     */
    public void setType(RouterType newType) {
        entity.setType(newType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EntityPackage.ROUTER_EMF__SWITCH:
                return basicSetSwitch(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EntityPackage.ROUTER_EMF__ENTITY:
                return getEntity();
            case EntityPackage.ROUTER_EMF__ID:
                return getId();
            case EntityPackage.ROUTER_EMF__SWITCH:
                return getSwitch();
            case EntityPackage.ROUTER_EMF__TYPE:
                return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EntityPackage.ROUTER_EMF__ENTITY:
                setEntity((Router)newValue);
                return;
            case EntityPackage.ROUTER_EMF__ID:
                setId((RouterId)newValue);
                return;
            case EntityPackage.ROUTER_EMF__SWITCH:
                setSwitch((SwitchEmf)newValue);
                return;
            case EntityPackage.ROUTER_EMF__TYPE:
                setType((RouterType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EntityPackage.ROUTER_EMF__ENTITY:
                setEntity(ENTITY_EDEFAULT);
                return;
            case EntityPackage.ROUTER_EMF__ID:
                setId(ID_EDEFAULT);
                return;
            case EntityPackage.ROUTER_EMF__SWITCH:
                setSwitch((SwitchEmf)null);
                return;
            case EntityPackage.ROUTER_EMF__TYPE:
                setType(TYPE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EntityPackage.ROUTER_EMF__ENTITY:
                return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
            case EntityPackage.ROUTER_EMF__ID:
                return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
            case EntityPackage.ROUTER_EMF__SWITCH:
                return switch_ != null;
            case EntityPackage.ROUTER_EMF__TYPE:
                return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (entity: ");
        result.append(entity);
        result.append(')');
        return result.toString();
    }

    @Override
    public void setSwitch(ISwitch value) {
        setSwitch((SwitchEmf) value);
    }

    @Override
    public void addNetworkToSwitch(Network network) {
        entity.addNetworkToSwitch(network);
    }

    @Override
    public Network createNetwork(IP address, String name, int cidr) {
        return entity.createNetwork(address, name, cidr);
    }

    @Override
    public List<Network> retrieveNetworks() {
        return entity.retrieveNetworks();
    }

} // RouterEmf
