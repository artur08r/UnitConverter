package org.example.Converters;

import org.example.Units.LengthUnit;

public class LengthConverter extends BaseConverter<LengthUnit>{
    public LengthConverter(double value, LengthUnit from, LengthUnit to) {
        super(value, from, to);
    }

    @Override
    public double convertValue() {
        double base =  value * fromUnit.toBase;
        return base / toUnit.toBase;
    }
}
