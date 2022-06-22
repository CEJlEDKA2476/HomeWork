package com.company.task5network;

public class Display extends Device implements Print{

    Display(boolean activity){
        super(activity);
        System.out.println(Utils.MAX_NUMBER);
    }

    @Override
    public void print(String message) {
        System.out.println("Display");
        System.out.println(message);
    }
}
