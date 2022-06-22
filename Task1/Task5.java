package com.company;


public class Task5 {

    public static void checkTimePath(int number) {
        if (number <= 14) {
            System.out.println("Первая");
        } else if (number <= 29) {
            System.out.println("Второая");
        } else if (number <= 44) {
            System.out.println("Третья");
        } else {
            System.out.println("Четвертая");
        }
    }

    public static void parseMilliseconds(long milliseconds) {
        long hours = milliseconds / 3600000;
        long min = (milliseconds - 3600000) / 60000;
        long sec = (milliseconds - 3660000) / 1000;
        System.out.println("Часов " + hours + ", Минут " + min + ", Секунд " + sec);
    }

    public static void main(String[] args) {
        checkTimePath(2);
        checkTimePath(18);
        checkTimePath(34);
        checkTimePath(50);
        parseMilliseconds(3678254);
    }
}