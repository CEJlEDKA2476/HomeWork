package com.company;


public class Task1 {

    public static double meterToInch(double meter) {
        return meter * 0.0254;
    }

    public static double inchToMeter(double inch) {
        double a;
        a = inch / 0.0254;
        return a;
    }

    public static double kilogramToGram(double kilogram) {
        double a;
        a = kilogram * 1000;
        return a;
    }

    public static double gramToKilogram(double gram) {
        double a;
        a = gram / 1000;
        return a;
    }

    public static double literToCubicMeter(double liter) {
        double a;
        a = liter * 0.001;
        return a;
    }

    public static double cubicMeterToLiter(double liter) {
        double a;
        a = liter * 1000;
        return a;
    }




    public static void main(String[] args) {



        double inch = meterToInch(5);
        System.out.println("meterToInch - 5: " + inch);

        inch = meterToInch(0);
        System.out.println("meterToInch - 0: " + inch);

        double meter = inchToMeter(10);
        System.out.println("inchToMeter - 10: " + meter);

        meter = inchToMeter(0);
        System.out.println("inchToMeter - 0: " + meter);

        double gram = kilogramToGram(13);
        System.out.println("kilogramToGram - 13: " + gram);

        gram = kilogramToGram(0);
        System.out.println("kilogramToGram - 0: " + gram);

        double kilogram = gramToKilogram(991);
        System.out.println("gramToKilogram - 991: " + kilogram);

        kilogram = gramToKilogram(0);
        System.out.println("gramToKilogram - 0: " + kilogram);

        double cubicMeter = literToCubicMeter(88);
        System.out.println("literToCubicMeter - 88: " + cubicMeter);

        cubicMeter = literToCubicMeter(0);
        System.out.println("literToCubicMeter - 0: " + cubicMeter);

        double liter = cubicMeterToLiter(69);
        System.out.println("cubicMeterToLiter - 69: " + liter);

        liter = cubicMeterToLiter(0);
        System.out.println("cubicMeterToLiter - 0: " + liter);

    }
}

