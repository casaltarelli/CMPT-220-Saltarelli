package com.company;

import java.util.Scanner;

public class SixNineteen {
    public static void main(String[] args) {
        // ----- Question 6.19 -----
        // -- Prompt User
        Scanner getSides = new Scanner(System.in);
        System.out.print("Please enter three sides to a triangle (Side 1, Side 2, Side 3)");

        double sideI = getSides.nextDouble();
        double sideII = getSides.nextDouble();
        double sideIII = getSides.nextDouble();

        // -- Test if Valid
        boolean isTV = isValid(sideI, sideII, sideIII);

        if (isTV) {
            double area = area(sideI, sideII, sideIII);
            System.out.printf("The area of the triangle you entered is %.2f", area);
        } else {
            System.out.println("You entered an invalid triangle, please try again.");
        }


    }

    public static boolean isValid(double sideI, double sideII, double sideIII) {
        boolean isValid = false;
        double twoSidedSum = sideI + sideII;


        // - Test
        if (twoSidedSum > sideIII) {
            isValid = true;
        }

        return isValid;
    }

    public static double area(double sideI, double sideII, double sideIII) {
        // - Calculate
        double s = (sideI + sideII + sideIII)/2;
        double area = Math.sqrt(s * (s - sideI) * (s - sideII) * (s - sideIII));

        return area;
    }
}
