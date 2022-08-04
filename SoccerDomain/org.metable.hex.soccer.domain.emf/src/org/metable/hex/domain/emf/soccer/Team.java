/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.Team#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.Team#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.Team#getRoster <em>Roster</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getTeam_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.Team#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getTeam_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.Team#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Roster</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.RosterMember}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roster</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getTeam_Roster()
     * @model containment="true"
     * @generated
     */
    EList<RosterMember> getRoster();

} // Team
