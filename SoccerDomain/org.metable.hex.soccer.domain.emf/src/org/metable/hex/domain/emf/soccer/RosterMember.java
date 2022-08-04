/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roster Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.RosterMember#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.RosterMember#getPosition <em>Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.RosterMember#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getRosterMember()
 * @model
 * @generated
 */
public interface RosterMember extends EObject {
    /**
     * Returns the value of the '<em><b>Player</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Player</em>' reference.
     * @see #setPlayer(Player)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getRosterMember_Player()
     * @model
     * @generated
     */
    Player getPlayer();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.RosterMember#getPlayer <em>Player</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Player</em>' reference.
     * @see #getPlayer()
     * @generated
     */
    void setPlayer(Player value);

    /**
     * Returns the value of the '<em><b>Position</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' reference.
     * @see #setPosition(Position)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getRosterMember_Position()
     * @model
     * @generated
     */
    Position getPosition();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.RosterMember#getPosition <em>Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' reference.
     * @see #getPosition()
     * @generated
     */
    void setPosition(Position value);

    /**
     * Returns the value of the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number</em>' attribute.
     * @see #setNumber(int)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getRosterMember_Number()
     * @model
     * @generated
     */
    int getNumber();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.RosterMember#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' attribute.
     * @see #getNumber()
     * @generated
     */
    void setNumber(int value);

} // RosterMember
