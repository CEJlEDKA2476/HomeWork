package com.company.task5temperature;

public class FahrenheitDegrees extends Calculate {

    FahrenheitDegrees(double degrees){
        super(degrees);
    }

    @Override
    public double calculateCelsius() {
        return (degrees - 32) * 5/9;
    }

    @Override
    public double calculateFahrenheit() {
        return degrees;
    }

    @Override
    public double calculateKelvin() {
        return (degrees - 32) * 5/9 + 273.15;
    }
}
