/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.metable.hex.ch02.domain.emf.network.*;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.Protocol;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkFactoryImpl extends EFactoryImpl implements NetworkFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case NetworkPackage.ROUTER:
            return createRouter();
        case NetworkPackage.SWITCH:
            return createSwitch();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case NetworkPackage.ROUTER_TYPE:
            return createRouterTypeFromString(eDataType, initialValue);
        case NetworkPackage.ROUTER_ID:
            return createRouterIdFromString(eDataType, initialValue);
        case NetworkPackage.SWITCH_TYPE:
            return createSwitchTypeFromString(eDataType, initialValue);
        case NetworkPackage.SWITCH_ID:
            return createSwitchIdFromString(eDataType, initialValue);
        case NetworkPackage.NETWORK:
            return createNetworkFromString(eDataType, initialValue);
        case NetworkPackage.IP:
            return createIPFromString(eDataType, initialValue);
        case NetworkPackage.PROTOCOL:
            return createProtocolFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case NetworkPackage.ROUTER_TYPE:
            return convertRouterTypeToString(eDataType, instanceValue);
        case NetworkPackage.ROUTER_ID:
            return convertRouterIdToString(eDataType, instanceValue);
        case NetworkPackage.SWITCH_TYPE:
            return convertSwitchTypeToString(eDataType, instanceValue);
        case NetworkPackage.SWITCH_ID:
            return convertSwitchIdToString(eDataType, instanceValue);
        case NetworkPackage.NETWORK:
            return convertNetworkToString(eDataType, instanceValue);
        case NetworkPackage.IP:
            return convertIPToString(eDataType, instanceValue);
        case NetworkPackage.PROTOCOL:
            return convertProtocolToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Router createRouter() {
        RouterImpl router = new RouterImpl();
        return router;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Switch createSwitch() {
        SwitchImpl switch_ = new SwitchImpl();
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RouterType createRouterTypeFromString(EDataType eDataType, String initialValue) {
        return (RouterType) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRouterTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RouterIdImpl createRouterIdFromString(EDataType eDataType, String initialValue) {
        return (RouterIdImpl) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRouterIdToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchType createSwitchTypeFromString(EDataType eDataType, String initialValue) {
        return (SwitchType) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchIdImpl createSwitchIdFromString(EDataType eDataType, String initialValue) {
        return (SwitchIdImpl) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchIdToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Network createNetworkFromString(EDataType eDataType, String initialValue) {
        return (Network) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNetworkToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IP createIPFromString(EDataType eDataType, String initialValue) {
        return (IP) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIPToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
        return (Protocol) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkPackage getNetworkPackage() {
        return (NetworkPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static NetworkPackage getPackage() {
        return NetworkPackage.eINSTANCE;
    }

} //NetworkFactoryImpl
