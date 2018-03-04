//package com.company;

import java.util.Scanner;

public class NineEleven {
    // ----- Question 9.11 -----
    /* I know the class is supposed to be called "LinearEquation" I called it
    "NineEleven" just so that I could keep track of what problem I am doing */

    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;
    private double e = 0;
    private double f = 0;

    public static void main(String[] args) {
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter values for the following variables (a, b, c, d, e, f)");

        // - Collect Input
        double a = getNums.nextDouble();
        double b = getNums.nextDouble();
        double c = getNums.nextDouble();
        double d = getNums.nextDouble();
        double e = getNums.nextDouble();
        double f = getNums.nextDouble();

        // - Upload Values
        NineEleven testCase = new NineEleven();

        testCase.uploadValues(a, b, c, d, e, f);

        // - Check If Solvable & Output
        boolean solvable = testCase.isSolvable();

        System.out.println("");
        if (solvable) {
            double x = testCase.getX();
            double y = testCase.getY();

            System.out.println("X = " + x + ", Y = " + y);

        } else {
            System.out.println("The equation has no solution");
        }
    }

    public void uploadValues(double aNum, double bNum, double cNum, double dNum, double eNum, double fNum) {
        a = aNum;
        b = bNum;
        c = cNum;
        d = dNum;
        e = eNum;
        f = fNum;
    }

    // - Get Methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // - Getter Methods for X & Y
    public double getX() {
        // - Get Values
        double a = getA();
        double b = getB();
        double c = getC();
        double d = getD();
        double e = getE();
        double f = getF();

        // - Calculate
        double numerator = (e * d) - (b * f);
        double denominator = (a * d) - (b * c);

        double x = numerator / denominator;

        // - Return
        return x;

    }

    public double getY() {
        // - Get Values
        double a = getA();
        double b = getB();
        double c = getC();
        double d = getD();
        double e = getE();
        double f = getF();

        // - Calculate
        double numerator = (a * f) - (e * c);
        double denominator = (a * d) - (b * c);

        double y = numerator / denominator;

        // - Return
        return y;
    }

    // -- Check if Solvable
    public boolean isSolvable() {
        boolean solvable = true;

        // - Get Values
        double a = getA();
        double b = getB();
        double c = getC();
        double d = getD();

        // - Check if Solvable
        double check = (a * d) - (b * c);

        if (check != 0) {
            solvable = true;
        }

        // - Return
        return solvable;
    }
}
