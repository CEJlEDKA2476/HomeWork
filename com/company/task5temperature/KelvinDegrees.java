package com.company.task5temperature;

public class KelvinDegrees extends Calculate {

    KelvinDegrees(double degrees) {
        super(degrees);
    }

    @Override
    public double calculateCelsius() {
        return degrees - 273.15;
    }

    @Override
    public double calculateFahrenheit() {
        return (degrees - 273.15) * 9/5 + 32;
    }

    @Override
    public double calculateKelvin() {
        return degrees;
    }
}
