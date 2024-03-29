/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPlayer()
 * @model
 * @generated
 */
public interface EmfPlayer extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPlayer_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Name</em>' attribute.
     * @see #setFirstName(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPlayer_FirstName()
     * @model
     * @generated
     */
    String getFirstName();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getFirstName <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Name</em>' attribute.
     * @see #getFirstName()
     * @generated
     */
    void setFirstName(String value);

    /**
     * Returns the value of the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Name</em>' attribute.
     * @see #setLastName(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPlayer_LastName()
     * @model
     * @generated
     */
    String getLastName();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getLastName <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Name</em>' attribute.
     * @see #getLastName()
     * @generated
     */
    void setLastName(String value);

} // EmfPlayer
