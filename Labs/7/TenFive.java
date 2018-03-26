//package com.company;

import java.util.Scanner;
import java.util.Stack;

public class TenFive {
    // ----- Question 10.5 -----
    // ----- Global Variables
    public static void main(String[] args) {
        // - Input
        Scanner getNum = new Scanner(System.in);
        System.out.println("Please enter an integer:");

        int num = getNum.nextInt();

        // - Get Factors
        int[] factors = getFactors(num);

        Stack st = new Stack();

        // Reorder Factors In Decreasing Order
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != 0) {
                st.push(factors[i]);
            }
        }

        // - Output
        System.out.println("Factors: " + st);
    }

    // ----- Methods
    public static int[] getFactors(int n) { // JA: This is not finding the factors
        int[] factors = new int[20];

        // - Get Factors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                factors[i] = i;
            }
        }

        // - Return
        return factors;
    }
}