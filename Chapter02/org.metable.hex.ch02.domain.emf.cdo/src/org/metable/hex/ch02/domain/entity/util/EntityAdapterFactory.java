/**
 */
package org.metable.hex.ch02.domain.entity.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.metable.hex.ch02.domain.entity.EntityPackage;
import org.metable.hex.ch02.domain.entity.EventEmf;
import org.metable.hex.ch02.domain.entity.IEvent;
import org.metable.hex.ch02.domain.entity.IRouter;
import org.metable.hex.ch02.domain.entity.ISwitch;
import org.metable.hex.ch02.domain.entity.RouterEmf;
import org.metable.hex.ch02.domain.entity.SwitchEmf;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.metable.hex.ch02.domain.entity.EntityPackage
 * @generated
 */
public class EntityAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static EntityPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EntityAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EntityPackage.eINSTANCE;
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
    protected EntitySwitch<Adapter> modelSwitch = new EntitySwitch<Adapter>() {
        @Override
        public Adapter caseEventEmf(EventEmf object) {
            return createEventEmfAdapter();
        }

        @Override
        public Adapter caseIEvent(IEvent object) {
            return createIEventAdapter();
        }

        @Override
        public Adapter caseISwitch(ISwitch object) {
            return createISwitchAdapter();
        }

        @Override
        public Adapter caseIRouter(IRouter object) {
            return createIRouterAdapter();
        }

        @Override
        public Adapter caseSwitchEmf(SwitchEmf object) {
            return createSwitchEmfAdapter();
        }

        @Override
        public Adapter caseRouterEmf(RouterEmf object) {
            return createRouterEmfAdapter();
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
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.EventEmf <em>Event
     * Emf</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.EventEmf
     * @generated
     */
    public Adapter createEventEmfAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.IEvent <em>IEvent</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.IEvent
     * @generated
     */
    public Adapter createIEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.ISwitch
     * <em>ISwitch</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.ISwitch
     * @generated
     */
    public Adapter createISwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.IRouter
     * <em>IRouter</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.IRouter
     * @generated
     */
    public Adapter createIRouterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.SwitchEmf <em>Switch
     * Emf</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.SwitchEmf
     * @generated
     */
    public Adapter createSwitchEmfAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.ch02.domain.entity.RouterEmf <em>Router
     * Emf</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see org.metable.hex.ch02.domain.entity.RouterEmf
     * @generated
     */
    public Adapter createRouterEmfAdapter() {
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

} // EntityAdapterFactory
