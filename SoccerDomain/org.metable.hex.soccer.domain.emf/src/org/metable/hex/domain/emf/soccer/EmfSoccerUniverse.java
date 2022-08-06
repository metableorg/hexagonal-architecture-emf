/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Soccer Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfSoccerUniverse()
 * @model
 * @generated
 */
public interface EmfSoccerUniverse extends EObject {
    /**
     * Returns the value of the '<em><b>Players</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.EmfPlayer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Players</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfSoccerUniverse_Players()
     * @model containment="true"
     * @generated
     */
    EList<EmfPlayer> getPlayers();

    /**
     * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.EmfTeam}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teams</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfSoccerUniverse_Teams()
     * @model containment="true"
     * @generated
     */
    EList<EmfTeam> getTeams();

    /**
     * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.EmfPosition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Positions</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfSoccerUniverse_Positions()
     * @model containment="true"
     * @generated
     */
    EList<EmfPosition> getPositions();

} // EmfSoccerUniverse
