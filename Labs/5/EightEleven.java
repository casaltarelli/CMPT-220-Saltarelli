//package com.company;

import java.util.Scanner;

public class EightEleven {
    public static void main(String[] args) {
        // ----- Question 8.11 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");

        int num = input.nextInt();

        // -- Break into Binary
        String binary = Integer.toBinaryString(num);

        // -- Get Matrix
        String[][] matrix = getMatrix(binary);

        // -- Output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static String[][] getMatrix(String binary) {
        String[][] matrix = new String[3][3];
        int count = 0;

        // -- Create Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (count > (binary.length() - 1)) {
                    matrix[i][j] = "H";
                    count++;
                } else if (binary.charAt(count) == '0') {
                    matrix[i][j] = "H";
                    count++;
                } else if (binary.charAt(count) == '1') {
                    matrix[i][j] = "T";
                    count++;
                }
            }
        }

        // -- Return
        return matrix;
    }

}
