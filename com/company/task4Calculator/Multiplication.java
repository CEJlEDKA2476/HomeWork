package com.company.task4Calculator;

public class Multiplication extends Addition{

    Multiplication(double number1, double number2) {
        super(number1, number2);
    }

    double multiplication() {
        return number1 * number2;
    }
}
