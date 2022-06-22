package com.company.task4Calculator;

public class Division extends Addition{

    Division(double number1, double number2) {
        super(number1, number2);
    }

    double division() {
        return number1/number2;
    }
}
