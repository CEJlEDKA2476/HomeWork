package com.company.task4calculatorabstract;

public abstract class Action {
    protected double number1;
    protected double number2;

    Action (double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract double action();
}
