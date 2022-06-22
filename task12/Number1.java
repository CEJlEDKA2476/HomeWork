package com.company.task12;

public class Number1 {
    public static void main(String[] args) {
        SubNumber1 subNumber1 = new SubNumber1();
        int[] number1 = {1, 0, 1, 0, 1};
        int[] number2 = {1, 1, 1};

        int[] number3;
        int[] number4;

        subNumber1.printArray(number1);
        subNumber1.printArray(number2);

        number3 = subNumber1.checkArray(number1, number2);
        number4 = subNumber1.checkArray(number2, number1);

        subNumber1.printArray(number3);
        subNumber1.printArray(number4);

        subNumber1.addition(number3, number4);
    }
}
