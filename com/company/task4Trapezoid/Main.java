package com.company.task4Trapezoid;

public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(1.0, 1.0, 3.0, 4.0, 5.0, 4.0, 6.0, 1.0);

        System.out.println(trapezoid.partiesAB());
        System.out.println(trapezoid.partiesBC());
        System.out.println(trapezoid.partiesCD());
        System.out.println(trapezoid.partiesAD());
    }
}