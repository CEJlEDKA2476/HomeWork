package com.company;

public class Task7 {

    public static void printMonthWithIfElse(int monthNumber) {
        if (monthNumber == 1)
            System.out.println("Январь");
        else if (monthNumber == 2)
            System.out.println("Февраль");
        else if (monthNumber == 3)
            System.out.println("Март");
        else if (monthNumber == 4)
            System.out.println("Апрель");
        else if (monthNumber == 5)
            System.out.println("Май");
        else if (monthNumber == 6)
            System.out.println("Июнь");
        else if (monthNumber == 7)
            System.out.println("Июль");
        else if (monthNumber == 8)
            System.out.println("Август");
        else if (monthNumber == 9)
            System.out.println("Сентябрь");
        else if (monthNumber == 10)
            System.out.println("Октябрь");
        else if (monthNumber == 11)
            System.out.println("Ноябрь");
        else if (monthNumber == 12)
            System.out.println("Декабрь");
        else
            System.out.println("Число не в диапозоне");

    }

    public static void printMonthWithSwitchCase(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Число не в диапозоне");
        }
    }

    public static void main(String[] args) {
        printMonthWithIfElse(2);
        printMonthWithSwitchCase(8);
    }
}