/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.Router;
import org.metable.hex.ch02.domain.emf.network.Switch;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.RouterImpl#getRouterId <em>Router Id</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.RouterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.RouterImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends IRouterImpl implements Router {
    /**
     * The default value of the '{@link #getRouterId() <em>Router Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRouterId()
     * @generated
     * @ordered
     */
    protected static final RouterIdImpl ROUTER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRouterId() <em>Router Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRouterId()
     * @generated
     * @ordered
     */
    protected RouterIdImpl routerId = ROUTER_ID_EDEFAULT;

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
    protected Switch switch_;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RouterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NetworkPackage.Literals.ROUTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RouterIdImpl getRouterId() {
        return routerId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRouterId(RouterIdImpl newRouterId) {
        RouterIdImpl oldRouterId = routerId;
        routerId = newRouterId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ROUTER__ROUTER_ID, oldRouterId,
                    routerId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ROUTER__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Switch getSwitch() {
        if (switch_ != null && switch_.eIsProxy()) {
            InternalEObject oldSwitch = (InternalEObject) switch_;
            switch_ = (Switch) eResolveProxy(oldSwitch);
            if (switch_ != oldSwitch) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.ROUTER__SWITCH, oldSwitch,
                            switch_));
            }
        }
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Switch basicGetSwitch() {
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSwitch(Switch newSwitch) {
        Switch oldSwitch = switch_;
        switch_ = newSwitch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ROUTER__SWITCH, oldSwitch, switch_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case NetworkPackage.ROUTER__ROUTER_ID:
            return getRouterId();
        case NetworkPackage.ROUTER__TYPE:
            return getType();
        case NetworkPackage.ROUTER__SWITCH:
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
        case NetworkPackage.ROUTER__ROUTER_ID:
            setRouterId((RouterIdImpl) newValue);
            return;
        case NetworkPackage.ROUTER__TYPE:
            setType((RouterType) newValue);
            return;
        case NetworkPackage.ROUTER__SWITCH:
            setSwitch((Switch) newValue);
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
        case NetworkPackage.ROUTER__ROUTER_ID:
            setRouterId(ROUTER_ID_EDEFAULT);
            return;
        case NetworkPackage.ROUTER__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case NetworkPackage.ROUTER__SWITCH:
            setSwitch((Switch) null);
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
        case NetworkPackage.ROUTER__ROUTER_ID:
            return ROUTER_ID_EDEFAULT == null ? routerId != null : !ROUTER_ID_EDEFAULT.equals(routerId);
        case NetworkPackage.ROUTER__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case NetworkPackage.ROUTER__SWITCH:
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
        result.append(" (routerId: ");
        result.append(routerId);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

    @Override
    public RouterId getId() {
        return routerId.getDomainModel();
    }

} //RouterImpl
