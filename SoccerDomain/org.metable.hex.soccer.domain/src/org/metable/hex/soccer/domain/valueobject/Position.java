package org.metable.hex.soccer.domain.valueobject;

import java.util.Objects;

public final class Position {

    @Override
    public int hashCode() {
        return Objects.hash(fieldPosition, specialityPosition);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Position other = (Position) obj;
        return fieldPosition == other.fieldPosition && specialityPosition == other.specialityPosition;
    }

    public static Position Striker = new Position(FieldPosition.Forward, SpecialityPosition.Striker);

    public static Position CenterForward = new Position(FieldPosition.Forward, SpecialityPosition.Center);

    public static Position Winger = new Position(FieldPosition.Forward, SpecialityPosition.Wing);

    public static Position LeftMidfielder = new Position(FieldPosition.Middle, SpecialityPosition.Left);

    public static Position RightMidfielder = new Position(FieldPosition.Middle, SpecialityPosition.Right);

    public static Position CentralMidfielder = new Position(FieldPosition.Middle, SpecialityPosition.Right);

    public static Position AttackingMidfielder = new Position(FieldPosition.Middle, SpecialityPosition.Attacking);

    public static Position DefensiveMidfielder = new Position(FieldPosition.Middle, SpecialityPosition.Defensive);

    public static Position CenterBack = new Position(FieldPosition.Back, SpecialityPosition.Center);

    public static Position LeftBack = new Position(FieldPosition.Back, SpecialityPosition.Left);

    public static Position RightBack = new Position(FieldPosition.Back, SpecialityPosition.Right);

    public static Position WingBack = new Position(FieldPosition.Back, SpecialityPosition.Wing);

    public static Position Sweeper = new Position(FieldPosition.Back, SpecialityPosition.Sweeper);

    public static Position Goalkeeper = new Position(FieldPosition.Back, SpecialityPosition.Keeper);

    private final FieldPosition fieldPosition;

    private final SpecialityPosition specialityPosition;

    private Position(FieldPosition fieldPosition, SpecialityPosition specialityPosition) {
        this.fieldPosition = fieldPosition;
        this.specialityPosition = specialityPosition;
    }

    public FieldPosition getFieldPosition() {
        return fieldPosition;
    }

    public SpecialityPosition getSpecialityPosition() {
        return specialityPosition;
    }
}
