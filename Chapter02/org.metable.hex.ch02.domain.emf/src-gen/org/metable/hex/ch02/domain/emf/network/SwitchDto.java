/**
 */
package org.metable.hex.ch02.domain.emf.network;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.metable.hex.ch02.domain.emf.network.impl.NetworkValueObject;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Switch Dto</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getNetworkValueObjects <em>Network Value
 * Objects</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getType <em>Type</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getId <em>Id</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto()
 * @model superTypes="org.metable.hex.ch02.domain.emf.network.ISwitchDto"
 * @generated
 */
public interface SwitchDto extends EObject, org.metable.hex.ch02.domain.entity.SwitchDto {
    /**
     * Returns the value of the '<em><b>Network Value Objects</b></em>' attribute list. The list contents are of type
     * {@link org.metable.hex.ch02.domain.emf.network.impl.NetworkValueObject}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the value of the '<em>Network Value Objects</em>' attribute list.
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_NetworkValueObjects()
     * @model dataType="org.metable.hex.ch02.domain.emf.network.NetworkValueObject"
     * @generated
     */
    EList<NetworkValueObject> getNetworkValueObjects();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(SwitchType)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_Type()
     * @model dataType="org.metable.hex.ch02.domain.emf.network.SwitchType"
     * @generated
     */
    SwitchType getType();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getType <em>Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(SwitchType value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(IP)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_Address()
     * @model dataType="org.metable.hex.ch02.domain.emf.network.IP" ordered="false"
     * @generated
     */
    IP getAddress();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getAddress <em>Address</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(IP value);

} // SwitchDto
