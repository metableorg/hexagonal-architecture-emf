/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfPosition#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfPosition#getFieldPosition <em>Field Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfPosition#getSpecialityPosition <em>Speciality Position</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPosition()
 * @model
 * @generated
 */
public interface EmfPosition extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPosition_Name()
     * @model id="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfPosition#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Field Position</b></em>' attribute.
     * The literals are from the enumeration {@link org.metable.hex.domain.emf.soccer.EmfFieldPosition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Field Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.EmfFieldPosition
     * @see #setFieldPosition(EmfFieldPosition)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPosition_FieldPosition()
     * @model
     * @generated
     */
    EmfFieldPosition getFieldPosition();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfPosition#getFieldPosition <em>Field Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Field Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.EmfFieldPosition
     * @see #getFieldPosition()
     * @generated
     */
    void setFieldPosition(EmfFieldPosition value);

    /**
     * Returns the value of the '<em><b>Speciality Position</b></em>' attribute.
     * The literals are from the enumeration {@link org.metable.hex.domain.emf.soccer.EmfSpecialityPosition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Speciality Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.EmfSpecialityPosition
     * @see #setSpecialityPosition(EmfSpecialityPosition)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfPosition_SpecialityPosition()
     * @model
     * @generated
     */
    EmfSpecialityPosition getSpecialityPosition();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfPosition#getSpecialityPosition <em>Speciality Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speciality Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.EmfSpecialityPosition
     * @see #getSpecialityPosition()
     * @generated
     */
    void setSpecialityPosition(EmfSpecialityPosition value);

} // EmfPosition
