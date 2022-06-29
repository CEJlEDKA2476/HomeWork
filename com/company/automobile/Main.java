package com.company.automobile;

public class Main {
    public static void main(String[] args) {
        Body body = new Body("ABC", 200);
        Brakers brakers = new Brakers("Aec", 4, 60, 135);
        Engine engine = new Engine("E1", 3500, 300);
        Salon salon = new Salon("UltraComfort", 4, 70);
        Transmission transmission = new Transmission("EC250", 6, 100);
        Wheels wheels = new Wheels("K25", 4, "K25Disks");

        Automobile automobile = new Automobile(body, brakers, engine, salon, transmission, wheels, 160);
        System.out.println(automobile.automobileWeight() + " кг");
        engine.autoPower(automobile.automobileWeight());
        brakers.breakingDistance(automobile.maxSpeed);
    }
}
