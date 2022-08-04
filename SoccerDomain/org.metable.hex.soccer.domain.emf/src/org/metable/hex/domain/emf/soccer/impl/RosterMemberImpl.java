/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.metable.hex.domain.emf.soccer.Player;
import org.metable.hex.domain.emf.soccer.Position;
import org.metable.hex.domain.emf.soccer.RosterMember;
import org.metable.hex.domain.emf.soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roster Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosterMemberImpl extends MinimalEObjectImpl.Container implements RosterMember {
    /**
     * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayer()
     * @generated
     * @ordered
     */
    protected Player player;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected Position position;

    /**
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected int number = NUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RosterMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.ROSTER_MEMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Player getPlayer() {
        if (player != null && player.eIsProxy()) {
            InternalEObject oldPlayer = (InternalEObject)player;
            player = (Player)eResolveProxy(oldPlayer);
            if (player != oldPlayer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.ROSTER_MEMBER__PLAYER, oldPlayer, player));
            }
        }
        return player;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Player basicGetPlayer() {
        return player;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlayer(Player newPlayer) {
        Player oldPlayer = player;
        player = newPlayer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.ROSTER_MEMBER__PLAYER, oldPlayer, player));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Position getPosition() {
        if (position != null && position.eIsProxy()) {
            InternalEObject oldPosition = (InternalEObject)position;
            position = (Position)eResolveProxy(oldPosition);
            if (position != oldPosition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.ROSTER_MEMBER__POSITION, oldPosition, position));
            }
        }
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Position basicGetPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPosition(Position newPosition) {
        Position oldPosition = position;
        position = newPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.ROSTER_MEMBER__POSITION, oldPosition, position));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumber(int newNumber) {
        int oldNumber = number;
        number = newNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.ROSTER_MEMBER__NUMBER, oldNumber, number));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.ROSTER_MEMBER__PLAYER:
                if (resolve) return getPlayer();
                return basicGetPlayer();
            case SoccerPackage.ROSTER_MEMBER__POSITION:
                if (resolve) return getPosition();
                return basicGetPosition();
            case SoccerPackage.ROSTER_MEMBER__NUMBER:
                return getNumber();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SoccerPackage.ROSTER_MEMBER__PLAYER:
                setPlayer((Player)newValue);
                return;
            case SoccerPackage.ROSTER_MEMBER__POSITION:
                setPosition((Position)newValue);
                return;
            case SoccerPackage.ROSTER_MEMBER__NUMBER:
                setNumber((Integer)newValue);
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
            case SoccerPackage.ROSTER_MEMBER__PLAYER:
                setPlayer((Player)null);
                return;
            case SoccerPackage.ROSTER_MEMBER__POSITION:
                setPosition((Position)null);
                return;
            case SoccerPackage.ROSTER_MEMBER__NUMBER:
                setNumber(NUMBER_EDEFAULT);
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
            case SoccerPackage.ROSTER_MEMBER__PLAYER:
                return player != null;
            case SoccerPackage.ROSTER_MEMBER__POSITION:
                return position != null;
            case SoccerPackage.ROSTER_MEMBER__NUMBER:
                return number != NUMBER_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (number: ");
        result.append(number);
        result.append(')');
        return result.toString();
    }

} //RosterMemberImpl
