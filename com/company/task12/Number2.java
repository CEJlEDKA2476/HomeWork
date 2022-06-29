package com.company.task12;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        System.out.println("Вывод элементов:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int first = 0;
        int last = numbers.length - 1;
        int middle = (first + last) / 2;
        System.out.println("Введите искомый элемент.");
        Scanner in = new Scanner(System.in);
        int searchNumber = in.nextInt();


        while (first <= last) {
            if (numbers[middle] < searchNumber) {
                first = middle + 1;
            } else if (numbers[middle] == searchNumber) {
                System.out.println(searchNumber + " находится на " + (numbers[middle] + 1) + " месте");
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(searchNumber + " не существует.");
        }
    }
}
