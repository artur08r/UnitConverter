package org.example.Converters;

import org.example.Units.TemperatureUnit;

public class TemperatureConverter extends BaseConverter<TemperatureUnit>{
    public TemperatureConverter(double value, TemperatureUnit from, TemperatureUnit to) {
        super(value, from, to);
    }

    @Override
    public double convertValue() {
        double base = fromUnit.toBase(value);
        return toUnit.fromBase(base);
    }

}
