/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Switch Dto</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl#getNetworkValueObjects <em>Network Value
 * Objects</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl#getType <em>Type</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl#getId <em>Id</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchDtoImpl extends MinimalEObjectImpl.Container implements SwitchDto {
    /**
     * The cached value of the '{@link #getNetworkValueObjects() <em>Network Value Objects</em>}' attribute list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNetworkValueObjects()
     * @generated
     * @ordered
     */
    protected EList<NetworkValueObject> networkValueObjects;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final SwitchType TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SwitchType type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final IP ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected IP address = ADDRESS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SwitchDtoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NetworkPackage.Literals.SWITCH_DTO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<NetworkValueObject> getNetworkValueObjects() {
        if (networkValueObjects == null) {
            networkValueObjects = new EDataTypeUniqueEList<NetworkValueObject>(NetworkValueObject.class, this,
                    NetworkPackage.SWITCH_DTO__NETWORK_VALUE_OBJECTS);
        }
        return networkValueObjects;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SwitchType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setType(SwitchType newType) {
        SwitchType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.SWITCH_DTO__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.SWITCH_DTO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public IP getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setAddress(IP newAddress) {
        IP oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.SWITCH_DTO__ADDRESS, oldAddress,
                    address));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case NetworkPackage.SWITCH_DTO__NETWORK_VALUE_OBJECTS:
            return getNetworkValueObjects();
        case NetworkPackage.SWITCH_DTO__TYPE:
            return getType();
        case NetworkPackage.SWITCH_DTO__ID:
            return getId();
        case NetworkPackage.SWITCH_DTO__ADDRESS:
            return getAddress();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case NetworkPackage.SWITCH_DTO__NETWORK_VALUE_OBJECTS:
            getNetworkValueObjects().clear();
            getNetworkValueObjects().addAll((Collection<? extends NetworkValueObject>) newValue);
            return;
        case NetworkPackage.SWITCH_DTO__TYPE:
            setType((SwitchType) newValue);
            return;
        case NetworkPackage.SWITCH_DTO__ID:
            setId((String) newValue);
            return;
        case NetworkPackage.SWITCH_DTO__ADDRESS:
            setAddress((IP) newValue);
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
        case NetworkPackage.SWITCH_DTO__NETWORK_VALUE_OBJECTS:
            getNetworkValueObjects().clear();
            return;
        case NetworkPackage.SWITCH_DTO__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case NetworkPackage.SWITCH_DTO__ID:
            setId(ID_EDEFAULT);
            return;
        case NetworkPackage.SWITCH_DTO__ADDRESS:
            setAddress(ADDRESS_EDEFAULT);
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
        case NetworkPackage.SWITCH_DTO__NETWORK_VALUE_OBJECTS:
            return networkValueObjects != null && !networkValueObjects.isEmpty();
        case NetworkPackage.SWITCH_DTO__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case NetworkPackage.SWITCH_DTO__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        case NetworkPackage.SWITCH_DTO__ADDRESS:
            return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
        result.append(" (networkValueObjects: ");
        result.append(networkValueObjects);
        result.append(", type: ");
        result.append(type);
        result.append(", id: ");
        result.append(id);
        result.append(", address: ");
        result.append(address);
        result.append(')');
        return result.toString();
    }

    /**
     * @generated OFF
     */
    @Override
    public List<Network> getNetworks() {
        return Collections.unmodifiableList(
                getNetworkValueObjects().stream().map(n -> n.getNetwork()).collect(Collectors.toList()));
    }

} // SwitchDtoImpl
