package com.company.task5temperature;

public abstract class Calculate {
    protected double degrees;

    Calculate(double degrees) {
        this.degrees = degrees;
    }

    public abstract double calculateCelsius();

    public abstract double calculateFahrenheit();

    public abstract double calculateKelvin();
}
