package com.company.automobile;

public class Automobile {
    Body body;
    Brakers brakers;
    Engine engine;
    Salon salon;
    Transmission transmission;
    Wheels wheels;
    int maxSpeed;

    Automobile(Body body, Brakers brakers, Engine engine, Salon salon,
               Transmission transmission, Wheels wheels, int maxSpeed) {
        this.body = body;
        this.brakers = brakers;
        this.engine = engine;
        this.salon = salon;
        this.transmission = transmission;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
    }

    int automobileWeight() {
        return body.weight + brakers.weight + engine.weight + salon.weight + transmission.weight;
    }
}
