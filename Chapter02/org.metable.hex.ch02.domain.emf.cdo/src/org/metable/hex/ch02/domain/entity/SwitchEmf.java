/**
 */
package org.metable.hex.ch02.domain.entity;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchId;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Switch Emf</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getId <em>Id</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getType <em>Type</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getAddress <em>Address</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.entity.EntityPackage#getSwitchEmf()
 * @model kind="class" superTypes="org.metable.hex.ch02.domain.entity.ISwitch"
 * @extends CDOObject
 * @generated
 */
public class SwitchEmf extends CDOObjectImpl implements CDOObject, ISwitch {

    @SuppressWarnings("unchecked")
    @Override
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
        Object result = super.eGet(eFeature, resolve);

        switch (eFeature.getFeatureID()) {
        case EntityPackage.SWITCH_EMF__NETWORKS:
            return new ListAdapter<Object>((InternalEList<Object>) result) {

                @Override
                public void addUnique(Object object) {
                    super.addUnique(object);
                    getEntity().addNetwork((Network) object);
                }};
        }

        return result;
    }

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue) {
        super.eSet(eFeature, newValue);

        switch (eFeature.getFeatureID()) {
        case EntityPackage.SWITCH_EMF__ADDRESS:
            getEntity().setAddress(getAddress());
            break;
        case EntityPackage.SWITCH_EMF__ID:
            getEntity().setId(getId());
            break;
        case EntityPackage.SWITCH_EMF__TYPE:
            getEntity().setType(getType());
            break;
        }
    }

    @Override
    public String toString() {
        return "SwitchEmf [entity=" + entity + "]";
    }

    private Switch entity;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SwitchEmf() {
        super();
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(SwitchId)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getSwitchEmf_Id()
     * @model dataType="org.metable.hex.ch02.domain.entity.SwitchId" volatile="true"
     * @generated
     */
    public SwitchId getId() {
        return (SwitchId) eGet(EntityPackage.Literals.SWITCH_EMF__ID, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getId <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newId the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    public void setId(SwitchId newId) {
        eSet(EntityPackage.Literals.SWITCH_EMF__ID, newId);
    }

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(SwitchType)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getSwitchEmf_Type()
     * @model dataType="org.metable.hex.ch02.domain.entity.SwitchType" volatile="true"
     * @generated
     */
    public SwitchType getType() {
        return (SwitchType) eGet(EntityPackage.Literals.SWITCH_EMF__TYPE, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newType the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    public void setType(SwitchType newType) {
        eSet(EntityPackage.Literals.SWITCH_EMF__TYPE, newType);
    }

    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(IP)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getSwitchEmf_Address()
     * @model dataType="org.metable.hex.ch02.domain.entity.IP" volatile="true"
     * @generated
     */
    public IP getAddress() {
        return (IP) eGet(EntityPackage.Literals.SWITCH_EMF__ADDRESS, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.SwitchEmf#getAddress <em>Address</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newAddress the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    public void setAddress(IP newAddress) {
        eSet(EntityPackage.Literals.SWITCH_EMF__ADDRESS, newAddress);
    }

    /**
     * Returns the value of the '<em><b>Networks</b></em>' attribute list. The list contents are of type
     * {@link org.metable.hex.ch02.domain.valueobject.Network}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Networks</em>' attribute list.
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getSwitchEmf_Networks()
     * @model dataType="org.metable.hex.ch02.domain.entity.Network" volatile="true"
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Network> getNetworks() {

        return (EList<Network>) eGet(EntityPackage.Literals.SWITCH_EMF__NETWORKS, true);
    }

    @Override
    public void addNetwork(Network network) {
        getNetworks().add(network);
        // getEntity().addNetwork(network);
    }

    public Switch getEntity() {
        return entity;
    }

    public void setEntity(Switch entity) {
        this.entity = entity;
        setId(entity.getId());
        setType(entity.getType());

        entity.getNetworks().forEach(n -> {
            entity.addNetwork(n);
        });
    }

} // SwitchEmf
