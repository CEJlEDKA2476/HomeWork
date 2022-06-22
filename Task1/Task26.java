
package com.company;

import java.util.Scanner;

public class Task26 {

    public static void incresingSequence(int array[]) {
        int a = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                a++;
            } else {
                System.out.println("Массив НЕ является возрастающей последовательностью");
                a = 0;
                break;
            }
        }
        if (a != 0) {
            System.out.println("Массив является возрастающей последовательностью");
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
        incresingSequence(array);
    }
}

