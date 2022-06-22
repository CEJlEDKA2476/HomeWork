package com.company.task4Polygons;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4);
        triangle.name();
        System.out.println(triangle.square());
        Square square = new Square(4, 4);
        square.name();
        System.out.println(square.square());
        Pentagon pentagon = new Pentagon(5, 4);
        pentagon.name();
        System.out.println(pentagon.square());
        Hexagon hexagon = new Hexagon(6, 3);
        hexagon.name();
        System.out.println(hexagon.square());
    }
}
