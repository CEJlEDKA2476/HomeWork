
package com.company;

import java.util.Scanner;

public class Task12 {

    public static void stringEquals(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2))
            System.out.println("Введенные строки равны");
        else
            System.out.println("Введенные строки не равны");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 строки:");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println("Первая строка - " + str1 + "\nВторая строка - " + str2);
        in.close();
        stringEquals(str1, str2);


    }
}
