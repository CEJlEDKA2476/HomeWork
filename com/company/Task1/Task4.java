package com.company;


public class Task4 {

    public static boolean checkHoliday(boolean isWeekDay, boolean isHoliday) {
        return !isWeekDay || isHoliday;
    }

    public static void main(String[] args) {
        if (checkHoliday(true, false)) {
            System.out.println("Давай работай");
        } else {
            System.out.println("Отдыхай");
        }
    }
}

