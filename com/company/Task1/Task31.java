package com.company;

import java.util.Scanner;

//4 8 2 5 3 9 1 6 10 7
public class Task31 {

    public static void insertionSortingUp(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println("Массив по возрастанию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void insertionSortingDown(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value > array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println("Массив по убыванию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите массив из 10 чисел");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        System.out.print("\n");
        insertionSortingUp(array);
        insertionSortingDown(array);
    }
}
