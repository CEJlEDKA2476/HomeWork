package com.company.automobile;

public class Brakers {
    String name;
    int number;
    int power;
    int weight;

    Brakers(String name, int number, int power, int weight){
        this.name = name;
        this.number = number;
        this.power = power;
        this.weight = weight;
    }

    void breakingDistance(int x){
        System.out.println(x / power + " метра");
    }
}
