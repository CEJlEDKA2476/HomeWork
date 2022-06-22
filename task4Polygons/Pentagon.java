package com.company.task4Polygons;

public class Pentagon extends Polygon {
    String name = "Pentagon";

    Pentagon(int numberOfCorners, int sidesLength) {
        super(numberOfCorners, sidesLength);
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    double square() {
        return (Math.pow(sidesLength, 2) / 4) * Math.sqrt(25 + 10 * Math.sqrt(5));
    }
}
