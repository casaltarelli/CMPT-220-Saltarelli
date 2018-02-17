package com.company;

import java.util.Scanner;

public class SevenNine {
    public static void main(String[] args) {
        // ----- Question 7.9 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            double num = getNums.nextDouble();
            numbers[i] = num;
        }

        // -- Get Min
        double min = min(numbers);

        // -- Output to User
        System.out.println("The minimum number is " + min);
    }

    public static double min(double[] array) {
        // -- Find Min
        double min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (min == 0) {
                min = array[i];
            }
        }

        // - Return
        return min;

    }
}
