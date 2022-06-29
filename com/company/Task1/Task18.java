
package com.company;

import java.util.Scanner;

public class Task18 {

    public static void changePosition(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i += 2) {
            System.out.println(words[i + 1]);
            System.out.println(words[i]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        changePosition(str);
        in.close();
    }
}
