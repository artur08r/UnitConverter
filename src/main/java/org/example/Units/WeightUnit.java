package org.example.Units;

public enum WeightUnit {
    KILOGRAM(1),
    POUND(0.453592),
    OUNCE(0.0283495);

    public final double toBase;

    WeightUnit(double toBase) {
        this.toBase = toBase;
    }
}
