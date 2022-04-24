/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.metable.hex.ch02.domain.emf.network.NetworkFactory;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.Router;
import org.metable.hex.ch02.domain.emf.network.Switch;

import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.Protocol;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkPackageImpl extends EPackageImpl implements NetworkPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass routerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iRouterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iSwitchEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType routerTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType routerIdEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType switchTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType switchIdEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType networkEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType ipEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType protocolEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private NetworkPackageImpl() {
        super(eNS_URI, NetworkFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link NetworkPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static NetworkPackage init() {
        if (isInited)
            return (NetworkPackage) EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredNetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        NetworkPackageImpl theNetworkPackage = registeredNetworkPackage instanceof NetworkPackageImpl
                ? (NetworkPackageImpl) registeredNetworkPackage
                : new NetworkPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theNetworkPackage.createPackageContents();

        // Initialize created meta-data
        theNetworkPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theNetworkPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(NetworkPackage.eNS_URI, theNetworkPackage);
        return theNetworkPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRouter() {
        return routerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRouter_RouterId() {
        return (EAttribute) routerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRouter_Type() {
        return (EAttribute) routerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRouter_Switch() {
        return (EReference) routerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIRouter() {
        return iRouterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSwitch() {
        return switchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSwitch_Networks() {
        return (EAttribute) switchEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSwitch_Type() {
        return (EAttribute) switchEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSwitch_SwitchId() {
        return (EAttribute) switchEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSwitch_IpAddress() {
        return (EAttribute) switchEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getISwitch() {
        return iSwitchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRouterType() {
        return routerTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRouterId() {
        return routerIdEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSwitchType() {
        return switchTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSwitchId() {
        return switchIdEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNetwork() {
        return networkEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIP() {
        return ipEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getProtocol() {
        return protocolEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkFactory getNetworkFactory() {
        return (NetworkFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        routerEClass = createEClass(ROUTER);
        createEAttribute(routerEClass, ROUTER__ROUTER_ID);
        createEAttribute(routerEClass, ROUTER__TYPE);
        createEReference(routerEClass, ROUTER__SWITCH);

        iRouterEClass = createEClass(IROUTER);

        switchEClass = createEClass(SWITCH);
        createEAttribute(switchEClass, SWITCH__NETWORKS);
        createEAttribute(switchEClass, SWITCH__TYPE);
        createEAttribute(switchEClass, SWITCH__SWITCH_ID);
        createEAttribute(switchEClass, SWITCH__IP_ADDRESS);

        iSwitchEClass = createEClass(ISWITCH);

        // Create data types
        routerTypeEDataType = createEDataType(ROUTER_TYPE);
        routerIdEDataType = createEDataType(ROUTER_ID);
        switchTypeEDataType = createEDataType(SWITCH_TYPE);
        switchIdEDataType = createEDataType(SWITCH_ID);
        networkEDataType = createEDataType(NETWORK);
        ipEDataType = createEDataType(IP);
        protocolEDataType = createEDataType(PROTOCOL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        routerEClass.getESuperTypes().add(this.getIRouter());
        switchEClass.getESuperTypes().add(this.getISwitch());

        // Initialize classes, features, and operations; add parameters
        initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRouter_RouterId(), this.getRouterId(), "routerId", null, 0, 1, Router.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRouter_Type(), this.getRouterType(), "type", null, 0, 1, Router.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRouter_Switch(), this.getSwitch(), null, "switch", null, 0, 1, Router.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(iRouterEClass, org.metable.hex.ch02.domain.entity.Router.class, "IRouter", IS_ABSTRACT,
                !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSwitch_Networks(), this.getNetwork(), "networks", null, 0, -1, Switch.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitch_Type(), this.getSwitchType(), "type", null, 0, 1, Switch.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitch_SwitchId(), this.getSwitchId(), "switchId", null, 0, 1, Switch.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitch_IpAddress(), this.getIP(), "ipAddress", null, 0, 1, Switch.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iSwitchEClass, org.metable.hex.ch02.domain.entity.Switch.class, "ISwitch", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(routerTypeEDataType, RouterType.class, "RouterType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(routerIdEDataType, RouterIdImpl.class, "RouterId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(switchTypeEDataType, SwitchType.class, "SwitchType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(switchIdEDataType, SwitchIdImpl.class, "SwitchId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(networkEDataType, Network.class, "Network", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(ipEDataType, org.metable.hex.ch02.domain.valueobject.IP.class, "IP", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(protocolEDataType, Protocol.class, "Protocol", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //NetworkPackageImpl
