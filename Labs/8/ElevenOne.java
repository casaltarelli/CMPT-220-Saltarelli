//package com.company;

import java.util.Scanner;

public class ElevenOne extends GeometricObject {
    // ----- Question 11.1 -----
    /* This class is supposed to be called "Triangle" however I called it
    "ElevenOne" so I can keep track of the problem I am working on" */

    // ----- Global Variables
    private double sideI = 1.0;
    private double sideII = 1.0;
    private double sideIII = 1.0;

    public static void main(String[] args) {
        // -- Test Case
        // - Collect Data
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Three Sides of a Triangle: ");

        double sideI = input.nextDouble();
        double sideII = input.nextDouble();
        double sideIII = input.nextDouble();

        System.out.print("Please enter if you would like the triangle to be filled (True/False): ");

        String sFilled = input.next();
        boolean filled;

        if (sFilled == "True" || sFilled == "true") {
            filled = true;
        } else {
            filled = false;
        }

        System.out.print("Please enter what color you would like the Triangle to be: ");
        String color = input.next();

        // - Create Instance
        ElevenOne Instance = new ElevenOne(sideI, sideII, sideIII, color, filled);

        // -- Output
        System.out.println(Instance.toString());
        System.out.println("Area: " + Instance.getArea() + ", Perimeter: " + Instance.getPerimeter() +
                ", Filled: " + filled + ", Color: " + color);

    }

    // ----- Methods
    public ElevenOne() {
        super();
        this.sideI = sideI;
        this.sideII = sideII;
        this.sideIII = sideIII;
    }

    public ElevenOne(double sideI, double sideII, double sideIII, String color, boolean filled) {
        super(color, filled);
        this.sideI = sideI;
        this.sideII = sideII;
        this.sideIII = sideIII;
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
