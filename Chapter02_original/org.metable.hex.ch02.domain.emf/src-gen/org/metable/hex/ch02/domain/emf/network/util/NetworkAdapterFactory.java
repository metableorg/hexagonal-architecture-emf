/**
 */
package org.metable.hex.ch02.domain.emf.network.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.metable.hex.ch02.domain.emf.network.EventDto;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage
 * @generated
 */
public class NetworkAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static NetworkPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NetworkAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = NetworkPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
     * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
     * the model. <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NetworkSwitch<Adapter> modelSwitch = new NetworkSwitch<Adapter>() {
        @Override
        public Adapter caseRouterDto(RouterDto object) {
            return createRouterDtoAdapter();
        }

        @Override
        public Adapter caseIRouterDto(org.metable.hex.ch02.domain.entity.RouterDto object) {
            return createIRouterDtoAdapter();
        }

        @Override
        public Adapter caseSwitchDto(SwitchDto object) {
            return createSwitchDtoAdapter();
        }

        @Override
        public Adapter caseISwitchDto(org.metable.hex.ch02.domain.entity.SwitchDto object) {
            return createISwitchDtoAdapter();
        }

        @Override
        public Adapter caseEventDto(EventDto object) {
            return createEventDtoAdapter();
        }

        @Override
        public Adapter caseIEventDto(org.metable.hex.ch02.domain.entity.EventDto object) {
            return createIEventDtoAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.emf.network.RouterDto <em>Router
     * Dto</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.emf.network.RouterDto
     * @generated
     */
    public Adapter createRouterDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.RouterDto <em>IRouter
     * Dto</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.RouterDto
     * @generated
     */
    public Adapter createIRouterDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto <em>Switch
     * Dto</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.emf.network.SwitchDto
     * @generated
     */
    public Adapter createSwitchDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.SwitchDto <em>ISwitch
     * Dto</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.SwitchDto
     * @generated
     */
    public Adapter createISwitchDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.emf.network.EventDto <em>Event
     * Dto</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.emf.network.EventDto
     * @generated
     */
    public Adapter createEventDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.EventDto <em>IEvent
     * Dto</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.EventDto
     * @generated
     */
    public Adapter createIEventDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // NetworkAdapterFactory
