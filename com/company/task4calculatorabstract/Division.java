package com.company.task4calculatorabstract;

public class Division extends Action {

    Division(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double action() {
        return number1 / number2;
    }
}
