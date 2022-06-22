package com.company.exception;

public class Main {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;
        int number3 = number1/number2;
//        int number4 = 10 / number3;

        Integer number5 = null;

        try {
            task(number5);
        } catch (Exception ex){
            System.out.println("123");
            ex.printStackTrace();
        }
//        try {
//            number5.hashCode();
//            System.out.println(number3);
//        } catch (NullPointerException ex) {
//            System.out.println("111");
//        } catch (Exception ex) {
//            System.out.println("111");
//        } finally {
//            System.out.println("222");
//        }
//
//        throw new NullPointerException();
    }


    private static void task(Integer number) throws Exception {
        number.hashCode();
    }
}


