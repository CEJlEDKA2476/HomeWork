package com.company.task4Calculator;

public class Addition {
    protected double number1;
    protected double number2;

    Addition(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    double addition() {
        return number1 + number2;
    }
}
