/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.metable.hex.ch02.domain.emf.network.EventDto;
import org.metable.hex.ch02.domain.emf.network.NetworkFactory;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;
import org.metable.hex.ch02.domain.valueobject.NetworkValueObject;
import org.metable.hex.ch02.domain.valueobject.Protocol;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class NetworkPackageImpl extends EPackageImpl implements NetworkPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass routerDtoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass iRouterDtoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass switchDtoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass iSwitchDtoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eventDtoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass iEventDtoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType routerTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType switchTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType networkValueObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType ipEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType protocolEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private NetworkPackageImpl() {
        super(eNS_URI, NetworkFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link NetworkPackage#eINSTANCE} when that field is accessed. Clients should
     * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRouterDto() {
        return routerDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getRouterDto_Id() {
        return (EAttribute) routerDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getRouterDto_Type() {
        return (EAttribute) routerDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRouterDto_Switch() {
        return (EReference) routerDtoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIRouterDto() {
        return iRouterDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getSwitchDto() {
        return switchDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSwitchDto_NetworkValueObjects() {
        return (EAttribute) switchDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSwitchDto_Type() {
        return (EAttribute) switchDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSwitchDto_Id() {
        return (EAttribute) switchDtoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getSwitchDto_Address() {
        return (EAttribute) switchDtoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getISwitchDto() {
        return iSwitchDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEventDto() {
        return eventDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEventDto_LogEntry() {
        return (EAttribute) eventDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEventDto_Id() {
        return (EAttribute) eventDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIEventDto() {
        return iEventDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getRouterType() {
        return routerTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getSwitchType() {
        return switchTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getNetworkValueObject() {
        return networkValueObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getIP() {
        return ipEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getProtocol() {
        return protocolEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NetworkFactory getNetworkFactory() {
        return (NetworkFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
     * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        routerDtoEClass = createEClass(ROUTER_DTO);
        createEAttribute(routerDtoEClass, ROUTER_DTO__ID);
        createEAttribute(routerDtoEClass, ROUTER_DTO__TYPE);
        createEReference(routerDtoEClass, ROUTER_DTO__SWITCH);

        iRouterDtoEClass = createEClass(IROUTER_DTO);

        switchDtoEClass = createEClass(SWITCH_DTO);
        createEAttribute(switchDtoEClass, SWITCH_DTO__NETWORK_VALUE_OBJECTS);
        createEAttribute(switchDtoEClass, SWITCH_DTO__TYPE);
        createEAttribute(switchDtoEClass, SWITCH_DTO__ID);
        createEAttribute(switchDtoEClass, SWITCH_DTO__ADDRESS);

        iSwitchDtoEClass = createEClass(ISWITCH_DTO);

        eventDtoEClass = createEClass(EVENT_DTO);
        createEAttribute(eventDtoEClass, EVENT_DTO__LOG_ENTRY);
        createEAttribute(eventDtoEClass, EVENT_DTO__ID);

        iEventDtoEClass = createEClass(IEVENT_DTO);

        // Create data types
        routerTypeEDataType = createEDataType(ROUTER_TYPE);
        switchTypeEDataType = createEDataType(SWITCH_TYPE);
        networkValueObjectEDataType = createEDataType(NETWORK_VALUE_OBJECT);
        ipEDataType = createEDataType(IP);
        protocolEDataType = createEDataType(PROTOCOL);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
     * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
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
        routerDtoEClass.getESuperTypes().add(this.getIRouterDto());
        switchDtoEClass.getESuperTypes().add(this.getISwitchDto());
        eventDtoEClass.getESuperTypes().add(this.getIEventDto());

        // Initialize classes, features, and operations; add parameters
        initEClass(routerDtoEClass, RouterDto.class, "RouterDto", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRouterDto_Id(), ecorePackage.getEString(), "id", null, 0, 1, RouterDto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRouterDto_Type(), this.getRouterType(), "type", null, 0, 1, RouterDto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRouterDto_Switch(), this.getSwitchDto(), null, "switch", null, 0, 1, RouterDto.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iRouterDtoEClass, org.metable.hex.ch02.domain.entity.RouterDto.class, "IRouterDto", IS_ABSTRACT,
                !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        initEClass(switchDtoEClass, SwitchDto.class, "SwitchDto", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSwitchDto_NetworkValueObjects(), this.getNetworkValueObject(), "networkValueObjects", null, 0,
                -1, SwitchDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchDto_Type(), this.getSwitchType(), "type", null, 0, 1, SwitchDto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchDto_Id(), ecorePackage.getEString(), "id", null, 0, 1, SwitchDto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchDto_Address(), this.getIP(), "address", null, 0, 1, SwitchDto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(iSwitchDtoEClass, org.metable.hex.ch02.domain.entity.SwitchDto.class, "ISwitchDto", IS_ABSTRACT,
                IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        initEClass(eventDtoEClass, EventDto.class, "EventDto", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventDto_LogEntry(), ecorePackage.getEString(), "logEntry", null, 0, 1, EventDto.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEventDto_Id(), ecorePackage.getEString(), "id", null, 0, 1, EventDto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iEventDtoEClass, org.metable.hex.ch02.domain.entity.EventDto.class, "IEventDto", IS_ABSTRACT,
                !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(routerTypeEDataType, RouterType.class, "RouterType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(switchTypeEDataType, SwitchType.class, "SwitchType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(networkValueObjectEDataType, NetworkValueObject.class, "NetworkValueObject", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(ipEDataType, org.metable.hex.ch02.domain.valueobject.IP.class, "IP", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(protocolEDataType, Protocol.class, "Protocol", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} // NetworkPackageImpl
