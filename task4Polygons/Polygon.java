package com.company.task4Polygons;

public class Polygon {
    protected int numberOfCorners;
    protected int sidesLength;
    String name = "Polygon";

    Polygon(int numberOfCorners, int sidesLength) {
        this.numberOfCorners = numberOfCorners;
        this.sidesLength = sidesLength;
    }

    public void name () {
        System.out.println(this.name);
    }


}
