package com.company;

import java.util.Scanner;

public class SevenEleven {
    public static void main(String[] args) {
        // ----- Question 7.11 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");

        double[] numbers = new double[10];

        // -- Load Array
        for (int i = 0; i < numbers.length; i++) {
            double num = getNums.nextDouble();
            numbers[i] = num;
        }

        // -- Get Mean
        double mean = mean(numbers);

        // -- Get Deviation
        double deviation = deviation(numbers);

        // -- Output to User
        System.out.println("The mean is " + mean);
        System.out.printf("The Standard Deviation is %.5f", deviation);

    }

    public static double mean(double[] x) {
        // - Get sum
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }

        // - Get mean
        double mean = sum / x.length;

        // - Return
        return mean;

    }

    public static double deviation(double[] x) {
        double[] deviatedNums = new double[10];

        // - Get the Mean
        double mean = mean(x);

        // - Subtract Mean from Each Value
        for (int i = 0; i < deviatedNums.length; i++) {
            double subtractedNum = x[i] - mean;
            deviatedNums[i] = subtractedNum;
        }

        // - Square Each Value
        for (int p = 0; p < deviatedNums.length; p++) {
            double sqNum = deviatedNums[p] * deviatedNums[p];
            deviatedNums[p] = sqNum;
        }

        // - Get Sum of Squares
        double sum = 0;

        for(int j = 0; j < deviatedNums.length; j++) {
            sum = sum + deviatedNums[j];
        }

        // - Get Deviation
        double deviation = Math.sqrt((sum / (deviatedNums.length - 1)));

        // - Return
        return deviation;


    }

}
