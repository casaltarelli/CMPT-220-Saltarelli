//package com.company;

import java.util.Scanner;

public class EightFive {
    public static void main(String[] args) {
        // ----- Question 8.5 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Enter Matrix 1: ");

        // -- Load Matrix I
        double[][] matrixI = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < 3) {
                    double num = getNums.nextDouble();
                    matrixI[i][j] = num;
                }
            }
        }

        // -- Load Matrix II
        System.out.println("Enter Matrix 2: ");

        double[][] matrixII = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < 3) {
                    double num = getNums.nextDouble();
                    matrixII[i][j] = num;
                }
            }
        }

        // -- Get Sum
        double[][] matrixSum = addMatrix(matrixI, matrixII);

        // - Output
        System.out.println("");
        System.out.println("The matrices are added as follows: ");
        System.out.println("");

        for (int i = 0; i < matrixI.length; i++) {
            for(int j = 0; j < matrixI.length; j++) {
                System.out.print(matrixI[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("     +");

        for (int i = 0; i < matrixII.length; i++) {
            for(int j = 0; j < matrixII.length; j++) {
                System.out.print(matrixII[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("     =");

        for (int i = 0; i < matrixSum.length; i++) {
            for(int j = 0; j < matrixSum.length; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
         double[][] matrixSum = new double[3][3];

         // -- Create Sum Matrix
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                double sum = a[i][j] + b[i][j];
                matrixSum[i][j] = sum;
             }
         }

         // -- Return
         return matrixSum;
    }
}
