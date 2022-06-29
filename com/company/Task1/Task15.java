
package com.company;

import java.util.Scanner;

public class Task15 {

    public static void reverceString(String str) {
        StringBuilder substr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            substr.append(str.charAt(i));
        System.out.print(substr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        reverceString(str);
        in.close();
    }
}
