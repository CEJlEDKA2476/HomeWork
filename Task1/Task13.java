
package com.company;

import java.util.Scanner;

public class Task13 {

    public static void numberOfSymbol(String str1, int number) {
        if (number < str1.length()) {
            char a = str1.charAt(number);
            int symbolNumber = a;
            System.out.println("Символ - " + a + " Его код - " + symbolNumber);
        } else {
            System.out.println("Превышен лимит символов");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str1 = in.nextLine();
        System.out.println("Введите номер символа:");
        int number = in.nextInt();
        numberOfSymbol(str1, number);
        in.close();


    }
}
