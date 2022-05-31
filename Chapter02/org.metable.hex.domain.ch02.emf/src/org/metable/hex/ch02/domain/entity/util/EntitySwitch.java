/**
 */
package org.metable.hex.ch02.domain.entity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.metable.hex.ch02.domain.entity.EntityPackage;
import org.metable.hex.ch02.domain.entity.EventEmf;
import org.metable.hex.ch02.domain.entity.IEvent;
import org.metable.hex.ch02.domain.entity.IRouter;
import org.metable.hex.ch02.domain.entity.ISwitch;
import org.metable.hex.ch02.domain.entity.RouterEmf;
import org.metable.hex.ch02.domain.entity.SwitchEmf;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.metable.hex.ch02.domain.entity.EntityPackage
 * @generated
 */
public class EntitySwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static EntityPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EntitySwitch() {
        if (modelPackage == null) {
            modelPackage = EntityPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
     * result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case EntityPackage.EVENT_EMF: {
            EventEmf eventEmf = (EventEmf) theEObject;
            T result = caseEventEmf(eventEmf);
            if (result == null)
                result = caseIEvent(eventEmf);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EntityPackage.IEVENT: {
            IEvent iEvent = (IEvent) theEObject;
            T result = caseIEvent(iEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EntityPackage.ISWITCH: {
            ISwitch iSwitch = (ISwitch) theEObject;
            T result = caseISwitch(iSwitch);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EntityPackage.IROUTER: {
            IRouter iRouter = (IRouter) theEObject;
            T result = caseIRouter(iRouter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EntityPackage.SWITCH_EMF: {
            SwitchEmf switchEmf = (SwitchEmf) theEObject;
            T result = caseSwitchEmf(switchEmf);
            if (result == null)
                result = caseISwitch(switchEmf);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EntityPackage.ROUTER_EMF: {
            RouterEmf routerEmf = (RouterEmf) theEObject;
            T result = caseRouterEmf(routerEmf);
            if (result == null)
                result = caseIRouter(routerEmf);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Emf</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Emf</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventEmf(EventEmf object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IEvent</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IEvent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIEvent(IEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISwitch</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISwitch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISwitch(ISwitch object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IRouter</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IRouter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIRouter(IRouter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Emf</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Emf</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchEmf(SwitchEmf object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Router Emf</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Router Emf</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRouterEmf(RouterEmf object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
     * anyway. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} // EntitySwitch
