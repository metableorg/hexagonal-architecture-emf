/**
 */
package org.metable.hex.ch01.domain.emf.network;

import org.eclipse.emf.ecore.EObject;

import org.metable.hex.ch01.domain.RouterType;

import org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch01.domain.emf.network.Router#getRouterId <em>Router Id</em>}</li>
 *   <li>{@link org.metable.hex.ch01.domain.emf.network.Router#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#getRouter()
 * @model superTypes="org.metable.hex.ch01.domain.emf.network.IRouter"
 * @generated
 */
public interface Router extends EObject, org.metable.hex.ch01.domain.Router {
    /**
     * Returns the value of the '<em><b>Router Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Router Id</em>' attribute.
     * @see #setRouterId(RouterIdImpl)
     * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#getRouter_RouterId()
     * @model dataType="org.metable.hex.ch01.domain.emf.network.RouterId"
     * @generated
     */
    RouterIdImpl getRouterId();

    /**
     * Sets the value of the '{@link org.metable.hex.ch01.domain.emf.network.Router#getRouterId <em>Router Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Router Id</em>' attribute.
     * @see #getRouterId()
     * @generated
     */
    void setRouterId(RouterIdImpl value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(RouterType)
     * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#getRouter_Type()
     * @model dataType="org.metable.hex.ch01.domain.emf.network.RouterType"
     * @generated
     */
    RouterType getType();

    /**
     * Sets the value of the '{@link org.metable.hex.ch01.domain.emf.network.Router#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(RouterType value);

} // Router