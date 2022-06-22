
package com.company;

import java.util.Scanner;

public class Task27 {

    public static void oddArray(int array[]) {
            int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0) {
                a++;
            }
        }
            int[] oddArray = new int[a];
            a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0) {
                oddArray[a] += array[i];
                a++;
            }
        }
        System.out.print("Нечетный массив: \n");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
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
        System.out.println("Массив:");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        oddArray(array);
    }
}

