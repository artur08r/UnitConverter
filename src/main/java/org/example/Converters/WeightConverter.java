package org.example.Converters;

import org.example.Units.WeightUnit;

public class WeightConverter extends BaseConverter<WeightUnit>{
    public WeightConverter(double value, WeightUnit from, WeightUnit to) {
        super(value, from, to);
    }

    @Override
    public double convertValue() {
        double base = value * fromUnit.toBase;
        return base / toUnit.toBase;
    }
}
