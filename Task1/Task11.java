package com.company;

public class Task11 {

    public static void maxDevider(int number1, int number2) {
        while (number2 != 0) {
            int tmp = number1 % number2;
            number1 = number2;
            number2 = tmp;
        }
        System.out.println(number1);
    }

    public static void changePosition(int number1, int number2) {
        System.out.println("Первое - " + number1 + " Второе - " + number2);
        System.out.println("...Смена...");
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("Первое - " + number1 + " Второе - " + number2);
    }

    public static void main(String[] args) {

        changePosition(23, 16);
        maxDevider(30, 32);

    }
}
