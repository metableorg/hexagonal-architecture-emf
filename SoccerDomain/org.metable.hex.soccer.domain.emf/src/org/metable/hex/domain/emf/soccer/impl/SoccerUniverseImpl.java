/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metable.hex.domain.emf.soccer.Player;
import org.metable.hex.domain.emf.soccer.Position;
import org.metable.hex.domain.emf.soccer.SoccerPackage;
import org.metable.hex.domain.emf.soccer.SoccerUniverse;
import org.metable.hex.domain.emf.soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoccerUniverseImpl extends MinimalEObjectImpl.Container implements SoccerUniverse {
    /**
     * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayers()
     * @generated
     * @ordered
     */
    protected EList<Player> players;

    /**
     * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeams()
     * @generated
     * @ordered
     */
    protected EList<Team> teams;

    /**
     * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositions()
     * @generated
     * @ordered
     */
    protected EList<Position> positions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoccerUniverseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.SOCCER_UNIVERSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Player> getPlayers() {
        if (players == null) {
            players = new EObjectContainmentEList<Player>(Player.class, this, SoccerPackage.SOCCER_UNIVERSE__PLAYERS);
        }
        return players;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Team> getTeams() {
        if (teams == null) {
            teams = new EObjectContainmentEList<Team>(Team.class, this, SoccerPackage.SOCCER_UNIVERSE__TEAMS);
        }
        return teams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Position> getPositions() {
        if (positions == null) {
            positions = new EObjectContainmentEList<Position>(Position.class, this, SoccerPackage.SOCCER_UNIVERSE__POSITIONS);
        }
        return positions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SoccerPackage.SOCCER_UNIVERSE__PLAYERS:
                return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
            case SoccerPackage.SOCCER_UNIVERSE__TEAMS:
                return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
            case SoccerPackage.SOCCER_UNIVERSE__POSITIONS:
                return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.SOCCER_UNIVERSE__PLAYERS:
                return getPlayers();
            case SoccerPackage.SOCCER_UNIVERSE__TEAMS:
                return getTeams();
            case SoccerPackage.SOCCER_UNIVERSE__POSITIONS:
                return getPositions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SoccerPackage.SOCCER_UNIVERSE__PLAYERS:
                getPlayers().clear();
                getPlayers().addAll((Collection<? extends Player>)newValue);
                return;
            case SoccerPackage.SOCCER_UNIVERSE__TEAMS:
                getTeams().clear();
                getTeams().addAll((Collection<? extends Team>)newValue);
                return;
            case SoccerPackage.SOCCER_UNIVERSE__POSITIONS:
                getPositions().clear();
                getPositions().addAll((Collection<? extends Position>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case SoccerPackage.SOCCER_UNIVERSE__PLAYERS:
                getPlayers().clear();
                return;
            case SoccerPackage.SOCCER_UNIVERSE__TEAMS:
                getTeams().clear();
                return;
            case SoccerPackage.SOCCER_UNIVERSE__POSITIONS:
                getPositions().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SoccerPackage.SOCCER_UNIVERSE__PLAYERS:
                return players != null && !players.isEmpty();
            case SoccerPackage.SOCCER_UNIVERSE__TEAMS:
                return teams != null && !teams.isEmpty();
            case SoccerPackage.SOCCER_UNIVERSE__POSITIONS:
                return positions != null && !positions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SoccerUniverseImpl
