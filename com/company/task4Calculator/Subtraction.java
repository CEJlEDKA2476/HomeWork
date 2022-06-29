package com.company.task4Calculator;

public class Subtraction extends Addition{

    Subtraction(double number1, double number2){
        super(number1, number2);
    }

    double substraction() {
        return number1 - number2;
    }
}
