/**
 */
package org.metable.hex.ch02.domain.emf.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getType <em>Type</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getSwitchId <em>Switch Id</em>}</li>
 *   <li>{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getIpAddress <em>Ip Address</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto()
 * @model superTypes="org.metable.hex.ch02.domain.emf.network.ISwitchDto"
 * @generated
 */
public interface SwitchDto extends EObject, org.metable.hex.ch02.domain.entity.SwitchDto {
    /**
     * Returns the value of the '<em><b>Networks</b></em>' attribute list.
     * The list contents are of type {@link org.metable.hex.ch02.domain.valueobject.Network}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Networks</em>' attribute list.
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_Networks()
     * @model dataType="org.metable.hex.ch02.domain.emf.network.Network"
     * @generated
     */
    EList<Network> getNetworks();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(SwitchType)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_Type()
     * @model dataType="org.metable.hex.ch02.domain.emf.network.SwitchType"
     * @generated
     */
    SwitchType getType();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(SwitchType value);

    /**
     * Returns the value of the '<em><b>Switch Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch Id</em>' attribute.
     * @see #setSwitchId(String)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_SwitchId()
     * @model
     * @generated
     */
    String getSwitchId();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getSwitchId <em>Switch Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch Id</em>' attribute.
     * @see #getSwitchId()
     * @generated
     */
    void setSwitchId(String value);

    /**
     * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ip Address</em>' attribute.
     * @see #setIpAddress(IP)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getSwitchDto_IpAddress()
     * @model dataType="org.metable.hex.ch02.domain.emf.network.IP"
     * @generated
     */
    IP getIpAddress();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.SwitchDto#getIpAddress <em>Ip Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ip Address</em>' attribute.
     * @see #getIpAddress()
     * @generated
     */
    void setIpAddress(IP value);

} // SwitchDto
