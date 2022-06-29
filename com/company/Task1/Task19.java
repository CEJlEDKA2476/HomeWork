
package com.company;

import java.util.Scanner;

public class Task19 {

    public static void numberOfWords(String str) {
        String[] words = str.split(" ");
        int a = 0;
        for (int i = 0; i < words.length; i++) a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        numberOfWords(str);
        in.close();
    }
}
