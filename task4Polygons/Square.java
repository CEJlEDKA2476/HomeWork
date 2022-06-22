package com.company.task4Polygons;

public class Square extends Polygon {
    String name = "Square";

    Square(int numberOfCorners, int sidesLength) {
        super(numberOfCorners, sidesLength);
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    public double square() {
        return Math.pow(sidesLength, 2);
    }
}
