package com.company.task5network;

public class Utils {
    public static final int MAX_NUMBER;

    static {
        MAX_NUMBER = 100;
    }

    public static boolean isDeviceActive(Device device){
        return device.isActivity();
    }
}
