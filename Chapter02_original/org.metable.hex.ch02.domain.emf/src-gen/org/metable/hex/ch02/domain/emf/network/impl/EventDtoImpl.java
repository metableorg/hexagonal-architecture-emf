/**
 */
package org.metable.hex.ch02.domain.emf.network.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metable.hex.ch02.domain.emf.network.EventDto;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Event Dto</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.impl.EventDtoImpl#getLogEntry <em>Log Entry</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.emf.network.impl.EventDtoImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventDtoImpl extends IEventDtoImpl implements EventDto {
    /**
     * The default value of the '{@link #getLogEntry() <em>Log Entry</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getLogEntry()
     * @generated
     * @ordered
     */
    protected static final String LOG_ENTRY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogEntry() <em>Log Entry</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getLogEntry()
     * @generated
     * @ordered
     */
    protected String logEntry = LOG_ENTRY_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EventDtoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NetworkPackage.Literals.EVENT_DTO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getLogEntry() {
        return logEntry;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLogEntry(String newLogEntry) {
        String oldLogEntry = logEntry;
        logEntry = newLogEntry;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EVENT_DTO__LOG_ENTRY, oldLogEntry,
                    logEntry));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EVENT_DTO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case NetworkPackage.EVENT_DTO__LOG_ENTRY:
            return getLogEntry();
        case NetworkPackage.EVENT_DTO__ID:
            return getId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case NetworkPackage.EVENT_DTO__LOG_ENTRY:
            setLogEntry((String) newValue);
            return;
        case NetworkPackage.EVENT_DTO__ID:
            setId((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case NetworkPackage.EVENT_DTO__LOG_ENTRY:
            setLogEntry(LOG_ENTRY_EDEFAULT);
            return;
        case NetworkPackage.EVENT_DTO__ID:
            setId(ID_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case NetworkPackage.EVENT_DTO__LOG_ENTRY:
            return LOG_ENTRY_EDEFAULT == null ? logEntry != null : !LOG_ENTRY_EDEFAULT.equals(logEntry);
        case NetworkPackage.EVENT_DTO__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (logEntry: ");
        result.append(logEntry);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} // EventDtoImpl
