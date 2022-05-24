/**
 */
package org.metable.hex.domain.ch02.entity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.Protocol;
import org.metable.hex.domain.ch02.valueobject.RouterId;
import org.metable.hex.domain.ch02.valueobject.SwitchId;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.metable.hex.domain.ch02.entity.EntityFactory
 * @model kind="package"
 * @generated
 */
public class EntityPackage extends EPackageImpl {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String eNAME = "entity";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String eNS_URI = "http://org.metable.hex.domain.ch02.network.emf/entity";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String eNS_PREFIX = "org.metable.hex.domain.ch02.entity";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EntityPackage eINSTANCE = org.metable.hex.domain.ch02.entity.EntityPackage.init();

    /**
     * The meta object id for the '{@link org.metable.hex.domain.ch02.entity.IEvent <em>IEvent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.IEvent
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getIEvent()
     * @generated
     */
    public static final int IEVENT = 1;

    /**
     * The number of structural features of the '<em>IEvent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int IEVENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IEvent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int IEVENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.ch02.entity.EventEmf <em>Event Emf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.EventEmf
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getEventEmf()
     * @generated
     */
    public static final int EVENT_EMF = 0;

    /**
     * The feature id for the '<em><b>Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int EVENT_EMF__ENTITY = IEVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int EVENT_EMF__PROTOCOL = IEVENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Emf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int EVENT_EMF_FEATURE_COUNT = IEVENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Event Emf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int EVENT_EMF_OPERATION_COUNT = IEVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.ch02.entity.ISwitch <em>ISwitch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.ISwitch
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getISwitch()
     * @generated
     */
    public static final int ISWITCH = 2;

    /**
     * The number of structural features of the '<em>ISwitch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ISWITCH_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ISwitch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ISWITCH_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.ch02.entity.IRouter <em>IRouter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.IRouter
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getIRouter()
     * @generated
     */
    public static final int IROUTER = 3;

    /**
     * The number of structural features of the '<em>IRouter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int IROUTER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IRouter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int IROUTER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.ch02.entity.SwitchEmf <em>Switch Emf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.SwitchEmf
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEmf()
     * @generated
     */
    public static final int SWITCH_EMF = 4;

    /**
     * The feature id for the '<em><b>Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int SWITCH_EMF__ENTITY = ISWITCH_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int SWITCH_EMF__ID = ISWITCH_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Networks</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int SWITCH_EMF__NETWORKS = ISWITCH_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Switch Emf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int SWITCH_EMF_FEATURE_COUNT = ISWITCH_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Switch Emf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int SWITCH_EMF_OPERATION_COUNT = ISWITCH_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.ch02.entity.RouterEmf <em>Router Emf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.RouterEmf
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getRouterEmf()
     * @generated
     */
    public static final int ROUTER_EMF = 5;

    /**
     * The feature id for the '<em><b>Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ROUTER_EMF__ENTITY = IROUTER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ROUTER_EMF__ID = IROUTER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Switch</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ROUTER_EMF__SWITCH = IROUTER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Router Emf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ROUTER_EMF_FEATURE_COUNT = IROUTER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Router Emf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int ROUTER_EMF_OPERATION_COUNT = IROUTER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Protocol</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.valueobject.Protocol
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getProtocol()
     * @generated
     */
    public static final int PROTOCOL = 6;

    /**
     * The meta object id for the '<em>Event Entity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.Event
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getEventEntity()
     * @generated
     */
    public static final int EVENT_ENTITY = 7;

    /**
     * The meta object id for the '<em>Router Id</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.valueobject.RouterId
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getRouterId()
     * @generated
     */
    public static final int ROUTER_ID = 8;

    /**
     * The meta object id for the '<em>Switch Id</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.valueobject.SwitchId
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchId()
     * @generated
     */
    public static final int SWITCH_ID = 9;

    /**
     * The meta object id for the '<em>Switch Entity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.Switch
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEntity()
     * @generated
     */
    public static final int SWITCH_ENTITY = 10;

    /**
     * The meta object id for the '<em>Router Entity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.entity.Router
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getRouterEntity()
     * @generated
     */
    public static final int ROUTER_ENTITY = 11;

    /**
     * The meta object id for the '<em>Network</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.ch02.valueobject.Network
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getNetwork()
     * @generated
     */
    public static final int NETWORK = 12;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventEmfEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iEventEClass = null;

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
    private EClass iRouterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchEmfEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass routerEmfEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType protocolEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType eventEntityEDataType = null;

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
    private EDataType switchIdEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType switchEntityEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType routerEntityEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType networkEDataType = null;

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
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EntityPackage() {
        super(eNS_URI, EntityFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link EntityPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EntityPackage init() {
        if (isInited) return (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredEntityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        EntityPackage theEntityPackage = registeredEntityPackage instanceof EntityPackage ? (EntityPackage)registeredEntityPackage : new EntityPackage();

        isInited = true;

        // Create package meta-data objects
        theEntityPackage.createPackageContents();

        // Initialize created meta-data
        theEntityPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theEntityPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI, theEntityPackage);
        return theEntityPackage;
    }


    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.ch02.entity.EventEmf <em>Event Emf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Emf</em>'.
     * @see org.metable.hex.domain.ch02.entity.EventEmf
     * @generated
     */
    public EClass getEventEmf() {
        return eventEmfEClass;
    }

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.ch02.entity.EventEmf#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entity</em>'.
     * @see org.metable.hex.domain.ch02.entity.EventEmf#getEntity()
     * @see #getEventEmf()
     * @generated
     */
    public EAttribute getEventEmf_Entity() {
        return (EAttribute)eventEmfEClass.getEStructuralFeatures().get(0);
    }

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.ch02.entity.EventEmf#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @see org.metable.hex.domain.ch02.entity.EventEmf#getProtocol()
     * @see #getEventEmf()
     * @generated
     */
    public EAttribute getEventEmf_Protocol() {
        return (EAttribute)eventEmfEClass.getEStructuralFeatures().get(1);
    }

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.ch02.entity.IEvent <em>IEvent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IEvent</em>'.
     * @see org.metable.hex.domain.ch02.entity.IEvent
     * @model instanceClass="org.metable.hex.domain.ch02.entity.IEvent"
     * @generated
     */
    public EClass getIEvent() {
        return iEventEClass;
    }

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.ch02.entity.ISwitch <em>ISwitch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ISwitch</em>'.
     * @see org.metable.hex.domain.ch02.entity.ISwitch
     * @model instanceClass="org.metable.hex.domain.ch02.entity.ISwitch"
     * @generated
     */
    public EClass getISwitch() {
        return iSwitchEClass;
    }

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.ch02.entity.IRouter <em>IRouter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IRouter</em>'.
     * @see org.metable.hex.domain.ch02.entity.IRouter
     * @model instanceClass="org.metable.hex.domain.ch02.entity.IRouter"
     * @generated
     */
    public EClass getIRouter() {
        return iRouterEClass;
    }

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.ch02.entity.SwitchEmf <em>Switch Emf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Emf</em>'.
     * @see org.metable.hex.domain.ch02.entity.SwitchEmf
     * @generated
     */
    public EClass getSwitchEmf() {
        return switchEmfEClass;
    }

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entity</em>'.
     * @see org.metable.hex.domain.ch02.entity.SwitchEmf#getEntity()
     * @see #getSwitchEmf()
     * @generated
     */
    public EAttribute getSwitchEmf_Entity() {
        return (EAttribute)switchEmfEClass.getEStructuralFeatures().get(0);
    }


    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.domain.ch02.entity.SwitchEmf#getId()
     * @see #getSwitchEmf()
     * @generated
     */
    public EAttribute getSwitchEmf_Id() {
        return (EAttribute)switchEmfEClass.getEStructuralFeatures().get(1);
    }

    /**
     * Returns the meta object for the attribute list '{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getNetworks <em>Networks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Networks</em>'.
     * @see org.metable.hex.domain.ch02.entity.SwitchEmf#getNetworks()
     * @see #getSwitchEmf()
     * @generated
     */
    public EAttribute getSwitchEmf_Networks() {
        return (EAttribute)switchEmfEClass.getEStructuralFeatures().get(2);
    }


    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.ch02.entity.RouterEmf <em>Router Emf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Router Emf</em>'.
     * @see org.metable.hex.domain.ch02.entity.RouterEmf
     * @generated
     */
    public EClass getRouterEmf() {
        return routerEmfEClass;
    }

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.ch02.entity.RouterEmf#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entity</em>'.
     * @see org.metable.hex.domain.ch02.entity.RouterEmf#getEntity()
     * @see #getRouterEmf()
     * @generated
     */
    public EAttribute getRouterEmf_Entity() {
        return (EAttribute)routerEmfEClass.getEStructuralFeatures().get(0);
    }


    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.ch02.entity.RouterEmf#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.domain.ch02.entity.RouterEmf#getId()
     * @see #getRouterEmf()
     * @generated
     */
    public EAttribute getRouterEmf_Id() {
        return (EAttribute)routerEmfEClass.getEStructuralFeatures().get(1);
    }

    /**
     * Returns the meta object for the containment reference '{@link org.metable.hex.domain.ch02.entity.RouterEmf#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Switch</em>'.
     * @see org.metable.hex.domain.ch02.entity.RouterEmf#getSwitch()
     * @see #getRouterEmf()
     * @generated
     */
    public EReference getRouterEmf_Switch() {
        return (EReference)routerEmfEClass.getEStructuralFeatures().get(2);
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.valueobject.Protocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Protocol</em>'.
     * @see org.metable.hex.domain.ch02.valueobject.Protocol
     * @model instanceClass="org.metable.hex.domain.ch02.valueobject.Protocol"
     * @generated
     */
    public EDataType getProtocol() {
        return protocolEDataType;
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.entity.Event <em>Event Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Event Entity</em>'.
     * @see org.metable.hex.domain.ch02.entity.Event
     * @model instanceClass="org.metable.hex.domain.ch02.entity.Event"
     * @generated
     */
    public EDataType getEventEntity() {
        return eventEntityEDataType;
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.valueobject.RouterId <em>Router Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Router Id</em>'.
     * @see org.metable.hex.domain.ch02.valueobject.RouterId
     * @model instanceClass="org.metable.hex.domain.ch02.valueobject.RouterId"
     * @generated
     */
    public EDataType getRouterId() {
        return routerIdEDataType;
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.valueobject.SwitchId <em>Switch Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Switch Id</em>'.
     * @see org.metable.hex.domain.ch02.valueobject.SwitchId
     * @model instanceClass="org.metable.hex.domain.ch02.valueobject.SwitchId"
     * @generated
     */
    public EDataType getSwitchId() {
        return switchIdEDataType;
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.entity.Switch <em>Switch Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Switch Entity</em>'.
     * @see org.metable.hex.domain.ch02.entity.Switch
     * @model instanceClass="org.metable.hex.domain.ch02.entity.Switch"
     * @generated
     */
    public EDataType getSwitchEntity() {
        return switchEntityEDataType;
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.entity.Router <em>Router Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Router Entity</em>'.
     * @see org.metable.hex.domain.ch02.entity.Router
     * @model instanceClass="org.metable.hex.domain.ch02.entity.Router"
     * @generated
     */
    public EDataType getRouterEntity() {
        return routerEntityEDataType;
    }

    /**
     * Returns the meta object for data type '{@link org.metable.hex.domain.ch02.valueobject.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Network</em>'.
     * @see org.metable.hex.domain.ch02.valueobject.Network
     * @model instanceClass="org.metable.hex.domain.ch02.valueobject.Network"
     * @generated
     */
    public EDataType getNetwork() {
        return networkEDataType;
    }


    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    public EntityFactory getEntityFactory() {
        return (EntityFactory)getEFactoryInstance();
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
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        eventEmfEClass = createEClass(EVENT_EMF);
        createEAttribute(eventEmfEClass, EVENT_EMF__ENTITY);
        createEAttribute(eventEmfEClass, EVENT_EMF__PROTOCOL);

        iEventEClass = createEClass(IEVENT);

        iSwitchEClass = createEClass(ISWITCH);

        iRouterEClass = createEClass(IROUTER);

        switchEmfEClass = createEClass(SWITCH_EMF);
        createEAttribute(switchEmfEClass, SWITCH_EMF__ENTITY);
        createEAttribute(switchEmfEClass, SWITCH_EMF__ID);
        createEAttribute(switchEmfEClass, SWITCH_EMF__NETWORKS);

        routerEmfEClass = createEClass(ROUTER_EMF);
        createEAttribute(routerEmfEClass, ROUTER_EMF__ENTITY);
        createEAttribute(routerEmfEClass, ROUTER_EMF__ID);
        createEReference(routerEmfEClass, ROUTER_EMF__SWITCH);

        // Create data types
        protocolEDataType = createEDataType(PROTOCOL);
        eventEntityEDataType = createEDataType(EVENT_ENTITY);
        routerIdEDataType = createEDataType(ROUTER_ID);
        switchIdEDataType = createEDataType(SWITCH_ID);
        switchEntityEDataType = createEDataType(SWITCH_ENTITY);
        routerEntityEDataType = createEDataType(ROUTER_ENTITY);
        networkEDataType = createEDataType(NETWORK);
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
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        eventEmfEClass.getESuperTypes().add(this.getIEvent());
        switchEmfEClass.getESuperTypes().add(this.getISwitch());
        routerEmfEClass.getESuperTypes().add(this.getIRouter());

        // Initialize classes, features, and operations; add parameters
        initEClass(eventEmfEClass, EventEmf.class, "EventEmf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventEmf_Entity(), this.getEventEntity(), "entity", null, 0, 1, EventEmf.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEventEmf_Protocol(), this.getProtocol(), "protocol", null, 0, 1, EventEmf.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iEventEClass, IEvent.class, "IEvent", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        initEClass(iSwitchEClass, ISwitch.class, "ISwitch", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        initEClass(iRouterEClass, IRouter.class, "IRouter", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        initEClass(switchEmfEClass, SwitchEmf.class, "SwitchEmf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSwitchEmf_Entity(), this.getSwitchEntity(), "entity", null, 0, 1, SwitchEmf.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchEmf_Id(), this.getSwitchId(), "id", null, 0, 1, SwitchEmf.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSwitchEmf_Networks(), this.getNetwork(), "networks", null, 0, -1, SwitchEmf.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(routerEmfEClass, RouterEmf.class, "RouterEmf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRouterEmf_Entity(), this.getRouterEntity(), "entity", null, 0, 1, RouterEmf.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRouterEmf_Id(), this.getRouterId(), "id", null, 0, 1, RouterEmf.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRouterEmf_Switch(), this.getSwitchEmf(), null, "switch", null, 0, 1, RouterEmf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(protocolEDataType, Protocol.class, "Protocol", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(eventEntityEDataType, Event.class, "EventEntity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(routerIdEDataType, RouterId.class, "RouterId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(switchIdEDataType, SwitchId.class, "SwitchId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(switchEntityEDataType, Switch.class, "SwitchEntity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(routerEntityEDataType, Router.class, "RouterEntity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(networkEDataType, Network.class, "Network", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    public interface Literals {
        /**
         * The meta object literal for the '{@link org.metable.hex.domain.ch02.entity.EventEmf <em>Event Emf</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.EventEmf
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getEventEmf()
         * @generated
         */
        public static final EClass EVENT_EMF = eINSTANCE.getEventEmf();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute EVENT_EMF__ENTITY = eINSTANCE.getEventEmf_Entity();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute EVENT_EMF__PROTOCOL = eINSTANCE.getEventEmf_Protocol();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.ch02.entity.IEvent <em>IEvent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.IEvent
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getIEvent()
         * @generated
         */
        public static final EClass IEVENT = eINSTANCE.getIEvent();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.ch02.entity.ISwitch <em>ISwitch</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.ISwitch
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getISwitch()
         * @generated
         */
        public static final EClass ISWITCH = eINSTANCE.getISwitch();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.ch02.entity.IRouter <em>IRouter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.IRouter
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getIRouter()
         * @generated
         */
        public static final EClass IROUTER = eINSTANCE.getIRouter();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.ch02.entity.SwitchEmf <em>Switch Emf</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.SwitchEmf
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEmf()
         * @generated
         */
        public static final EClass SWITCH_EMF = eINSTANCE.getSwitchEmf();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute SWITCH_EMF__ENTITY = eINSTANCE.getSwitchEmf_Entity();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute SWITCH_EMF__ID = eINSTANCE.getSwitchEmf_Id();

        /**
         * The meta object literal for the '<em><b>Networks</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute SWITCH_EMF__NETWORKS = eINSTANCE.getSwitchEmf_Networks();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.ch02.entity.RouterEmf <em>Router Emf</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.RouterEmf
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getRouterEmf()
         * @generated
         */
        public static final EClass ROUTER_EMF = eINSTANCE.getRouterEmf();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute ROUTER_EMF__ENTITY = eINSTANCE.getRouterEmf_Entity();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute ROUTER_EMF__ID = eINSTANCE.getRouterEmf_Id();

        /**
         * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EReference ROUTER_EMF__SWITCH = eINSTANCE.getRouterEmf_Switch();

        /**
         * The meta object literal for the '<em>Protocol</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.valueobject.Protocol
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getProtocol()
         * @generated
         */
        public static final EDataType PROTOCOL = eINSTANCE.getProtocol();

        /**
         * The meta object literal for the '<em>Event Entity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.Event
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getEventEntity()
         * @generated
         */
        public static final EDataType EVENT_ENTITY = eINSTANCE.getEventEntity();

        /**
         * The meta object literal for the '<em>Router Id</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.valueobject.RouterId
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getRouterId()
         * @generated
         */
        public static final EDataType ROUTER_ID = eINSTANCE.getRouterId();

        /**
         * The meta object literal for the '<em>Switch Id</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.valueobject.SwitchId
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchId()
         * @generated
         */
        public static final EDataType SWITCH_ID = eINSTANCE.getSwitchId();

        /**
         * The meta object literal for the '<em>Switch Entity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.Switch
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEntity()
         * @generated
         */
        public static final EDataType SWITCH_ENTITY = eINSTANCE.getSwitchEntity();

        /**
         * The meta object literal for the '<em>Router Entity</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.entity.Router
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getRouterEntity()
         * @generated
         */
        public static final EDataType ROUTER_ENTITY = eINSTANCE.getRouterEntity();

        /**
         * The meta object literal for the '<em>Network</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.ch02.valueobject.Network
         * @see org.metable.hex.domain.ch02.entity.EntityPackage#getNetwork()
         * @generated
         */
        public static final EDataType NETWORK = eINSTANCE.getNetwork();

    }

} //EntityPackage
