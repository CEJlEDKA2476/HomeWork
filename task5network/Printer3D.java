package com.company.task5network;

public class Printer3D extends Device implements Print{

    Printer3D(boolean activity){
        super(activity);
    }

    @Override
    public void print(String message) {
        System.out.println("Printer3D");
        System.out.println(message);
    }
}
