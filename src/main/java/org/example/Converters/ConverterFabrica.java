package org.example.Converters;

import org.example.ConverterException;
import org.example.Units.LengthUnit;
import org.example.Units.TemperatureUnit;
import org.example.Units.WeightUnit;

import java.util.concurrent.TimeUnit;

public class ConverterFabrica {
    public static BaseConverter<?> create(String category,double value, String from, String to){
        switch (category.toLowerCase()){
            case "length":
                return new LengthConverter(value,
                        LengthUnit.valueOf(from.toUpperCase()),
                        LengthUnit.valueOf(to.toUpperCase())
                );
            case "weight":
                return new WeightConverter(value,
                        WeightUnit.valueOf(from.toUpperCase()),
                        WeightUnit.valueOf(to.toUpperCase())
                );
            case "temperature":
                return new TemperatureConverter(value,
                        TemperatureUnit.valueOf(from.toUpperCase()),
                        TemperatureUnit.valueOf(to.toUpperCase())
                );

            default:
                throw new ConverterException("Неизвестная категория " + category);
        }
    }
}
