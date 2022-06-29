
package com.company;

import java.util.Scanner;

public class Task24 {

    public static void meanNumber(int array[]) {
        int num = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            num += array[i];
        }
        System.out.println("Среднее значение - " + num / array.length);
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
        meanNumber(array);
    }
}
