/**
 */
package org.metable.hex.ch02.domain.emf.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Event Dto</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.EventDto#getLogEntry <em>Log Entry</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getEventDto()
 * @model superTypes="org.metable.hex.ch02.domain.emf.network.IEventDto"
 * @generated
 */
public interface EventDto extends EObject, org.metable.hex.ch02.domain.entity.EventDto {
    /**
     * Returns the value of the '<em><b>Log Entry</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Log Entry</em>' attribute.
     * @see #setLogEntry(String)
     * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage#getEventDto_LogEntry()
     * @model
     * @generated
     */
    String getLogEntry();

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.emf.network.EventDto#getLogEntry <em>Log Entry</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Log Entry</em>' attribute.
     * @see #getLogEntry()
     * @generated
     */
    void setLogEntry(String value);

} // EventDto
