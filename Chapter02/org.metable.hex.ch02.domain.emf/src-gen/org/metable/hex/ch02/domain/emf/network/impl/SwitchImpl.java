/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.Switch;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchId;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl#getSwitchId <em>Switch Id</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl#getIpAddress <em>Ip Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends MinimalEObjectImpl.Container implements Switch {
    /**
     * The cached value of the '{@link #getNetworks() <em>Networks</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNetworks()
     * @generated
     * @ordered
     */
    protected EList<Network> networks;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final SwitchType TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SwitchType type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getSwitchId() <em>Switch Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchId()
     * @generated
     * @ordered
     */
    protected static final SwitchIdImpl SWITCH_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchId() <em>Switch Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchId()
     * @generated
     * @ordered
     */
    protected SwitchIdImpl switchId = SWITCH_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIpAddress()
     * @generated
     * @ordered
     */
    protected static final IP IP_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIpAddress()
     * @generated
     * @ordered
     */
    protected IP ipAddress = IP_ADDRESS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NetworkPackage.Literals.SWITCH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Network> getNetworks() {
        if (networks == null) {
            networks = new EDataTypeUniqueEList<Network>(Network.class, this, NetworkPackage.SWITCH__NETWORKS);
        }
        return networks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(SwitchType newType) {
        SwitchType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.SWITCH__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchIdImpl getSwitchId() {
        return switchId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSwitchId(SwitchIdImpl newSwitchId) {
        SwitchIdImpl oldSwitchId = switchId;
        switchId = newSwitchId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.SWITCH__SWITCH_ID, oldSwitchId,
                    switchId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IP getIpAddress() {
        return ipAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIpAddress(IP newIpAddress) {
        IP oldIpAddress = ipAddress;
        ipAddress = newIpAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.SWITCH__IP_ADDRESS, oldIpAddress,
                    ipAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case NetworkPackage.SWITCH__NETWORKS:
            return getNetworks();
        case NetworkPackage.SWITCH__TYPE:
            return getType();
        case NetworkPackage.SWITCH__SWITCH_ID:
            return getSwitchId();
        case NetworkPackage.SWITCH__IP_ADDRESS:
            return getIpAddress();
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
        case NetworkPackage.SWITCH__NETWORKS:
            getNetworks().clear();
            getNetworks().addAll((Collection<? extends Network>) newValue);
            return;
        case NetworkPackage.SWITCH__TYPE:
            setType((SwitchType) newValue);
            return;
        case NetworkPackage.SWITCH__SWITCH_ID:
            setSwitchId((SwitchIdImpl) newValue);
            return;
        case NetworkPackage.SWITCH__IP_ADDRESS:
            setIpAddress((IP) newValue);
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
        case NetworkPackage.SWITCH__NETWORKS:
            getNetworks().clear();
            return;
        case NetworkPackage.SWITCH__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case NetworkPackage.SWITCH__SWITCH_ID:
            setSwitchId(SWITCH_ID_EDEFAULT);
            return;
        case NetworkPackage.SWITCH__IP_ADDRESS:
            setIpAddress(IP_ADDRESS_EDEFAULT);
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
        case NetworkPackage.SWITCH__NETWORKS:
            return networks != null && !networks.isEmpty();
        case NetworkPackage.SWITCH__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case NetworkPackage.SWITCH__SWITCH_ID:
            return SWITCH_ID_EDEFAULT == null ? switchId != null : !SWITCH_ID_EDEFAULT.equals(switchId);
        case NetworkPackage.SWITCH__IP_ADDRESS:
            return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
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
        result.append(" (networks: ");
        result.append(networks);
        result.append(", type: ");
        result.append(type);
        result.append(", switchId: ");
        result.append(switchId);
        result.append(", ipAddress: ");
        result.append(ipAddress);
        result.append(')');
        return result.toString();
    }

    @Override
    public org.metable.hex.ch02.domain.entity.Switch addNetwork(Network network) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SwitchId getId() {
        return switchId.getDomainModel();
    }

} //SwitchImpl
