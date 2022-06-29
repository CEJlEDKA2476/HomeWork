package com.company;

public class Task8 {

    public static void printMonthWithIfElse(int monthNumber) {
        if (monthNumber == 1)
            System.out.println("Январь" + " 31");
        else if (monthNumber == 2)
            System.out.println("Февраль" + " 28");
        else if (monthNumber == 3)
            System.out.println("Март" + " 31");
        else if (monthNumber == 4)
            System.out.println("Апрель" + " 30");
        else if (monthNumber == 5)
            System.out.println("Май" + " 31");
        else if (monthNumber == 6)
            System.out.println("Июнь" + " 30");
        else if (monthNumber == 7)
            System.out.println("Июль" + " 31");
        else if (monthNumber == 8)
            System.out.println("Август" + " 31");
        else if (monthNumber == 9)
            System.out.println("Сентябрь" + " 30");
        else if (monthNumber == 10)
            System.out.println("Октябрь" + " 31");
        else if (monthNumber == 11)
            System.out.println("Ноябрь" + " 30");
        else if (monthNumber == 12)
            System.out.println("Декабрь" + " 31");
        else
            System.out.println("Число не в диапозоне");

    }

    public static void printMonthWithSwitchCase(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Январь" + " 31");
                break;
            case 2:
                System.out.println("Февраль" + " 28");
                break;
            case 3:
                System.out.println("Март" + " 31");
                break;
            case 4:
                System.out.println("Апрель" + " 30");
                break;
            case 5:
                System.out.println("Май" + " 31");
                break;
            case 6:
                System.out.println("Июнь" + " 30");
                break;
            case 7:
                System.out.println("Июль" + " 31");
                break;
            case 8:
                System.out.println("Август" + " 31");
                break;
            case 9:
                System.out.println("Сентябрь" + " 30");
                break;
            case 10:
                System.out.println("Октябрь" + " 31");
                break;
            case 11:
                System.out.println("Ноябрь" + " 30");
                break;
            case 12:
                System.out.println("Декабрь" + " 31");
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