package com.company;

public class ThirteenEleven extends GeometricObject implements Comparable, Cloneable{
    // ----- Question 13.11 -----
    /* This class is supposed to be called "Octagon" however I called it
    "ThirteenEleven" so I can keep track of the problem I am working on" */
    // ----- Global Variables
    private double side;

    public static void main(String[] args) throws CloneNotSupportedException {
        // - Instance
        ThirteenEleven instance = new ThirteenEleven(5);

        // - Calculate Perimeter & Area
        double perimeter = instance.getPerimeter();

        double area = instance.getArea();

        System.out.println("Area: " + area + ", Perimeter: " + perimeter);

        // - Clone
        Object instanceII = new Object();

        try {
            instanceII = instance.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // - Compare
        int compare = instance.compareTo(instanceII);
        System.out.println("Compare Results: " + compare);
    }

    // ----- Methods
    public ThirteenEleven() {
        this.side = 0;
    }

    public ThirteenEleven(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        // - Calculate Area
        double area = (2 + (4/Math.sqrt(2))) * this.side * this.side;

        // - Return
        return area;
    }

    public double getPerimeter() {
        // - Calculate Perimeter
        double perimeter = this.side * 8;

        // - Return
        return perimeter;
    }

    @Override
    public int compareTo(Object o) {
        // -1 = Less than, 0 = Equal to, 1 = Grater than
        int compared = 0;

        // - Cast & get Area
        ThirteenEleven octaganObject = (ThirteenEleven) (o);
        double octagonArea = octaganObject.getArea();
        double thisArea = this.getArea();

        if (thisArea < octagonArea) {
            compared = -1;
        } else if (thisArea == octagonArea) {
            compared = 0;
        } else if (thisArea > octagonArea) {
            compared = 1;
        }

        return compared;
    }
}
