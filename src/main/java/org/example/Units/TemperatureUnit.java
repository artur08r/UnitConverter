package org.example.Units;

public enum TemperatureUnit {
    CELSIUS {
        @Override
        public double toBase(double v) { return v; }
        @Override
        public double fromBase(double v) { return v; }
    },
    KELVIN {
        @Override
        public double toBase(double v) { return v - 273.15; }
        @Override
        public double fromBase(double v) { return v + 273.15; }
    },
    FAHRENHEIT {
        @Override
        public double toBase(double v) { return (v - 32) * 5/9; }
        @Override
        public double fromBase(double v) { return v * 9/5 + 32; }
    };

    public abstract double toBase(double v);
    public abstract double fromBase(double v);
}
