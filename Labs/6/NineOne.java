//package com.company;

public class NineOne {
    // ----- Question 9.1 -----
    /* I know the class is supposed to be called "Rectangle" I called it
    "NineOne" just so that I could keep track of what problem I am doing */

    double width = 1;
    double height = 1;

    public static void main(String[] args) {
        // -- Test Cases
        // - First Case
        NineOne firstCase = new NineOne();

        firstCase.rectangle(4, 40);
        double widthI = firstCase.width;
        double heightI = firstCase.height;
        double areaI = firstCase.getArea();
        double perimeterI = firstCase.getPerimeter();

        System.out.println("Case 1: ");
        System.out.println("Width: " + widthI + ", Height: " + heightI + ", Area: " + areaI + ", Perimeter: " + perimeterI);

        // - Second Case
        NineOne secondCase = new NineOne();

        secondCase.rectangle(3.5, 35.9);
        double widthII = secondCase.width;
        double heightII = secondCase.height;
        double areaII = secondCase.getArea();
        double perimeterII = secondCase.getPerimeter();

        System.out.println("Case 2: ");
        System.out.println("Width: " + widthII + ", Height: " + heightII + ", Area: " + areaII + ", Perimeter: " + perimeterII);



    }

    public void rectangle() {
        // -- Creates Rectangle Object
    }

    public void rectangle(double w, double h) {
        // -- Creates Rectangle Object
        width = w;
        height = h;
    }

    public double getArea() {
        // -- Calculate Area
        double area = width * height;

        // -- Return
        return area;
    }

    public double getPerimeter() {
        // -- Calculate Perimeter
        double fullWidth = width + width;
        double fullHeight = height + height;

        double perimeter = fullWidth + fullHeight;

        // -- Return
        return perimeter;
    }
}
