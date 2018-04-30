//package com.company;

public class ThirteenNine extends GeometricObject implements Comparable {
    // ----- Question 13.9 -----
    /* This class is supposed to be called "Circle" however I called it
    "ThirteenNine" so I can keep track of the problem I am working on" */

    // ----- Global Variables
    private double radius;

    public static void main(String[] args) {}  // JA: No main?

    // ----- Methods
    public ThirteenNine() {}

    public ThirteenNine(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        boolean equals = false;

        // - Cast & Get Areas
        ThirteenNine circleObject = (ThirteenNine) o;
        double circleArea = circleObject.getArea();
        double thisArea = this.getArea();


        if (thisArea == circleArea) {
            equals = true;
        }

        return equals;
    }

    @Override
    public int compareTo(Object o) {
        // -1 = Less than, 0 = Equal to, 1 = Grater than
        int compared = 0;

        // - Cast & Get Radiuses
        ThirteenNine circleObject = (ThirteenNine) o;
        double circleRadius = circleObject.getRadius();
        double thisRadius = this.getRadius();

        // - Compare
        if (thisRadius > circleRadius) {
            compared = 1;
        } else if (thisRadius == circleRadius) {
            compared = 0;
        } else if (thisRadius < circleRadius) {
            compared = -1;
        }

        // - Return
        return compared;
    }

    public void printCircle() {
        System.out.println("The circle is created " +
                getDateCreated() + " and the radius is " + radius);
    }
}
