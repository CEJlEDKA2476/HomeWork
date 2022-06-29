package com.company;

public class Task9 {


    public static void main(String[] args) {
        int a = 14;
        int b = 3;
        int c = 12;
        if (a == b && a == c) {
            System.out.println(2 * (a + b + c));
        } else
            System.out.println(a + b + c);

        if (a == 10 || b == 10 || a + b == 10)
            System.out.println("true");
        else
            System.out.println("false");

        if (a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c)
            System.out.println(b);
        else if (c > a && c > b)
            System.out.println(c);

        if (a < b && a < c)
            System.out.println(a);
        else if (b < a && b < c)
            System.out.println(b);
        else if (c < a && c < b)
            System.out.println(c);
    }
}
