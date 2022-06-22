
package com.company;

import java.util.Scanner;

public class Task14 {

    public static void ifStrHaveSubstr(String str, String substr) {
        if (str.contains(substr)) {
            System.out.println("Строка " + str + " содержит подстроку " + substr);
        } else {
            System.out.println("Строка " + str + " НЕ содержит подстроку " + substr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("Введите подстроку:");
        String substr = in.nextLine();
        ifStrHaveSubstr(str, substr);
        in.close();
    }
}
