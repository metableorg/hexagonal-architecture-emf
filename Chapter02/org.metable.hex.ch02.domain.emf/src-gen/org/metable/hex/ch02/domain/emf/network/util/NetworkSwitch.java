/**
 */
package org.metable.hex.ch02.domain.emf.network.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage
 * @generated
 */
public class NetworkSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static NetworkPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NetworkSwitch() {
        if (modelPackage == null) {
            modelPackage = NetworkPackage.eINSTANCE;
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
        case NetworkPackage.ROUTER_DTO: {
            RouterDto routerDto = (RouterDto) theEObject;
            T result = caseRouterDto(routerDto);
            if (result == null)
                result = caseIRouterDto(routerDto);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case NetworkPackage.IROUTER_DTO: {
            org.metable.hex.ch02.domain.entity.RouterDto iRouterDto = (org.metable.hex.ch02.domain.entity.RouterDto) theEObject;
            T result = caseIRouterDto(iRouterDto);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case NetworkPackage.SWITCH_DTO: {
            SwitchDto switchDto = (SwitchDto) theEObject;
            T result = caseSwitchDto(switchDto);
            if (result == null)
                result = caseISwitchDto(switchDto);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case NetworkPackage.ISWITCH_DTO: {
            org.metable.hex.ch02.domain.entity.SwitchDto iSwitchDto = (org.metable.hex.ch02.domain.entity.SwitchDto) theEObject;
            T result = caseISwitchDto(iSwitchDto);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Router Dto</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Router Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRouterDto(RouterDto object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IRouter Dto</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IRouter Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIRouterDto(org.metable.hex.ch02.domain.entity.RouterDto object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Dto</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchDto(SwitchDto object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISwitch Dto</em>'. <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISwitch Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISwitchDto(org.metable.hex.ch02.domain.entity.SwitchDto object) {
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

} // NetworkSwitch
