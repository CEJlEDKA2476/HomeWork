package com.company;


public class Task3 {

    public static double getAvgNumber(int x, int y, int z, int l) {
        return (x + y + z + l) / 4.0;
    }

    public static void clearOperator1() {
        int num = 47;
        num += 7;
        num -= 18;
        num *= 10;
        num /= 15;
        System.out.println("clearOperator1 = " + num);
    }

    public static void clearOperator2() {
        int num = 47;
        num++;
        num--;
        num++;
        num--;
        System.out.println("clearOperator1 = " + num);
    }




    public static void main(String[] args) {
        System.out.println(getAvgNumber(2,8,15,7));
        clearOperator1();
        clearOperator2();

        System.out.println((0.25 + 0.625 - 1) * 9 - 3);

        System.out.println(9 + 3.6 + (33/(48/1.67)));

        System.out.println(10 * 0.5 + (48 * 1.67));

    }
}

