//package com.company;

public class TenEleven {
    // ----- Question 10.11 -----
    /* I know the class is supposed to be called "Circle2D" I called it
    "TenEleven" just so that I could keep track of what problem I am doing */
    // ----- Global Variables
    private double x;
    private double y;
    private double radius;

    public static void main(String[] args) {
        // - Instance C1
        TenEleven c1 = new TenEleven();
        c1.circle(2, 2, 5.5);
        double area = c1.getArea();
        double perimeter = c1.getPerimeter();

        boolean contain = c1.contains(3,3);


        TenEleven c2 = new TenEleven();
        c2.circle(4,5,10.5);
        boolean containII = c1.contains(c2);

        TenEleven c3 = new TenEleven();
        c3.circle(3,5,2.3);
        boolean containIII = c1.overlaps(c3);


        System.out.println("Perimeter: " + perimeter + ", Area: " + area);
        System.out.println("Contain Test I: " + contain);
        System.out.println("Contain Test II: " + containII);
        System.out.println("Contain Test III: " + containIII);
    }

    // ----- Methods
    public void circle() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public void circle(double xValue, double yValue, double rValue) {
        x = xValue;
        y = yValue;
        radius = rValue;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        // - Calculate
        double area = Math.PI * Math.pow(radius, 2);

        // - Return
        return area;
    }

    public double getPerimeter() {
        // - Perimeter
        double perimeter = 2 * Math.PI * radius;

        // - Return
        return perimeter;
    }

    public boolean contains(double xP, double yP) {
        boolean contain = false;

        // - Find Distance Between Points
        double distance = Math.sqrt(Math.pow((xP - this.x), 2) + Math.pow((yP - this.y), 2));

        // - Check
        if (distance < (this.radius - distance)) {
            contain = true;
        }

        // - Return
        return contain;
    }

    public boolean contains(TenEleven circle) {
        boolean contain = false;

        // - Find Distance Between Points
        double distance = Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));

        // - Check
        if (distance < this.radius && circle.radius < (this.radius - distance)) {
            contain = true;
        }

        // - Return
        return contain;
    }

    public boolean overlaps(TenEleven circle) {
        boolean contain = false;

        // - Find Distance Between Points
        double distance = Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));

        // - Check
        if (distance < this.radius) {
            contain = true;
        }

        // - Return
        return contain;
    }
}
