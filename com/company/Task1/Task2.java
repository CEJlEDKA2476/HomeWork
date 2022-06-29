package com.company;


public class Task2 {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static boolean isOddNumber(int number) {
        return (number % 2) != 0;
    }

    public static void printParitySign(boolean isEven) {
        if (isEven) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечентное");
        }
    }

    public static void printParitySign1(boolean isEven) {
        String result = "Четное";
        if (!isEven) {
            result = "Нечетное";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        int number = 8;
        System.out.println("Четное ли " + number + " - " + isEvenNumber(number));

        int number1 = 12;
        System.out.println("Нечетное ли " + number1 + " - " + isOddNumber(number1));

        boolean a = isEvenNumber(number);
        printParitySign(a);
    }
}

