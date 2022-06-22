package com.company;

public class Task10 {

    public static boolean primeNumber(int number) {
        for (int mod = 2; mod < number; ++mod) {
            if (number % mod == 0) {
                return false;
            } else {
                continue;
            }
        }

        return true;
    }

    public static void fib() {

        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 0; i < 15; i++) {
            c = b + a;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static int pow(int num, int dig) {
        int a = 1;
        for (int i = 1; i <= dig; i++) {
            a = a * num;
        }
        return a;
    }

    public static void rotate(int number) {

        while (number / 10 != 0) {
            System.out.print(number % 10);
            number = number / 10;
        }
            System.out.print(number);

    }

    public static void main(String[] args) {

        int maximum = 30;
        for (int i = 2; i <= maximum; i++) {
            if (primeNumber(i)) System.out.print(i + " ");
        }

        System.out.print("\n");
        fib();

        System.out.print("\n");
        rotate(657123);


        System.out.print("\n");
        System.out.println(pow(2, 7));

    }
}
