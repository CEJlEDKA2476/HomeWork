package com.company.task4print;

public class CashMachine implements OutputSystem {
    private int capacity;

    public CashMachine(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void outputData(String data) {
        System.out.println("this cashmachine have this capacity" + capacity);
    }

    @Override
    public void setup() {
        capacity = 50;
    }
}
