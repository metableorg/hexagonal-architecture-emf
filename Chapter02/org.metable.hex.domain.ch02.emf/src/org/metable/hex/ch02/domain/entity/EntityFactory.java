/**
 */
package org.metable.hex.ch02.domain.entity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.Protocol;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.domain.valueobject.SwitchId;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.metable.hex.ch02.domain.entity.EntityPackage
 * @generated
 */
public class EntityFactory extends EFactoryImpl {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final EntityFactory eINSTANCE = init();

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static EntityFactory init() {
        try {
            EntityFactory theEntityFactory = (EntityFactory)EPackage.Registry.INSTANCE.getEFactory(EntityPackage.eNS_URI);
            if (theEntityFactory != null) {
                return theEntityFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EntityFactory();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EntityFactory() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EntityPackage.EVENT_EMF: return createEventEmf();
            case EntityPackage.SWITCH_EMF: return createSwitchEmf();
            case EntityPackage.ROUTER_EMF: return createRouterEmf();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case EntityPackage.PROTOCOL:
                return createProtocolFromString(eDataType, initialValue);
            case EntityPackage.EVENT_ENTITY:
                return createEventEntityFromString(eDataType, initialValue);
            case EntityPackage.ROUTER_ID:
                return createRouterIdFromString(eDataType, initialValue);
            case EntityPackage.SWITCH_ID:
                return createSwitchIdFromString(eDataType, initialValue);
            case EntityPackage.SWITCH_ENTITY:
                return createSwitchEntityFromString(eDataType, initialValue);
            case EntityPackage.ROUTER_ENTITY:
                return createRouterEntityFromString(eDataType, initialValue);
            case EntityPackage.NETWORK:
                return createNetworkFromString(eDataType, initialValue);
            case EntityPackage.ROUTER_TYPE:
                return createRouterTypeFromString(eDataType, initialValue);
            case EntityPackage.IP:
                return createIPFromString(eDataType, initialValue);
            case EntityPackage.SWITCH_TYPE:
                return createSwitchTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case EntityPackage.PROTOCOL:
                return convertProtocolToString(eDataType, instanceValue);
            case EntityPackage.EVENT_ENTITY:
                return convertEventEntityToString(eDataType, instanceValue);
            case EntityPackage.ROUTER_ID:
                return convertRouterIdToString(eDataType, instanceValue);
            case EntityPackage.SWITCH_ID:
                return convertSwitchIdToString(eDataType, instanceValue);
            case EntityPackage.SWITCH_ENTITY:
                return convertSwitchEntityToString(eDataType, instanceValue);
            case EntityPackage.ROUTER_ENTITY:
                return convertRouterEntityToString(eDataType, instanceValue);
            case EntityPackage.NETWORK:
                return convertNetworkToString(eDataType, instanceValue);
            case EntityPackage.ROUTER_TYPE:
                return convertRouterTypeToString(eDataType, instanceValue);
            case EntityPackage.IP:
                return convertIPToString(eDataType, instanceValue);
            case EntityPackage.SWITCH_TYPE:
                return convertSwitchTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EventEmf createEventEmf() {
        EventEmf eventEmf = new EventEmf();
        return eventEmf;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated OFF
     */
    public SwitchEmf createSwitchEmf() {
        SwitchEmf switchEmf = new SwitchEmf();
        switchEmf.setEntity(new Switch());
        return switchEmf;
    }

    public SwitchEmf createSwitchEmf(SwitchId id, SwitchType type) {
        SwitchEmf switchEmf = createSwitchEmf();
        switchEmf.setEntity(new Switch(id, type, new IP("127.0.0.1")));
        return switchEmf;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated OFF
     */
    public RouterEmf createRouterEmf() {
        RouterEmf routerEmf = new RouterEmf();
        routerEmf.setEntity(new Router());
        return routerEmf;
    }

    public RouterEmf createRouterEmf(RouterId id, RouterType type) {
        RouterEmf routerEmf = createRouterEmf();

        routerEmf.setEntity(new Router(id, type));

        return routerEmf;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
        return (Protocol)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Event createEventEntityFromString(EDataType eDataType, String initialValue) {
        return (Event)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertEventEntityToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RouterId createRouterIdFromString(EDataType eDataType, String initialValue) {
        return (RouterId)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertRouterIdToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SwitchId createSwitchIdFromString(EDataType eDataType, String initialValue) {
        return (SwitchId)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchIdToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Switch createSwitchEntityFromString(EDataType eDataType, String initialValue) {
        return (Switch)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchEntityToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Router createRouterEntityFromString(EDataType eDataType, String initialValue) {
        return (Router)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertRouterEntityToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Network createNetworkFromString(EDataType eDataType, String initialValue) {
        return (Network)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertNetworkToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RouterType createRouterTypeFromString(EDataType eDataType, String initialValue) {
        return (RouterType)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertRouterTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public IP createIPFromString(EDataType eDataType, String initialValue) {
        return (IP)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertIPToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SwitchType createSwitchTypeFromString(EDataType eDataType, String initialValue) {
        return (SwitchType)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EntityPackage getEntityPackage() {
        return (EntityPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EntityPackage getPackage() {
        return EntityPackage.eINSTANCE;
    }

} // EntityFactory
