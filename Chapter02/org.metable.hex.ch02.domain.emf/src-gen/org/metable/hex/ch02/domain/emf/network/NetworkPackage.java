/**
 */
package org.metable.hex.ch02.domain.emf.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.metable.hex.ch02.domain.emf.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "network";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://org.metable.hex.ch02.domain.network.emf/network";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.metable.hex.ch02.domain.network.emf";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NetworkPackage eINSTANCE = org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl.init();

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl <em>IRouter Dto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIRouterDto()
     * @generated
     */
    int IROUTER_DTO = 1;

    /**
     * The number of structural features of the '<em>IRouter Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IROUTER_DTO_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IRouter Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IROUTER_DTO_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl <em>Router Dto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterDto()
     * @generated
     */
    int ROUTER_DTO = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_DTO__ID = IROUTER_DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_DTO__TYPE = IROUTER_DTO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Switch</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_DTO__SWITCH = IROUTER_DTO_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Router Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_DTO_FEATURE_COUNT = IROUTER_DTO_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Router Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_DTO_OPERATION_COUNT = IROUTER_DTO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch Dto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.entity.SwitchDto
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getISwitchDto()
     * @generated
     */
    int ISWITCH_DTO = 3;

    /**
     * The number of structural features of the '<em>ISwitch Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISWITCH_DTO_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ISwitch Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISWITCH_DTO_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl <em>Switch Dto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchDto()
     * @generated
     */
    int SWITCH_DTO = 2;

    /**
     * The feature id for the '<em><b>Networks</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_DTO__NETWORKS = ISWITCH_DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_DTO__TYPE = ISWITCH_DTO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Switch Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_DTO__SWITCH_ID = ISWITCH_DTO_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ip Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_DTO__IP_ADDRESS = ISWITCH_DTO_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Switch Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_DTO_FEATURE_COUNT = ISWITCH_DTO_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Switch Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_DTO_OPERATION_COUNT = ISWITCH_DTO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Router Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.RouterType
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
     * @generated
     */
    int ROUTER_TYPE = 4;

    /**
     * The meta object id for the '<em>Switch Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.SwitchType
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchType()
     * @generated
     */
    int SWITCH_TYPE = 5;

    /**
     * The meta object id for the '<em>Network</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.Network
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getNetwork()
     * @generated
     */
    int NETWORK = 6;

    /**
     * The meta object id for the '<em>IP</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.IP
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIP()
     * @generated
     */
    int IP = 7;

    /**
     * The meta object id for the '<em>Protocol</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.Protocol
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getProtocol()
     * @generated
     */
    int PROTOCOL = 8;

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.RouterDto <em>Router Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Router Dto</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto
     * @generated
     */
    EClass getRouterDto();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.RouterDto#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto#getId()
     * @see #getRouterDto()
     * @generated
     */
    EAttribute getRouterDto_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.RouterDto#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto#getType()
     * @see #getRouterDto()
     * @generated
     */
    EAttribute getRouterDto_Type();

    /**
     * Returns the meta object for the reference '{@link org.metable.hex.ch02.domain.emf.network.RouterDto#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Switch</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto#getSwitch()
     * @see #getRouterDto()
     * @generated
     */
    EReference getRouterDto_Switch();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.RouterDto <em>IRouter Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IRouter Dto</em>'.
     * @see org.metable.hex.ch02.domain.entity.RouterDto
     * @model instanceClass="org.metable.hex.ch02.domain.entity.RouterDto"
     * @generated
     */
    EClass getIRouterDto();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto <em>Switch Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Dto</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto
     * @generated
     */
    EClass getSwitchDto();

    /**
     * Returns the meta object for the attribute list '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getNetworks <em>Networks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Networks</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getNetworks()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_Networks();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getType()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_Type();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getSwitchId <em>Switch Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Switch Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getSwitchId()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_SwitchId();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getIpAddress <em>Ip Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ip Address</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto#getIpAddress()
     * @see #getSwitchDto()
     * @generated
     */
    EAttribute getSwitchDto_IpAddress();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ISwitch Dto</em>'.
     * @see org.metable.hex.ch02.domain.entity.SwitchDto
     * @model instanceClass="org.metable.hex.ch02.domain.entity.SwitchDto"
     * @generated
     */
    EClass getISwitchDto();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.RouterType <em>Router Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Router Type</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.RouterType
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.RouterType"
     * @generated
     */
    EDataType getRouterType();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.SwitchType <em>Switch Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Switch Type</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.SwitchType
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.SwitchType"
     * @generated
     */
    EDataType getSwitchType();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Network</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.Network
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.Network"
     * @generated
     */
    EDataType getNetwork();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.IP <em>IP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IP</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.IP
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.IP"
     * @generated
     */
    EDataType getIP();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.valueobject.Protocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Protocol</em>'.
     * @see org.metable.hex.ch02.domain.valueobject.Protocol
     * @model instanceClass="org.metable.hex.ch02.domain.valueobject.Protocol"
     * @generated
     */
    EDataType getProtocol();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NetworkFactory getNetworkFactory();

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
    interface Literals {
        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl <em>Router Dto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.RouterDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterDto()
         * @generated
         */
        EClass ROUTER_DTO = eINSTANCE.getRouterDto();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROUTER_DTO__ID = eINSTANCE.getRouterDto_Id();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROUTER_DTO__TYPE = eINSTANCE.getRouterDto_Type();

        /**
         * The meta object literal for the '<em><b>Switch</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROUTER_DTO__SWITCH = eINSTANCE.getRouterDto_Switch();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl <em>IRouter Dto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.IRouterDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIRouterDto()
         * @generated
         */
        EClass IROUTER_DTO = eINSTANCE.getIRouterDto();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl <em>Switch Dto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchDtoImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchDto()
         * @generated
         */
        EClass SWITCH_DTO = eINSTANCE.getSwitchDto();

        /**
         * The meta object literal for the '<em><b>Networks</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH_DTO__NETWORKS = eINSTANCE.getSwitchDto_Networks();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH_DTO__TYPE = eINSTANCE.getSwitchDto_Type();

        /**
         * The meta object literal for the '<em><b>Switch Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH_DTO__SWITCH_ID = eINSTANCE.getSwitchDto_SwitchId();

        /**
         * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH_DTO__IP_ADDRESS = eINSTANCE.getSwitchDto_IpAddress();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch Dto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.entity.SwitchDto
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getISwitchDto()
         * @generated
         */
        EClass ISWITCH_DTO = eINSTANCE.getISwitchDto();

        /**
         * The meta object literal for the '<em>Router Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.valueobject.RouterType
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
         * @generated
         */
        EDataType ROUTER_TYPE = eINSTANCE.getRouterType();

        /**
         * The meta object literal for the '<em>Switch Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.valueobject.SwitchType
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchType()
         * @generated
         */
        EDataType SWITCH_TYPE = eINSTANCE.getSwitchType();

        /**
         * The meta object literal for the '<em>Network</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.valueobject.Network
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getNetwork()
         * @generated
         */
        EDataType NETWORK = eINSTANCE.getNetwork();

        /**
         * The meta object literal for the '<em>IP</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.valueobject.IP
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIP()
         * @generated
         */
        EDataType IP = eINSTANCE.getIP();

        /**
         * The meta object literal for the '<em>Protocol</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.valueobject.Protocol
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getProtocol()
         * @generated
         */
        EDataType PROTOCOL = eINSTANCE.getProtocol();

    }

} //NetworkPackage
