package com.company;

public class TwelveFive {
    // ----- Question 12.5 -----
    /* This class is supposed to be called "Triangle" however I called it
    "TwelveFive" so I can keep track of the problem I am working on" */

    // ----- Global Variables
    private double sideI = 1.0;
    private double sideII = 1.0;
    private double sideIII = 1.0;

    public static void main(String[] args) {
        // Valid Instance
        try {
            TwelveFive instanceI = new TwelveFive(2, 2, 8);

        } catch(IllegalTriangleException e) {
            System.out.println(e.getMessage());

        }
    }

    // ----- Methods
    public TwelveFive() {
        // super(); Commented due to making this class not extend GeometricObject
        this.sideI = sideI;
        this.sideII = sideII;
        this.sideIII = sideIII;
    }

    public TwelveFive(double sideI, double sideII, double sideIII) throws IllegalTriangleException {
        // super(); Commented due to making this class not extend GeometricObject

        // -- Check if Valid Triangle
        if (((sideI + sideII) > sideIII) && ((sideI + sideIII) > sideII) &&
                ((sideII + sideIII) > sideI)) {
            this.sideI = sideI;
            this.sideII = sideII;
            this.sideIII = sideIII;
        } else {
            throw new IllegalTriangleException("Triangle is Invalid");
        }
    }

    // -- Accessor Methods
    public double getSideI() {
        return sideI;
    }

    public double getSideII() {
        return sideII;
    }

    public double getSideIII() {
        return sideIII;
    }

    public double getArea() {
        double s = (sideI + sideII + sideIII) / 2;

        // - Calculate
        double area = Math.sqrt(s * (s - sideI) * (s - sideII) * (s - sideIII));

        // - Return
        return area;
    }

    public double getPerimeter() {
        // - Calculate
        double perimeter = sideI + sideII + sideIII;

        // - Return
        return perimeter;
    }

    public String toString() {
        return "Triangle: side 1 = " + sideI + " side 2 = " + sideII +
                " side 3 = " + sideIII;
    }
}
