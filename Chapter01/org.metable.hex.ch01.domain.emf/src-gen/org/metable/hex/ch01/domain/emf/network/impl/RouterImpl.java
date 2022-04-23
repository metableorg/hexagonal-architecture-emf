/**
 */
package org.metable.hex.ch01.domain.emf.network.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.metable.hex.ch01.domain.RouterId;
import org.metable.hex.ch01.domain.RouterType;

import org.metable.hex.ch01.domain.emf.network.NetworkPackage;
import org.metable.hex.ch01.domain.emf.network.Router;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch01.domain.emf.network.impl.RouterImpl#getRouterId <em>Router Id</em>}</li>
 *   <li>{@link org.metable.hex.ch01.domain.emf.network.impl.RouterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends MinimalEObjectImpl.Container implements Router {
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case NetworkPackage.ROUTER__ROUTER_ID:
            return getRouterId();
        case NetworkPackage.ROUTER__TYPE:
            return getType();
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
