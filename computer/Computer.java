package com.company.computer;

public class Computer {
    Processor processor;
    Motherboard motherboard;
    GPU gpu;
    Power power;

    Computer(Processor processor, Motherboard motherboard, GPU gpu, Power power){
        this.processor = processor;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.power = power;
    }

    void draw() {
        processor.calculate(2d, 8d);
        System.out.println(processor.multiply());
    }
}
