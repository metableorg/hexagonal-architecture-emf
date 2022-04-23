/**
 */
package org.metable.hex.ch01.domain.emf.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.metable.hex.ch01.domain.emf.network.NetworkFactory
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
    String eNS_URI = "http://org.metable.hex.ch01.domain.network.emf/network";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.metable.hex.ch01.domain.network.emf";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NetworkPackage eINSTANCE = org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl.init();

    /**
     * The meta object id for the '{@link org.metable.hex.ch01.domain.Router <em>IRouter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch01.domain.Router
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getIRouter()
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
     * The meta object id for the '{@link org.metable.hex.ch01.domain.emf.network.impl.RouterImpl <em>Router</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch01.domain.emf.network.impl.RouterImpl
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouter()
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
     * The number of structural features of the '<em>Router</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_FEATURE_COUNT = IROUTER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Router</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTER_OPERATION_COUNT = IROUTER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Router Id</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterId()
     * @generated
     */
    int ROUTER_ID = 2;

    /**
     * The meta object id for the '<em>Router Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.ch01.domain.RouterType
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
     * @generated
     */
    int ROUTER_TYPE = 3;

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch01.domain.emf.network.Router <em>Router</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Router</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.Router
     * @generated
     */
    EClass getRouter();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch01.domain.emf.network.Router#getRouterId <em>Router Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Router Id</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.Router#getRouterId()
     * @see #getRouter()
     * @generated
     */
    EAttribute getRouter_RouterId();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch01.domain.emf.network.Router#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.Router#getType()
     * @see #getRouter()
     * @generated
     */
    EAttribute getRouter_Type();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch01.domain.Router <em>IRouter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IRouter</em>'.
     * @see org.metable.hex.ch01.domain.Router
     * @model instanceClass="org.metable.hex.ch01.domain.Router"
     * @generated
     */
    EClass getIRouter();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl <em>Router Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Router Id</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl
     * @model instanceClass="org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl"
     * @generated
     */
    EDataType getRouterId();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch01.domain.RouterType <em>Router Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Router Type</em>'.
     * @see org.metable.hex.ch01.domain.RouterType
     * @model instanceClass="org.metable.hex.ch01.domain.RouterType"
     * @generated
     */
    EDataType getRouterType();

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
         * The meta object literal for the '{@link org.metable.hex.ch01.domain.emf.network.impl.RouterImpl <em>Router</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch01.domain.emf.network.impl.RouterImpl
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouter()
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
         * The meta object literal for the '{@link org.metable.hex.ch01.domain.Router <em>IRouter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch01.domain.Router
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getIRouter()
         * @generated
         */
        EClass IROUTER = eINSTANCE.getIRouter();

        /**
         * The meta object literal for the '<em>Router Id</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterId()
         * @generated
         */
        EDataType ROUTER_ID = eINSTANCE.getRouterId();

        /**
         * The meta object literal for the '<em>Router Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.ch01.domain.RouterType
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
         * @generated
         */
        EDataType ROUTER_TYPE = eINSTANCE.getRouterType();

    }

} //NetworkPackage
