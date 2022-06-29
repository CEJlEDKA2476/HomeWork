package com.company;

public class Task6 {

    public static int roundNumber(double number) {
        return (int)(number + 0.5);
    }

    public static double getTail(double number) {
        return number - (int)number;
    }

    public static void main(String[] args) {
        System.out.println(roundNumber(7.4));
        System.out.println(getTail(7.8));
    }
}
