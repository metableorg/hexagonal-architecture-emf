/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.metable.hex.ch02.domain.emf.network.NetworkFactory;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.NetworkValueObject;
import org.metable.hex.ch02.domain.valueobject.Protocol;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class NetworkFactoryImpl extends EFactoryImpl implements NetworkFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static NetworkFactory init() {
        try {
            NetworkFactory theNetworkFactory = (NetworkFactory) EPackage.Registry.INSTANCE
                    .getEFactory(NetworkPackage.eNS_URI);
            if (theNetworkFactory != null) {
                return theNetworkFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new NetworkFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NetworkFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case NetworkPackage.ROUTER_DTO:
            return createRouterDto();
        case NetworkPackage.SWITCH_DTO:
            return createSwitchDto();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case NetworkPackage.ROUTER_TYPE:
            return createRouterTypeFromString(eDataType, initialValue);
        case NetworkPackage.SWITCH_TYPE:
            return createSwitchTypeFromString(eDataType, initialValue);
        case NetworkPackage.NETWORK_VALUE_OBJECT:
            return createNetworkValueObjectFromString(eDataType, initialValue);
        case NetworkPackage.IP:
            return createIPFromString(eDataType, initialValue);
        case NetworkPackage.PROTOCOL:
            return createProtocolFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case NetworkPackage.ROUTER_TYPE:
            return convertRouterTypeToString(eDataType, instanceValue);
        case NetworkPackage.SWITCH_TYPE:
            return convertSwitchTypeToString(eDataType, instanceValue);
        case NetworkPackage.NETWORK_VALUE_OBJECT:
            return convertNetworkValueObjectToString(eDataType, instanceValue);
        case NetworkPackage.IP:
            return convertIPToString(eDataType, instanceValue);
        case NetworkPackage.PROTOCOL:
            return convertProtocolToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public RouterDto createRouterDto() {
        RouterDtoImpl routerDto = new RouterDtoImpl();
        return routerDto;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SwitchDto createSwitchDto() {
        SwitchDtoImpl switchDto = new SwitchDtoImpl();
        return switchDto;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public RouterType createRouterTypeFromString(EDataType eDataType, String initialValue) {
        return (RouterType) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertRouterTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SwitchType createSwitchTypeFromString(EDataType eDataType, String initialValue) {
        return (SwitchType) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertSwitchTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NetworkValueObject createNetworkValueObjectFromString(EDataType eDataType, String initialValue) {
        return (NetworkValueObject) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertNetworkValueObjectToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IP createIPFromString(EDataType eDataType, String initialValue) {
        return (IP) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertIPToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
        return (Protocol) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NetworkPackage getNetworkPackage() {
        return (NetworkPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static NetworkPackage getPackage() {
        return NetworkPackage.eINSTANCE;
    }

} // NetworkFactoryImpl
