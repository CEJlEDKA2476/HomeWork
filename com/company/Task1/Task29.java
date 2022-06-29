
package com.company;

import java.util.Scanner;

//4 8 2 5 3 9 1 6 10 7
public class Task29 {

    public static void boobleSortingUp(int array[]) {
        int tmp;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                i = 0;
            }
        }
        System.out.println("Массив по возрастанию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void boobleSortingDown(int array[]) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i = -1;
            }
        }
        System.out.println("Массив по убыванию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
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
        boobleSortingUp(array);
        boobleSortingDown(array);
    }
}

