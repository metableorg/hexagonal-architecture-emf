/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.metable.hex.domain.emf.soccer.EmfPlayer;
import org.metable.hex.domain.emf.soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfPlayerImpl extends MinimalEObjectImpl.Container implements EmfPlayer {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstName()
     * @generated
     * @ordered
     */
    protected static final String FIRST_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstName()
     * @generated
     * @ordered
     */
    protected String firstName = FIRST_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastName()
     * @generated
     * @ordered
     */
    protected static final String LAST_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastName()
     * @generated
     * @ordered
     */
    protected String lastName = LAST_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfPlayerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.EMF_PLAYER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_PLAYER__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirstName(String newFirstName) {
        String oldFirstName = firstName;
        firstName = newFirstName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_PLAYER__FIRST_NAME, oldFirstName, firstName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLastName(String newLastName) {
        String oldLastName = lastName;
        lastName = newLastName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_PLAYER__LAST_NAME, oldLastName, lastName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.EMF_PLAYER__ID:
                return getId();
            case SoccerPackage.EMF_PLAYER__FIRST_NAME:
                return getFirstName();
            case SoccerPackage.EMF_PLAYER__LAST_NAME:
                return getLastName();
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
            case SoccerPackage.EMF_PLAYER__ID:
                setId((String)newValue);
                return;
            case SoccerPackage.EMF_PLAYER__FIRST_NAME:
                setFirstName((String)newValue);
                return;
            case SoccerPackage.EMF_PLAYER__LAST_NAME:
                setLastName((String)newValue);
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
            case SoccerPackage.EMF_PLAYER__ID:
                setId(ID_EDEFAULT);
                return;
            case SoccerPackage.EMF_PLAYER__FIRST_NAME:
                setFirstName(FIRST_NAME_EDEFAULT);
                return;
            case SoccerPackage.EMF_PLAYER__LAST_NAME:
                setLastName(LAST_NAME_EDEFAULT);
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
            case SoccerPackage.EMF_PLAYER__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case SoccerPackage.EMF_PLAYER__FIRST_NAME:
                return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
            case SoccerPackage.EMF_PLAYER__LAST_NAME:
                return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", firstName: ");
        result.append(firstName);
        result.append(", lastName: ");
        result.append(lastName);
        result.append(')');
        return result.toString();
    }

} //EmfPlayerImpl
