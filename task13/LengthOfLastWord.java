package com.company.task13;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println("Введите строку.");
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();

        int index = 0;

        words = words.trim();

        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) == ' '){
                index = i;
            }
        }

        System.out.print("Последнее слово - ");
        int numberOfLetters = 0;
        for(int i = index + 1; i < words.length(); i++){
            System.out.print(words.charAt(i));
            numberOfLetters++;
        }
        System.out.println();
        System.out.println("Количество букв - " + numberOfLetters);
    }
}
