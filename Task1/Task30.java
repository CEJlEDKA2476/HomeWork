package com.company;

import java.util.Scanner;

//4 8 2 5 3 9 1 6 10 7
public class Task30 {

    public static void selectSortingUp(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Массив по возрастанию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void selectSortingDown(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            int pos = i;
            int min = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Массив по возрастанию:");
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
        selectSortingUp(array);
        selectSortingDown(array);
    }
}

