/**
 */
package org.metable.hex.ch01.domain.emf.network.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.metable.hex.ch01.domain.RouterDto;
import org.metable.hex.ch01.domain.RouterType;
import org.metable.hex.ch01.domain.emf.network.NetworkFactory;
import org.metable.hex.ch01.domain.emf.network.NetworkPackage;

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
    private EDataType routerIdEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType routerTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#eNS_URI
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
    public EClass getRouterDto() {
        return routerDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getRouterDto_RouterId() {
        return (EAttribute) routerDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getRouterDto_Type() {
        return (EAttribute) routerDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getIRouterDto() {
        return iRouterDtoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EDataType getRouterId() {
        return routerIdEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EDataType getRouterType() {
        return routerTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
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
        createEAttribute(routerDtoEClass, ROUTER_DTO__ROUTER_ID);
        createEAttribute(routerDtoEClass, ROUTER_DTO__TYPE);

        iRouterDtoEClass = createEClass(IROUTER_DTO);

        // Create data types
        routerIdEDataType = createEDataType(ROUTER_ID);
        routerTypeEDataType = createEDataType(ROUTER_TYPE);
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

        // Initialize classes, features, and operations; add parameters
        initEClass(routerDtoEClass, org.metable.hex.ch01.domain.emf.network.RouterDto.class, "RouterDto", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRouterDto_RouterId(), this.getRouterId(), "routerId", null, 0, 1,
                org.metable.hex.ch01.domain.emf.network.RouterDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRouterDto_Type(), this.getRouterType(), "type", null, 0, 1,
                org.metable.hex.ch01.domain.emf.network.RouterDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iRouterDtoEClass, RouterDto.class, "IRouterDto", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(routerIdEDataType, RouterIdImpl.class, "RouterId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(routerTypeEDataType, RouterType.class, "RouterType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} // NetworkPackageImpl
