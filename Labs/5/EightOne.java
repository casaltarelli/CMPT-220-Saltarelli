//package com.company;

import java.util.Scanner;

public class EightOne {
    public static void main(String[] args) {
        // ----- Question 8.1 -----
        // -- Prompt User
        Scanner getMatrix = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row");

        // -- Load Matrix
        double[][] matrix = new double[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 4; j++){
                double num = getMatrix.nextDouble();
                matrix[i][j] = num;
            }
        }

        // -- Get Sums
        double colSum = sumColumn(matrix, 0);
        double colSumII = sumColumn(matrix, 1);
        double colSumIII = sumColumn(matrix, 2);

        // -- Output
        System.out.println("Sum of elements at column 1 is " + colSum);
        System.out.println("Sum of elements at column 2 is " + colSumII);
        System.out.println("Sum of elements at column 3 is " + colSumIII);
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        // -- Get Sum
        for (int i = 0; i < m[columnIndex].length; i++) {
            sum = sum + m[columnIndex][i];
        }

        // -- Return
        return sum;
    }
}
