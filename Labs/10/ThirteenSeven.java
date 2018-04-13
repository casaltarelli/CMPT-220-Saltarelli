package com.company;

import java.util.ArrayList;

public class ThirteenSeven extends GeometricObject implements Colorable {
    // ----- Question 13.7 -----
    /* This class is supposed to be called "Square" however I called it
    "ThirteenSeven" so I can keep track of the problem I am working on" */
    // ----- Global Methods
    private double side;

    public static void main(String[] args) {
        // -- Create List of Instances of GeometricObject
        ArrayList<GeometricObject> objects = new ArrayList<>();

        // -- Populate
        ThirteenSeven objectI = new ThirteenSeven();
        objects.add(objectI);

        ThirteenSeven objectII = new ThirteenSeven(10);
        objects.add(objectII);

        ThirteenSeven objectIII = new ThirteenSeven(20);
        objects.add(objectIII);

        ThirteenSeven objectIV = new ThirteenSeven(30);
        objects.add(objectIV);

        ThirteenSeven objectV = new ThirteenSeven(43);
        objects.add(objectV);

        // -- Output
        System.out.print("Object I: Area = " + objectI.getArea() + ", How to color? ");
        objectI.howToColor();

        System.out.println();

        System.out.print("Object II: Area = " + objectII.getArea() + ", How to color? ");
        objectII.howToColor();

        System.out.println();

        System.out.print("Object I: Area = " + objectIII.getArea() + ", How to color? ");
        objectIII.howToColor();

        System.out.println();

        System.out.print("Object I: Area = " + objectIV.getArea() + ", How to color? ");
        objectIV.howToColor();

        System.out.println();

        System.out.print("Object I: Area = " + objectV.getArea() + ", How to color? ");
        objectV.howToColor();
    }

    // ----- Methods
    public ThirteenSeven() {
        this.side = 0;
    }

    public ThirteenSeven(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.print("Color all four sides.");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }
}
