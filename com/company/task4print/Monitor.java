package com.company.task4print;

public class Monitor implements OutputSystem {
    private double screenSize;
    private int fps;

    public Monitor(double screenSize, int fps) {
        this.screenSize = screenSize;
        this.fps = fps;
    }

    @Override
    public void outputData(String data) {
        System.out.println("Monitor have this fps - " + fps);
    }

    @Override
    public void setup() {
        fps = 120;
    }
}
