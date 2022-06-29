package com.company.task5network;

public class Printer extends Device implements Print{

    Printer(boolean activity) {
        super(activity);
    }

    @Override
    public void print(String message) {
        System.out.println("Printer");
        System.out.println(message);
    }

}
