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
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IRouterImpl <em>IRouter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.IRouterImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIRouter()
     * @generated
     */
    int IROUTER = 1;

    /**
     * The number of structural features of the '<em>IRouter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IROUTER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IRouter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IROUTER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterImpl <em>Router</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.RouterImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouter()
     * @generated
     */
    int ROUTER = 0;

    /**
     * The feature id for the '<em><b>Router Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER__ROUTER_ID = IROUTER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER__TYPE = IROUTER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Switch</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER__SWITCH = IROUTER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Router</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_FEATURE_COUNT = IROUTER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Router</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_OPERATION_COUNT = IROUTER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.entity.Switch <em>ISwitch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.entity.Switch
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getISwitch()
     * @generated
     */
    int ISWITCH = 3;

    /**
     * The number of structural features of the '<em>ISwitch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISWITCH_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ISwitch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISWITCH_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitch()
     * @generated
     */
    int SWITCH = 2;

    /**
     * The feature id for the '<em><b>Networks</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH__NETWORKS = ISWITCH_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH__TYPE = ISWITCH_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Switch Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH__SWITCH_ID = ISWITCH_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ip Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH__IP_ADDRESS = ISWITCH_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Switch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_FEATURE_COUNT = ISWITCH_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Switch</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_OPERATION_COUNT = ISWITCH_OPERATION_COUNT + 0;

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
     * The meta object id for the '<em>Router Id</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.RouterIdImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterId()
     * @generated
     */
    int ROUTER_ID = 5;

    /**
     * The meta object id for the '<em>Switch Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.SwitchType
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchType()
     * @generated
     */
    int SWITCH_TYPE = 6;

    /**
     * The meta object id for the '<em>Switch Id</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchIdImpl
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchId()
     * @generated
     */
    int SWITCH_ID = 7;

    /**
     * The meta object id for the '<em>Network</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.Network
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getNetwork()
     * @generated
     */
    int NETWORK = 8;

    /**
     * The meta object id for the '<em>IP</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.IP
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIP()
     * @generated
     */
    int IP = 9;

    /**
     * The meta object id for the '<em>Protocol</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch02.domain.valueobject.Protocol
     * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getProtocol()
     * @generated
     */
    int PROTOCOL = 10;

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.Router <em>Router</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Router</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Router
     * @generated
     */
    EClass getRouter();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.Router#getRouterId <em>Router Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Router Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Router#getRouterId()
     * @see #getRouter()
     * @generated
     */
    EAttribute getRouter_RouterId();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.Router#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Router#getType()
     * @see #getRouter()
     * @generated
     */
    EAttribute getRouter_Type();

    /**
     * Returns the meta object for the reference '{@link org.metable.hex.ch02.domain.emf.network.Router#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Switch</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Router#getSwitch()
     * @see #getRouter()
     * @generated
     */
    EReference getRouter_Switch();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.Router <em>IRouter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IRouter</em>'.
     * @see org.metable.hex.ch02.domain.entity.Router
     * @model instanceClass="org.metable.hex.ch02.domain.entity.Router"
     * @generated
     */
    EClass getIRouter();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.emf.network.Switch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Switch
     * @generated
     */
    EClass getSwitch();

    /**
     * Returns the meta object for the attribute list '{@link org.metable.hex.ch02.domain.emf.network.Switch#getNetworks <em>Networks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Networks</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Switch#getNetworks()
     * @see #getSwitch()
     * @generated
     */
    EAttribute getSwitch_Networks();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.Switch#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Switch#getType()
     * @see #getSwitch()
     * @generated
     */
    EAttribute getSwitch_Type();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.Switch#getSwitchId <em>Switch Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Switch Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Switch#getSwitchId()
     * @see #getSwitch()
     * @generated
     */
    EAttribute getSwitch_SwitchId();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch02.domain.emf.network.Switch#getIpAddress <em>Ip Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ip Address</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.Switch#getIpAddress()
     * @see #getSwitch()
     * @generated
     */
    EAttribute getSwitch_IpAddress();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch02.domain.entity.Switch <em>ISwitch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ISwitch</em>'.
     * @see org.metable.hex.ch02.domain.entity.Switch
     * @model instanceClass="org.metable.hex.ch02.domain.entity.Switch"
     * @generated
     */
    EClass getISwitch();

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
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterIdImpl <em>Router Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Router Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.impl.RouterIdImpl
     * @model instanceClass="org.metable.hex.ch02.domain.emf.network.impl.RouterIdImpl"
     * @generated
     */
    EDataType getRouterId();

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
     * Returns the meta object for data type '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchIdImpl <em>Switch Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Switch Id</em>'.
     * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchIdImpl
     * @model instanceClass="org.metable.hex.ch02.domain.emf.network.impl.SwitchIdImpl"
     * @generated
     */
    EDataType getSwitchId();

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
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.RouterImpl <em>Router</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.RouterImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouter()
         * @generated
         */
        EClass ROUTER = eINSTANCE.getRouter();

        /**
         * The meta object literal for the '<em><b>Router Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROUTER__ROUTER_ID = eINSTANCE.getRouter_RouterId();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROUTER__TYPE = eINSTANCE.getRouter_Type();

        /**
         * The meta object literal for the '<em><b>Switch</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROUTER__SWITCH = eINSTANCE.getRouter_Switch();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.IRouterImpl <em>IRouter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.IRouterImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getIRouter()
         * @generated
         */
        EClass IROUTER = eINSTANCE.getIRouter();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl <em>Switch</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitch()
         * @generated
         */
        EClass SWITCH = eINSTANCE.getSwitch();

        /**
         * The meta object literal for the '<em><b>Networks</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH__NETWORKS = eINSTANCE.getSwitch_Networks();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH__TYPE = eINSTANCE.getSwitch_Type();

        /**
         * The meta object literal for the '<em><b>Switch Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH__SWITCH_ID = eINSTANCE.getSwitch_SwitchId();

        /**
         * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH__IP_ADDRESS = eINSTANCE.getSwitch_IpAddress();

        /**
         * The meta object literal for the '{@link org.metable.hex.ch02.domain.entity.Switch <em>ISwitch</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.entity.Switch
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getISwitch()
         * @generated
         */
        EClass ISWITCH = eINSTANCE.getISwitch();

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
         * The meta object literal for the '<em>Router Id</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.RouterIdImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getRouterId()
         * @generated
         */
        EDataType ROUTER_ID = eINSTANCE.getRouterId();

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
         * The meta object literal for the '<em>Switch Id</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch02.domain.emf.network.impl.SwitchIdImpl
         * @see org.metable.hex.ch02.domain.emf.network.impl.NetworkPackageImpl#getSwitchId()
         * @generated
         */
        EDataType SWITCH_ID = eINSTANCE.getSwitchId();

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
