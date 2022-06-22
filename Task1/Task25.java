
package com.company;

import java.util.Scanner;

public class Task25 {

    public static void nearSquare(int array[]) {
        int num1;

        for (int i = 0; i <= array.length - 1; i++) {
            num1 = array[i];

            for (int j = 0; j <= array.length - 1; j++) {
                if (num1 * num1 == array[j] && i != j) {
                    if (i == 0) {
                        array[i + 1] *= array[i + 1];
                    } else if (i == 9) {
                        array[i - 1] *= array[i - 1];
                    } else {
                        array[i - 1] *= array[i - 1];
                        array[i + 1] *= array[i + 1];
                    }
                }
            }
        }
        System.out.println("Измененный массив:");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
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
        nearSquare(array);
    }
}

