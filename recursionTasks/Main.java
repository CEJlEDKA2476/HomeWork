package com.company.recursionTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер задания.");
        Scanner in = new Scanner(System.in);
        int numberOfAction = in.nextInt();
        switch (numberOfAction) {
            case 1:
                int[] array = new int[10];
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                }
                System.out.println(task1(array, 0));
                break;
            case 2:
                System.out.println("Введите число");
                int number = in.nextInt();
                System.out.println(task2(number));
                break;
            case 3:
                System.out.println("Введите 2 числа");
                int number1 = in.nextInt();
                int number2 = in.nextInt();
                System.out.println(task3(number1, number2));
                break;

            case 4:
                System.out.println("Введите число");
                int task4number = in.nextInt();
                System.out.println(task4(task4number));
            default:
                System.out.println("Введен неверный номер.");
        }
    }

    private static int task1(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            return array[index] + task1(array, index + 1);
        }
    }

    private static int task2(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * task2(number - 1);
        }
    }

    private static int task3(int number1, int number2) {
        if (number1 == number2) {
            return number1;
        } else if (number1 > number2) {
            return task3(number1 - number2, number2);
        } else {
            return task3(number1, number2 - number1);
        }
    }

    private static int task4 (int number){
        if(number == 1){
            return 1;
        } else if(number > 1){
            return task4(number - 2) + task4(number - 1);
        } else {
            return 0;
        }
    }
}
