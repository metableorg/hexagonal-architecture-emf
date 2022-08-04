/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.SoccerUniverse#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.SoccerUniverse#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.SoccerUniverse#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getSoccerUniverse()
 * @model
 * @generated
 */
public interface SoccerUniverse extends EObject {
    /**
     * Returns the value of the '<em><b>Players</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.Player}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Players</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getSoccerUniverse_Players()
     * @model containment="true"
     * @generated
     */
    EList<Player> getPlayers();

    /**
     * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.Team}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teams</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getSoccerUniverse_Teams()
     * @model containment="true"
     * @generated
     */
    EList<Team> getTeams();

    /**
     * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.Position}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Positions</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getSoccerUniverse_Positions()
     * @model containment="true"
     * @generated
     */
    EList<Position> getPositions();

} // SoccerUniverse
