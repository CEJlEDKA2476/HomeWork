package com.company.task5temperature;

public class CelsiusDegrees extends Calculate {

    CelsiusDegrees(double degrees) {
        super(degrees);
    }

    @Override
    public double calculateCelsius() {
        return degrees;
    }

    @Override
    public double calculateFahrenheit() {
        return (degrees * 9 / 5) + 32;
    }

    @Override
    public double calculateKelvin() {
        return degrees + 273.15;
    }

    public static class CelsiusAdapter {

        void full(){
//            degrees = 0;
        }



    }

}
