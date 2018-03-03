package com.company;

import java.util.Scanner;

public class NineThirteen {
    // ----- Question 9.13 -----
    /* I know the class is supposed to be called "Location" I called it
    "NineThirteen" just so that I could keep track of what problem I am doing */

    public int row = 0;
    public int column = 0;
    public double maxValue = 0;

    public static void main(String[] args) {
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");

        int row = getNums.nextInt();
        int column = getNums.nextInt();

        // - Create Matrix
        double[][] matrix = new double[row][column];

        // - Get Values & Load Array
        System.out.println("Enter the Array: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                double num = getNums.nextDouble();
                matrix[i][j] = num;
            }
        }

        // -- Locate Largest
        NineThirteen testCase = locateLargest(matrix);

        // -- Output Results
        System.out.println("The location of the largest element is " + testCase.maxValue +
                " at (" + testCase.row + "," + testCase.column + ")");
    }

    public static NineThirteen locateLargest(double[][] a) {
        // - Create Instance
        NineThirteen testCase = new NineThirteen();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > testCase.maxValue) {
                    testCase.maxValue = a[i][j];
                    testCase.row = i;
                    testCase.column = j;
                }
            }
        }

        return testCase;
    }
}
