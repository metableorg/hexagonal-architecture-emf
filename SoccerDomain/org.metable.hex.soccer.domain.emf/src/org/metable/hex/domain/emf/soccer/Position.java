/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.Position#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.Position#getFieldPosition <em>Field Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.Position#getSpecialityPosition <em>Speciality Position</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getPosition_Name()
     * @model id="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.Position#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Field Position</b></em>' attribute.
     * The literals are from the enumeration {@link org.metable.hex.domain.emf.soccer.FieldPosition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Field Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.FieldPosition
     * @see #setFieldPosition(FieldPosition)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getPosition_FieldPosition()
     * @model
     * @generated
     */
    FieldPosition getFieldPosition();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.Position#getFieldPosition <em>Field Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Field Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.FieldPosition
     * @see #getFieldPosition()
     * @generated
     */
    void setFieldPosition(FieldPosition value);

    /**
     * Returns the value of the '<em><b>Speciality Position</b></em>' attribute.
     * The literals are from the enumeration {@link org.metable.hex.domain.emf.soccer.SpecialityPosition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Speciality Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.SpecialityPosition
     * @see #setSpecialityPosition(SpecialityPosition)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getPosition_SpecialityPosition()
     * @model
     * @generated
     */
    SpecialityPosition getSpecialityPosition();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.Position#getSpecialityPosition <em>Speciality Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speciality Position</em>' attribute.
     * @see org.metable.hex.domain.emf.soccer.SpecialityPosition
     * @see #getSpecialityPosition()
     * @generated
     */
    void setSpecialityPosition(SpecialityPosition value);

} // Position
