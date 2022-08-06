/**
 */
package org.metable.hex.domain.emf.soccer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Emf Field Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfFieldPosition()
 * @model
 * @generated
 */
public enum EmfFieldPosition implements Enumerator {
    /**
     * The '<em><b>FORWARD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FORWARD_VALUE
     * @generated
     * @ordered
     */
    FORWARD(0, "FORWARD", "FORWARD"),

    /**
     * The '<em><b>MIDDLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIDDLE_VALUE
     * @generated
     * @ordered
     */
    MIDDLE(1, "MIDDLE", "MIDDLE"),

    /**
     * The '<em><b>BACK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BACK_VALUE
     * @generated
     * @ordered
     */
    BACK(2, "BACK", "BACK");

    /**
     * The '<em><b>FORWARD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FORWARD
     * @model
     * @generated
     * @ordered
     */
    public static final int FORWARD_VALUE = 0;

    /**
     * The '<em><b>MIDDLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIDDLE
     * @model
     * @generated
     * @ordered
     */
    public static final int MIDDLE_VALUE = 1;

    /**
     * The '<em><b>BACK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BACK
     * @model
     * @generated
     * @ordered
     */
    public static final int BACK_VALUE = 2;

    /**
     * An array of all the '<em><b>Emf Field Position</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EmfFieldPosition[] VALUES_ARRAY =
        new EmfFieldPosition[] {
            FORWARD,
            MIDDLE,
            BACK,
        };

    /**
     * A public read-only list of all the '<em><b>Emf Field Position</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EmfFieldPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Emf Field Position</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EmfFieldPosition get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EmfFieldPosition result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Emf Field Position</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EmfFieldPosition getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EmfFieldPosition result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Emf Field Position</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EmfFieldPosition get(int value) {
        switch (value) {
            case FORWARD_VALUE: return FORWARD;
            case MIDDLE_VALUE: return MIDDLE;
            case BACK_VALUE: return BACK;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EmfFieldPosition(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //EmfFieldPosition
