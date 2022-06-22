package com.company.task4Polygons;

public class Triangle extends Polygon {
    String name = "Triangle";

    Triangle(int numberOfCorners, int sidesLength) {
        super(numberOfCorners, sidesLength);
    }

    @Override
    public void name() {
        System.out.println(this.name);
    }

    public double square() {
        return (Math.sqrt(3) * Math.pow(sidesLength, 2) / 4);
    }
}
