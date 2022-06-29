package com.company.automobile;

public class Engine {
    String name;
    private int power;
    int weight;

    Engine(String name, int power, int weight){
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    void autoPower(int x){
        System.out.println(power / x + " лошадей на тонну");
    }

}
