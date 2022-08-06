/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Roster Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getPosition <em>Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfRosterMember()
 * @model
 * @generated
 */
public interface EmfRosterMember extends EObject {
    /**
     * Returns the value of the '<em><b>Player</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Player</em>' reference.
     * @see #setPlayer(EmfPlayer)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfRosterMember_Player()
     * @model
     * @generated
     */
    EmfPlayer getPlayer();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getPlayer <em>Player</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Player</em>' reference.
     * @see #getPlayer()
     * @generated
     */
    void setPlayer(EmfPlayer value);

    /**
     * Returns the value of the '<em><b>Position</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' reference.
     * @see #setPosition(EmfPosition)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfRosterMember_Position()
     * @model
     * @generated
     */
    EmfPosition getPosition();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getPosition <em>Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' reference.
     * @see #getPosition()
     * @generated
     */
    void setPosition(EmfPosition value);

    /**
     * Returns the value of the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number</em>' attribute.
     * @see #setNumber(int)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfRosterMember_Number()
     * @model
     * @generated
     */
    int getNumber();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' attribute.
     * @see #getNumber()
     * @generated
     */
    void setNumber(int value);

} // EmfRosterMember
