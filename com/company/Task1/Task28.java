
package com.company;

import java.util.Scanner;

public class Task28 {

    public static void rotate(int array[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("Измененный массив:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
                if (j == 4) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[][] = new int[5][5];
        System.out.println("Введите двумерный массив");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println("Массив:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
                if (j == 4) {
                    System.out.println();
                }
            }
        }
        System.out.print("\n");
        rotate(array);
    }
}

