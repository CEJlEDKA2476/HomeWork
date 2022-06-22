package com.company.task5network;

public class TV extends Device implements Print{

    TV(boolean activity){
        super(activity);
    }

    @Override
    public void print(String message) {
        System.out.println("TV");
        System.out.println(message);
    }
}
