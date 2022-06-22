package com.company.task4calculatorabstract;

public abstract class UnknownAction extends Action{

    UnknownAction(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double action() {
        return 0;
    }
}
