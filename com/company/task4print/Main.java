package com.company.task4print;

public class Main {
    public static void main(String[] args) {
        OutputSystem printer = new Printer(100, 10);
        printer.outputData("hasd");
        int a = 100;
        printer = new OutputSystem() {
            @Override
            public void outputData(String data) {
                System.out.println(a + data);
            }

            @Override
            public void setup() {

            }
        };
    }
}
