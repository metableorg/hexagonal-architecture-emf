/**
 */
package org.metable.hex.ch02.domain.emf.network.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.metable.hex.ch02.domain.emf.network.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage
 * @generated
 */
public class NetworkSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static NetworkPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkSwitch() {
        if (modelPackage == null) {
            modelPackage = NetworkPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case NetworkPackage.ROUTER: {
            Router router = (Router) theEObject;
            T result = caseRouter(router);
            if (result == null)
                result = caseIRouter(router);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case NetworkPackage.IROUTER: {
            org.metable.hex.ch02.domain.entity.Router iRouter = (org.metable.hex.ch02.domain.entity.Router) theEObject;
            T result = caseIRouter(iRouter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case NetworkPackage.SWITCH: {
            org.metable.hex.ch02.domain.emf.network.Switch switch_ = (org.metable.hex.ch02.domain.emf.network.Switch) theEObject;
            T result = caseSwitch(switch_);
            if (result == null)
                result = caseISwitch(switch_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case NetworkPackage.ISWITCH: {
            org.metable.hex.ch02.domain.entity.Switch iSwitch = (org.metable.hex.ch02.domain.entity.Switch) theEObject;
            T result = caseISwitch(iSwitch);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Router</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRouter(Router object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IRouter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IRouter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIRouter(org.metable.hex.ch02.domain.entity.Router object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitch(org.metable.hex.ch02.domain.emf.network.Switch object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISwitch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISwitch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISwitch(org.metable.hex.ch02.domain.entity.Switch object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //NetworkSwitch
