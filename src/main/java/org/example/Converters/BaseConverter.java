package org.example.Converters;

public abstract class BaseConverter<T> {
    protected double value;
    protected T fromUnit;
    protected T toUnit;

    public BaseConverter(double value, T from, T to) {
        this.value = value;
        this.fromUnit = from;
        this.toUnit = to;
    }

    public abstract double convertValue();

    public String printResult(){
        return String.format("%.2f %S = %.2f %S", value, fromUnit, convertValue(), toUnit);
    }
}
