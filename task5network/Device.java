package com.company.task5network;

public abstract class Device {
    protected boolean activity;

    Device(boolean activity) {
        this.activity = activity;
    }

    public boolean isActivity(){
        return activity;
    }

    public void print(String message) {
        System.out.println(message);
    }
}
