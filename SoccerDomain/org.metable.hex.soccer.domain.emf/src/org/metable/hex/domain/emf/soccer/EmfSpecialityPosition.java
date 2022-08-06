/**
 */
package org.metable.hex.domain.emf.soccer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Emf Speciality Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfSpecialityPosition()
 * @model
 * @generated
 */
public enum EmfSpecialityPosition implements Enumerator {
    /**
     * The '<em><b>STRIKER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRIKER_VALUE
     * @generated
     * @ordered
     */
    STRIKER(0, "STRIKER", "STRIKER"),

    /**
     * The '<em><b>WING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WING_VALUE
     * @generated
     * @ordered
     */
    WING(1, "WING", "WING"),

    /**
     * The '<em><b>LEFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEFT_VALUE
     * @generated
     * @ordered
     */
    LEFT(2, "LEFT", "LEFT"),

    /**
     * The '<em><b>RIGHT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RIGHT_VALUE
     * @generated
     * @ordered
     */
    RIGHT(3, "RIGHT", "RIGHT"),

    /**
     * The '<em><b>CENTER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CENTER_VALUE
     * @generated
     * @ordered
     */
    CENTER(4, "CENTER", "CENTER"),

    /**
     * The '<em><b>ATTACKING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTACKING_VALUE
     * @generated
     * @ordered
     */
    ATTACKING(5, "ATTACKING", "ATTACKING"),

    /**
     * The '<em><b>DEFENSIVE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFENSIVE_VALUE
     * @generated
     * @ordered
     */
    DEFENSIVE(6, "DEFENSIVE", "DEFENSIVE"),

    /**
     * The '<em><b>SWEEPER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWEEPER_VALUE
     * @generated
     * @ordered
     */
    SWEEPER(7, "SWEEPER", "SWEEPER"),

    /**
     * The '<em><b>KEEPER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KEEPER_VALUE
     * @generated
     * @ordered
     */
    KEEPER(8, "KEEPER", "KEEPER");

    /**
     * The '<em><b>STRIKER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRIKER
     * @model
     * @generated
     * @ordered
     */
    public static final int STRIKER_VALUE = 0;

    /**
     * The '<em><b>WING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WING
     * @model
     * @generated
     * @ordered
     */
    public static final int WING_VALUE = 1;

    /**
     * The '<em><b>LEFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEFT
     * @model
     * @generated
     * @ordered
     */
    public static final int LEFT_VALUE = 2;

    /**
     * The '<em><b>RIGHT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RIGHT
     * @model
     * @generated
     * @ordered
     */
    public static final int RIGHT_VALUE = 3;

    /**
     * The '<em><b>CENTER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CENTER
     * @model
     * @generated
     * @ordered
     */
    public static final int CENTER_VALUE = 4;

    /**
     * The '<em><b>ATTACKING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTACKING
     * @model
     * @generated
     * @ordered
     */
    public static final int ATTACKING_VALUE = 5;

    /**
     * The '<em><b>DEFENSIVE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFENSIVE
     * @model
     * @generated
     * @ordered
     */
    public static final int DEFENSIVE_VALUE = 6;

    /**
     * The '<em><b>SWEEPER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SWEEPER
     * @model
     * @generated
     * @ordered
     */
    public static final int SWEEPER_VALUE = 7;

    /**
     * The '<em><b>KEEPER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KEEPER
     * @model
     * @generated
     * @ordered
     */
    public static final int KEEPER_VALUE = 8;

    /**
     * An array of all the '<em><b>Emf Speciality Position</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EmfSpecialityPosition[] VALUES_ARRAY =
        new EmfSpecialityPosition[] {
            STRIKER,
            WING,
            LEFT,
            RIGHT,
            CENTER,
            ATTACKING,
            DEFENSIVE,
            SWEEPER,
            KEEPER,
        };

    /**
     * A public read-only list of all the '<em><b>Emf Speciality Position</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EmfSpecialityPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Emf Speciality Position</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EmfSpecialityPosition get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EmfSpecialityPosition result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Emf Speciality Position</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EmfSpecialityPosition getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EmfSpecialityPosition result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Emf Speciality Position</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EmfSpecialityPosition get(int value) {
        switch (value) {
            case STRIKER_VALUE: return STRIKER;
            case WING_VALUE: return WING;
            case LEFT_VALUE: return LEFT;
            case RIGHT_VALUE: return RIGHT;
            case CENTER_VALUE: return CENTER;
            case ATTACKING_VALUE: return ATTACKING;
            case DEFENSIVE_VALUE: return DEFENSIVE;
            case SWEEPER_VALUE: return SWEEPER;
            case KEEPER_VALUE: return KEEPER;
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
    private EmfSpecialityPosition(int value, String name, String literal) {
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
    
} //EmfSpecialityPosition
