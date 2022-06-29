
package com.company;

import java.util.Scanner;

public class Task22 {

    public static void maxNumer(int array[]) {
        int a = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > a) a = array[i];
        }
        System.out.println("Максимальное число - " + a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите массив из 10 чисел");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Массив:");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        in.close();
        maxNumer(array);
    }
}
