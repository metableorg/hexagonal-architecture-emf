/**
 */
package org.metable.hex.ch02.domain.emf.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.metable.hex.ch02.domain.emf.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "network";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://org.metable.hex.ch02.domain.network.emf/network";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "org.metable.hex.ch02.domain.network.emf";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    NetworkPackage eINSTANCE = org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl.init();

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl <em>IRouter
     * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIRouterDto()
     * @generated
     */
    int IROUTER_DTO = 1;

    /**
     * The number of structural features of the '<em>IRouter Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int IROUTER_DTO_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IRouter Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IROUTER_DTO_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl <em>Router
     * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterDto()
     * @generated
     */
    int ROUTER_DTO = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO__ID = IROUTER_DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO__TYPE = IROUTER_DTO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Switch</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO__SWITCH = IROUTER_DTO_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Router Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO_FEATURE_COUNT = IROUTER_DTO_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Router Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO_OPERATION_COUNT = IROUTER_DTO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch Dto</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.entity.SwitchDto
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getISwitchDto()
     * @generated
     */
    int ISWITCH_DTO = 3;

    /**
     * The number of structural features of the '<em>ISwitch Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ISWITCH_DTO_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ISwitch Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ISWITCH_DTO_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl <em>Switch
     * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchDto()
     * @generated
     */
    int SWITCH_DTO = 2;

    /**
     * The feature id for the '<em><b>Network Value Objects</b></em>' attribute list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SWITCH_DTO__NETWORK_VALUE_OBJECTS = ISWITCH_DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SWITCH_DTO__TYPE = ISWITCH_DTO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SWITCH_DTO__ID = ISWITCH_DTO_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SWITCH_DTO__ADDRESS = ISWITCH_DTO_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Switch Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SWITCH_DTO_FEATURE_COUNT = ISWITCH_DTO_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Switch Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SWITCH_DTO_OPERATION_COUNT = ISWITCH_DTO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IEventDtoImpl <em>IEvent
     * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.emf.network.impl.IEventDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIEventDto()
     * @generated
     */
    int IEVENT_DTO = 5;

    /**
     * The number of structural features of the '<em>IEvent Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int IEVENT_DTO_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IEvent Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IEVENT_DTO_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.EventDtoImpl <em>Event Dto</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.emf.network.impl.EventDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getEventDto()
     * @generated
     */
    int EVENT_DTO = 4;

    /**
     * The feature id for the '<em><b>Log Entry</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EVENT_DTO__LOG_ENTRY = IEVENT_DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EVENT_DTO__ID = IEVENT_DTO_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EVENT_DTO_FEATURE_COUNT = IEVENT_DTO_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Event Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EVENT_DTO_OPERATION_COUNT = IEVENT_DTO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Router Type</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.valueobject.RouterType
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
     * @generated
     */
    int ROUTER_TYPE = 6;

    /**
     * The meta object id for the '<em>Switch Type</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.valueobject.SwitchType
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchType()
     * @generated
     */
    int SWITCH_TYPE = 7;

    /**
     * The meta object id for the '<em>Value Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.valueobject.NetworkValueObject
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getNetworkValueObject()
     * @generated
     */
    int NETWORK_VALUE_OBJECT = 8;

    /**
     * The meta object id for the '<em>IP</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.valueobject.IP
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIP()
     * @generated
     */
    int IP = 9;

    /**
     * The meta object id for the '<em>Protocol</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch02.domain.valueobject.Protocol
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getProtocol()
     * @generated
     */
    int PROTOCOL = 10;

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.RouterDto <em>Router
     * Dto</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Router Dto</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto
     * @generated
     */
    EClass getRouterDto();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.RouterDto#getId
     * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto#getId()
     * @see #getRouterDto()
     * @generated
     */
    EAttribute getRouterDto_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.RouterDto#getType
     * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto#getType()
     * @see #getRouterDto()
     * @generated
     */
    EAttribute getRouterDto_Type();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.metable.hex.ch02.domain.emf.network.RouterDto#getSwitch <em>Switch</em>}'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Switch</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto#getSwitch()
     * @see #getRouterDto()
     * @generated
     */
    EReference getRouterDto_Switch();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.RouterDto <em>IRouter Dto</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>IRouter Dto</em>'.
     * @see org.metable.hex.ch02.domain.entity.RouterDto
     * @model instanceClass="org.metable.hex.ch02.domain.entity.RouterDto"
     * @generated
     */
    EClass getIRouterDto();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto <em>Switch
     * Dto</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Switch Dto</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto
     * @generated
     */
    EClass getSwitchDto();

    /**
     * Returns the meta object for the attribute list
     * '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getNetworkValueObjects <em>Network Value
     * Objects</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute list '<em>Network Value Objects</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getNetworkValueObjects()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_NetworkValueObjects();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getType
     * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getType()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_Type();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getId
     * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getId()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getAddress
     * <em>Address</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getAddress()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_Address();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch Dto</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>ISwitch Dto</em>'.
     * @see org.metable.hex.ch02.domain.entity.SwitchDto
     * @model instanceClass="org.metable.hex.ch02.domain.entity.SwitchDto"
     * @generated
     */
    EClass getISwitchDto();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.EventDto <em>Event Dto</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Event Dto</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.EventDto
     * @generated
     */
    EClass getEventDto();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.EventDto#getLogEntry
     * <em>Log Entry</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Log Entry</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.EventDto#getLogEntry()
     * @see #getEventDto()
     * @generated
     */
    EAttribute getEventDto_LogEntry();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.EventDto#getId
     * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.EventDto#getId()
     * @see #getEventDto()
     * @generated
     */
    EAttribute getEventDto_Id();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.EventDto <em>IEvent Dto</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>IEvent Dto</em>'.
     * @see org.metable.hex.ch02.domain.entity.EventDto
     * @model instanceClass="org.metable.hex.ch02.domain.entity.EventDto"
     * @generated
     */
    EClass getIEventDto();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.RouterType <em>Router
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>Router Type</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.RouterType
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.RouterType"
     * @generated
     */
    EDataType getRouterType();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.SwitchType <em>Switch
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>Switch Type</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.SwitchType
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.SwitchType"
     * @generated
     */
    EDataType getSwitchType();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.NetworkValueObject
     * <em>Value Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>Value Object</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.NetworkValueObject
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.NetworkValueObject"
     * @generated
     */
    EDataType getNetworkValueObject();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.IP <em>IP</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>IP</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.IP
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.IP"
     * @generated
     */
    EDataType getIP();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.Protocol
     * <em>Protocol</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>Protocol</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.Protocol
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.Protocol"
     * @generated
     */
    EDataType getProtocol();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NetworkFactory getNetworkFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl <em>Router
         * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterDto()
         * @generated
         */
        EClass ROUTER_DTO = eINSTANCE.getRouterDto();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute ROUTER_DTO__ID = eINSTANCE.getRouterDto_Id();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute ROUTER_DTO__TYPE = eINSTANCE.getRouterDto_Type();

        /**
         * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference ROUTER_DTO__SWITCH = eINSTANCE.getRouterDto_Switch();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl
         * <em>IRouter Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIRouterDto()
         * @generated
         */
        EClass IROUTER_DTO = eINSTANCE.getIRouterDto();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl <em>Switch
         * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchDto()
         * @generated
         */
        EClass SWITCH_DTO = eINSTANCE.getSwitchDto();

        /**
         * The meta object literal for the '<em><b>Network Value Objects</b></em>' attribute list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute SWITCH_DTO__NETWORK_VALUE_OBJECTS = eINSTANCE.getSwitchDto_NetworkValueObjects();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute SWITCH_DTO__TYPE = eINSTANCE.getSwitchDto_Type();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute SWITCH_DTO__ID = eINSTANCE.getSwitchDto_Id();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute SWITCH_DTO__ADDRESS = eINSTANCE.getSwitchDto_Address();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch Dto</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.entity.SwitchDto
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getISwitchDto()
         * @generated
         */
        EClass ISWITCH_DTO = eINSTANCE.getISwitchDto();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.EventDtoImpl <em>Event
         * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.emf.network.impl.EventDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getEventDto()
         * @generated
         */
        EClass EVENT_DTO = eINSTANCE.getEventDto();

        /**
         * The meta object literal for the '<em><b>Log Entry</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute EVENT_DTO__LOG_ENTRY = eINSTANCE.getEventDto_LogEntry();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @generated
         */
        EAttribute EVENT_DTO__ID = eINSTANCE.getEventDto_Id();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IEventDtoImpl <em>IEvent
         * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.emf.network.impl.IEventDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIEventDto()
         * @generated
         */
        EClass IEVENT_DTO = eINSTANCE.getIEventDto();

        /**
         * The meta object literal for the '<em>Router Type</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see org.metable.hex.ch02.domain.valueobject.RouterType
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
         * @generated
         */
        EDataType ROUTER_TYPE = eINSTANCE.getRouterType();

        /**
         * The meta object literal for the '<em>Switch Type</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see org.metable.hex.ch02.domain.valueobject.SwitchType
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchType()
         * @generated
         */
        EDataType SWITCH_TYPE = eINSTANCE.getSwitchType();

        /**
         * The meta object literal for the '<em>Value Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see org.metable.hex.ch02.domain.entity.NetworkValueObject
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getNetworkValueObject()
         * @generated
         */
        EDataType NETWORK_VALUE_OBJECT = eINSTANCE.getNetworkValueObject();

        /**
         * The meta object literal for the '<em>IP</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.valueobject.IP
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIP()
         * @generated
         */
        EDataType IP = eINSTANCE.getIP();

        /**
         * The meta object literal for the '<em>Protocol</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch02.domain.valueobject.Protocol
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getProtocol()
         * @generated
         */
        EDataType PROTOCOL = eINSTANCE.getProtocol();

    }

} // NetworkPackage
