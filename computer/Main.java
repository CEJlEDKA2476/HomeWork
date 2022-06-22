package com.company.computer;

public class Main {
    public static void main(String [] args){
        Processor processor = new Processor( "Intel" , 3.5);
        processor.calculate(5 , 7);
        Processor processor1 = new Processor("AMD" , 2d);
        processor1.calculate(1,4);
        System.out.println(processor.multiply());
        System.out.println(processor1.multiply());


        Motherboard motherboard = new Motherboard("LGA1015", "105");
        GPU gpu = new GPU("RTX2060", 16);
        Power power = new Power("BX100", 600);
        Computer computer = new Computer(processor, motherboard, gpu, power);
        computer.draw();
    }
}
