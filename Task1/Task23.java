
package com.company;

import java.util.Scanner;

public class Task23 {

    public static void numberDistance(int maxId, int minId) {
        System.out.println("Расстояние между символами - " + Math.abs(maxId - minId));
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
        int maxId = 0;
        int maxNumber = 0;
        int minId = 0;
        int minNumber = 2147483647;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > maxNumber) { /*Вычисление максимума*/
                maxNumber = array[i];
                maxId = i;
            }
            if (array[i] < minNumber) { /*Вычисление минимума*/
                minNumber = array[i];
                minId = i;
            }
        }
        System.out.println("Максимальное число - " + maxNumber + " " + "Его номер - " + maxId);
        System.out.println("Минимальное число - " + minNumber + " " + "Его номер - " + minId);
        numberDistance(maxId, minId);
    }
}
