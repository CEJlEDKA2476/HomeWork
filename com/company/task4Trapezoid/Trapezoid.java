package com.company.task4Trapezoid;
public class Trapezoid {
    private double CoordinateAx;
    private double CoordinateAy;
    private double CoordinateBx;
    private double CoordinateBy;
    private double CoordinateCx;
    private double CoordinateCy;
    private double CoordinateDx;
    private double CoordinateDy;

    Trapezoid(double CoordinateAx, double CoordinateAy, double CoordinateBx, double CoordinateBy, double CoordinateCx,
              double CoordinateCy, double CoordinateDx, double CoordinateDy) {
        this.CoordinateAx = CoordinateAx;
        this.CoordinateAy = CoordinateAy;
        this.CoordinateBx = CoordinateBx;
        this.CoordinateBy = CoordinateBy;
        this.CoordinateCx = CoordinateCx;
        this.CoordinateCy = CoordinateCy;
        this.CoordinateDx = CoordinateDx;
        this.CoordinateDy = CoordinateDy;
    }

    public double partiesAB() {
        return calculateParties(CoordinateAx, CoordinateBx, CoordinateAy, CoordinateBy);
    }

    public double partiesBC() {
        return calculateParties(CoordinateBx, CoordinateCx, CoordinateBy, CoordinateCy);
    }

    public double partiesCD() {
        return calculateParties(CoordinateCx, CoordinateDx, CoordinateCy, CoordinateDy);
    }

    public double partiesAD() {
        return calculateParties(CoordinateAx, CoordinateDx, CoordinateAy, CoordinateDy);
    }

    private double calculateParties (double x1, double x2, double y1, double y2) {
        double resultX = Math.pow(x2 - x1, 2);
        double resultY = Math.pow(y2 - y1, 2);
        return Math.sqrt(resultX + resultY);
    }

}
