/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;

import org.metable.hex.ch02.domain.valueobject.RouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterDtoImpl extends IRouterDtoImpl implements RouterDto {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

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
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected RouterType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitch()
     * @generated
     * @ordered
     */
    protected SwitchDto switch_;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RouterDtoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NetworkPackage.Literals.ROUTER_DTO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ROUTER_DTO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RouterType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(RouterType newType) {
        RouterType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ROUTER_DTO__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchDto getSwitch() {
        if (switch_ != null && switch_.eIsProxy()) {
            InternalEObject oldSwitch = (InternalEObject) switch_;
            switch_ = (SwitchDto) eResolveProxy(oldSwitch);
            if (switch_ != oldSwitch) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.ROUTER_DTO__SWITCH,
                            oldSwitch, switch_));
            }
        }
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchDto basicGetSwitch() {
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSwitch(SwitchDto newSwitch) {
        SwitchDto oldSwitch = switch_;
        switch_ = newSwitch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ROUTER_DTO__SWITCH, oldSwitch,
                    switch_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case NetworkPackage.ROUTER_DTO__ID:
            return getId();
        case NetworkPackage.ROUTER_DTO__TYPE:
            return getType();
        case NetworkPackage.ROUTER_DTO__SWITCH:
            if (resolve)
                return getSwitch();
            return basicGetSwitch();
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
        case NetworkPackage.ROUTER_DTO__ID:
            setId((String) newValue);
            return;
        case NetworkPackage.ROUTER_DTO__TYPE:
            setType((RouterType) newValue);
            return;
        case NetworkPackage.ROUTER_DTO__SWITCH:
            setSwitch((SwitchDto) newValue);
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
        case NetworkPackage.ROUTER_DTO__ID:
            setId(ID_EDEFAULT);
            return;
        case NetworkPackage.ROUTER_DTO__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case NetworkPackage.ROUTER_DTO__SWITCH:
            setSwitch((SwitchDto) null);
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
        case NetworkPackage.ROUTER_DTO__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        case NetworkPackage.ROUTER_DTO__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case NetworkPackage.ROUTER_DTO__SWITCH:
            return switch_ != null;
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
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //RouterDtoImpl
