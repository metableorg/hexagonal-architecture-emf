/**
 */
package org.metable.hex.ch01.domain.emf.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.metable.hex.ch01.domain.emf.network.NetworkFactory
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
    String eNS_URI = "http://org.metable.hex.ch01.domain.network.emf/network";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "org.metable.hex.ch01.domain.network.emf";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    NetworkPackage eINSTANCE = org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl.init();

    /**
     * The meta object id for the '{@link org.metable.hex.ch01.domain.RouterDto <em>IRouter Dto</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch01.domain.RouterDto
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getIRouterDto()
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
     * The meta object id for the '{@link org.metable.hex.ch01.domain.emf.network.impl.RouterDtoImpl <em>Router
     * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch01.domain.emf.network.impl.RouterDtoImpl
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterDto()
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
     * The number of structural features of the '<em>Router Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO_FEATURE_COUNT = IROUTER_DTO_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Router Dto</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ROUTER_DTO_OPERATION_COUNT = IROUTER_DTO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Router Type</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metable.hex.ch01.domain.RouterType
     * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
     * @generated
     */
    int ROUTER_TYPE = 2;

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch01.domain.emf.network.RouterDto <em>Router
     * Dto</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Router Dto</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.RouterDto
     * @generated
     */
    EClass getRouterDto();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch01.domain.emf.network.RouterDto#getId
     * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.RouterDto#getId()
     * @see #getRouterDto()
     * @generated
     */
    EAttribute getRouterDto_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.ch01.domain.emf.network.RouterDto#getType
     * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.metable.hex.ch01.domain.emf.network.RouterDto#getType()
     * @see #getRouterDto()
     * @generated
     */
    EAttribute getRouterDto_Type();

    /**
     * Returns the meta object for class '{@link org.metable.hex.ch01.domain.RouterDto <em>IRouter Dto</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>IRouter Dto</em>'.
     * @see org.metable.hex.ch01.domain.RouterDto
     * @model instanceClass="org.metable.hex.ch01.domain.RouterDto"
     * @generated
     */
    EClass getIRouterDto();

    /**
     * Returns the meta object for data type '{@link org.metable.hex.ch01.domain.RouterType <em>Router Type</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>Router Type</em>'.
     * @see org.metable.hex.ch01.domain.RouterType
     * @model instanceClass="org.metable.hex.ch01.domain.RouterType"
     * @generated
     */
    EDataType getRouterType();

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
         * The meta object literal for the '{@link org.metable.hex.ch01.domain.emf.network.impl.RouterDtoImpl <em>Router
         * Dto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch01.domain.emf.network.impl.RouterDtoImpl
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterDto()
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
         * The meta object literal for the '{@link org.metable.hex.ch01.domain.RouterDto <em>IRouter Dto</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.metable.hex.ch01.domain.RouterDto
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getIRouterDto()
         * @generated
         */
        EClass IROUTER_DTO = eINSTANCE.getIRouterDto();

        /**
         * The meta object literal for the '<em>Router Type</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see org.metable.hex.ch01.domain.RouterType
         * @see org.metable.hex.ch01.domain.emf.network.impl.NetworkPackageImpl#getRouterType()
         * @generated
         */
        EDataType ROUTER_TYPE = eINSTANCE.getRouterType();

    }

} // NetworkPackage
