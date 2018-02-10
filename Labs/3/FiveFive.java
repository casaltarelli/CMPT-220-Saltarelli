package com.company;

import java.util.Scanner;

public class FiveFive {
    public static void main(String[] args) {
        // ----- Question 5.5 -----
        // -- Set Up Table
        double kilos = 1;
        double pounds = 20;

        // 73 '-'
        System.out.println("-------------------------------------------------------------------------");
        //| Kilograms (5 spaces)| Pounds (8 Spaces| | (5 spaces)| Pounds (8 spaces)| Kilograms (5 spaces)|
        System.out.println("| Kilograms     | Pounds        | |     | Pounds        | Kilograms     |");
        for (int i = 0; i < 100; i++) {
            // - Seperator
            System.out.println("-------------------------------------------------------------------------");
            double convertedKilo = convertToPounds(kilos);
            double convertedPounds = convertToKilo(pounds);

            // - Adjust According to Pounds
            if (pounds < 45) {
                System.out.printf("| %.2f          | %.2f          | |     | %.2f         | %.2f         ",
                        kilos, convertedKilo, pounds, convertedPounds);
            } else if (pounds > 35 && pounds < 50) {
                System.out.printf("| %.2f         | %.2f          | |     | %.2f         | %.2f         ",
                        kilos, convertedKilo, pounds, convertedPounds);
            } else if (pounds > 45 && pounds < 75) {
                System.out.printf("| %.2f         | %.2f          | |     | %.2f         | %.2f        ",
                        kilos, convertedKilo, pounds, convertedPounds);
            } else if (pounds > 70 && pounds < 100) {
                System.out.printf("| %.2f         | %.2f         | |     | %.2f         | %.2f        ",
                        kilos, convertedKilo, pounds, convertedPounds);
            } else if (pounds > 95 && pounds < 270) {
                System.out.printf("| %.2f         | %.2f         | |     | %.2f        | %.2f        ",
                        kilos, convertedKilo, pounds, convertedPounds);
            } else if (pounds > 265 && pounds < 455) {
                System.out.printf("| %.2f        | %.2f         | |     | %.2f        | %.2f        ",
                        kilos, convertedKilo, pounds, convertedPounds);
            } else if (pounds > 450) {
                System.out.printf("| %.2f        | %.2f         | |     | %.2f        | %.2f       ",
                        kilos, convertedKilo, pounds, convertedPounds);
            }

            System.out.println("|");

            kilos = kilos + 2;
            pounds = pounds + 5;

        }

        // - Bottom of Table
        System.out.println("-------------------------------------------------------------------------");
    }

    public static double convertToPounds(double weight) {
        double conversion = 1.0/2.2;

        weight = weight * conversion;
        return weight;
    }

    public static double convertToKilo(double weight) {
        double conversion = 0.45359237;

        weight = weight / conversion;
        return weight;
    }
}
