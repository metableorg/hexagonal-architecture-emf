/**
 */
package org.metable.hex.ch01.domain.emf.network;

import org.eclipse.emf.ecore.EObject;
import org.metable.hex.ch01.domain.RouterType;
import org.metable.hex.ch01.domain.emf.network.impl.RouterIdImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Router Dto</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch01.domain.emf.network.RouterDto#getRouterId <em>Router Id</em>}</li>
 * <li>{@link org.metable.hex.ch01.domain.emf.network.RouterDto#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#getRouterDto()
 * @model superTypes="org.metable.hex.ch01.domain.emf.network.IRouterDto"
 * @generated
 */
public interface RouterDto extends EObject, org.metable.hex.ch01.domain.RouterDto {
    /**
     * Returns the value of the '<em><b>Router Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Router Id</em>' attribute.
     * @see #setRouterId(RouterIdImpl)
     * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#getRouterDto_RouterId()
     * @model dataType="org.metable.hex.ch01.domain.emf.network.RouterId"
     * @generated
     */
    RouterIdImpl getRouterId();

    /**
     * Sets the value of the '{@link org.metable.hex.ch01.domain.emf.network.RouterDto#getRouterId <em>Router Id</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Router Id</em>' attribute.
     * @see #getRouterId()
     * @generated
     */
    void setRouterId(RouterIdImpl value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(RouterType)
     * @see org.metable.hex.ch01.domain.emf.network.NetworkPackage#getRouterDto_Type()
     * @model dataType="org.metable.hex.ch01.domain.emf.network.RouterType"
     * @generated
     */
    RouterType getType();

    /**
     * Sets the value of the '{@link org.metable.hex.ch01.domain.emf.network.RouterDto#getType <em>Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(RouterType value);

} // RouterDto
