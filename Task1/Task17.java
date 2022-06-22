
package com.company;

import java.util.Scanner;

public class Task17 {

    public static void mostRepitions(String str) {
        int b = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int a = 0;
            for (int j = i + 1; j <= str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    a++;
                }
            }
            if(b < a) {
                b = a;
            }
        }

        System.out.println(b);
//        String substr = "";
//        for(int i = str.length()-1; i >= 0; i--)
//            substr += str.charAt(i);
//        if(str.equals(substr))
//            System.out.println("Строка является полиндромом");
//        else
//            System.out.println("Строка НЕ является полиндромом");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        mostRepitions(str);
        in.close();
    }
}
