package com.company.task4print;

public class Printer implements OutputSystem {
    private int speed;
    private int numberOfColors;

    public Printer(int speed, int numberOfColors) {
        this.speed = speed;
        this.numberOfColors = numberOfColors;
    }

    @Override
    public void outputData(String data) {
        System.out.println("this printer have this speed - " + data);
    }

    @Override
    public void setup() {
        numberOfColors = 4;
    }
}
