package org.example.Units;

public enum LengthUnit {
    METER(1),
    KILOMETER(1000),
    MILE(1609.34);

    public final double toBase;
    LengthUnit(double toBase) {
        this.toBase = toBase;
    }
}
