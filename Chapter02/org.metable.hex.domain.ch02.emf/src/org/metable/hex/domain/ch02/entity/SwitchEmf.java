/**
 */
package org.metable.hex.domain.ch02.entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.SwitchId;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Switch Emf</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getEntity <em>Entity</em>}</li>
 * <li>{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getId <em>Id</em>}</li>
 * <li>{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEmf()
 * @model kind="class" superTypes="org.metable.hex.domain.ch02.entity.ISwitch"
 * @generated
 */
public class SwitchEmf extends MinimalEObjectImpl.Container implements EObject, ISwitch {
    /**
     * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected static final Switch ENTITY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected Switch entity = ENTITY_EDEFAULT;
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final SwitchId ID_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated OFF
     */
    protected SwitchEmf() {
        super();
        entity = new Switch(SwitchId.withoutId());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EntityPackage.Literals.SWITCH_EMF;
    }

    /**
     * Returns the value of the '<em><b>Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Entity</em>' attribute.
     * @see #setEntity(Switch)
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEmf_Entity()
     * @model dataType="org.metable.hex.domain.ch02.entity.SwitchEntity" transient="true"
     * @generated
     */
    public Switch getEntity() {
        return entity;
    }

    /**
     * Sets the value of the '{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getEntity <em>Entity</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newEntity the new value of the '<em>Entity</em>' attribute.
     * @see #getEntity()
     * @generated
     */
    public void setEntity(Switch newEntity) {
        Switch oldEntity = entity;
        entity = newEntity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.SWITCH_EMF__ENTITY, oldEntity, entity));
    }

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(SwitchId)
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEmf_Id()
     * @model dataType="org.metable.hex.domain.ch02.entity.SwitchId" volatile="true"
     * @generated OFF
     */
    public SwitchId getId() {
        return entity.getId();
    }

    /**
     * Sets the value of the '{@link org.metable.hex.domain.ch02.entity.SwitchEmf#getId <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newId the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated OFF
     */
    public void setId(SwitchId newId) {
        entity.setId(newId);
    }

    /**
     * Returns the value of the '<em><b>Networks</b></em>' attribute list. The list contents are of type
     * {@link org.metable.hex.domain.ch02.valueobject.Network}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Networks</em>' attribute list.
     * @see org.metable.hex.domain.ch02.entity.EntityPackage#getSwitchEmf_Networks()
     * @model dataType="org.metable.hex.domain.ch02.entity.Network" volatile="true"
     * @generated OFF
     */
    @SuppressWarnings({ "unchecked", "serial" })
    public EList<Network> getNetworks() {

        @SuppressWarnings("rawtypes")
        BasicEList list = new BasicInternalEList(Network.class, entity.getNetworks()) {

            @Override
            public void addUnique(Object object) {
                super.addUnique(object);
                entity.addNetwork((Network) object);
            }
        };

        return list;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EntityPackage.SWITCH_EMF__ENTITY:
            return getEntity();
        case EntityPackage.SWITCH_EMF__ID:
            return getId();
        case EntityPackage.SWITCH_EMF__NETWORKS:
            return getNetworks();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EntityPackage.SWITCH_EMF__ENTITY:
            setEntity((Switch) newValue);
            return;
        case EntityPackage.SWITCH_EMF__ID:
            setId((SwitchId) newValue);
            return;
        case EntityPackage.SWITCH_EMF__NETWORKS:
            getNetworks().clear();
            getNetworks().addAll((Collection<? extends Network>) newValue);
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
        case EntityPackage.SWITCH_EMF__ENTITY:
            setEntity(ENTITY_EDEFAULT);
            return;
        case EntityPackage.SWITCH_EMF__ID:
            setId(ID_EDEFAULT);
            return;
        case EntityPackage.SWITCH_EMF__NETWORKS:
            getNetworks().clear();
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
        case EntityPackage.SWITCH_EMF__ENTITY:
            return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
        case EntityPackage.SWITCH_EMF__ID:
            return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
        case EntityPackage.SWITCH_EMF__NETWORKS:
            return !getNetworks().isEmpty();
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
        result.append(" (entity: ");
        result.append(entity);
        result.append(')');
        return result.toString();
    }

    @Override
    public void addNetwork(Network network) {
        entity.addNetwork(network);
    }

} // SwitchEmf
