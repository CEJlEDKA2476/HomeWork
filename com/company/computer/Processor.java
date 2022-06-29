package com.company.computer;

public class Processor {
    String model;
    protected double speed;
    double result;

//    Processor(){
//        this.model = "unknown";
//        this.speed = 0;
//    }
    Processor(String model, double speed){
        this.model = model;
        this.speed = speed;
    }

    protected void calculate(double x, double y){
        result = x * y;
    }

    double multiply(){
        return result * speed;
    }
}
