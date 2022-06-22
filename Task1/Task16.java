
package com.company;

import java.util.Scanner;

public class Task16 {

    public static void ifpalindrome(String str) {
//        String substr = "";
//        for (int i = str.length() - 1; i >= 0; i--)
//            substr += str.charAt(i);
//        if (str.equals(substr))
//            System.out.println("Строка является полиндромом");
//        else
//            System.out.println("Строка НЕ является полиндромом");
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Строка является полиндромом");
        } else {
            System.out.println("Строка НЕ является полиндромом");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        ifpalindrome(str);
        in.close();
    }
}
