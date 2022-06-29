package com.company.task4Polygons;

public class Hexagon extends Polygon {
    String name = "Hexagon";

    Hexagon(int numberOfCorners, int sidesLength) {
        super(numberOfCorners, sidesLength);
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    double square() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(sidesLength, 2);
    }
}
