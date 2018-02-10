package com.company;

import java.util.Scanner;

public class FiveSixteen {
    public static void main(String[] args) {
        // ----- Question 5.16 -----
        // -- Prompt User
        Scanner getNum = new Scanner(System.in);
        System.out.println("Please enter an integer: ");

        int num = getNum.nextInt();

        // -- Find Factors
        int[] factors = new int[10];
        int count = 0;
        boolean finding = true;


        while(finding) {
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    int product = i * j;

                    if (i > num) {
                        finding = false;
                    } else if (count < factors.length) {
                        if (product == num) {
                            factors[count] = i;
                            count++;
                        }
                    } else {
                        // - Create Bigger Array
                        int[] temp = new int[factors.length * 2];

                        // - Load Original Values
                        for (int k = 0; k < factors.length; k++) {
                            temp[i] = factors[i];
                        }

                        factors = temp;
                    }
                }
            }
        }

        // -- Output Factors
        System.out.println("The factors of " + num + " are:");
        for (int f = 0; f < factors.length; f++) {
            if (factors[f] == 0) {
                continue;
            } else {
                System.out.println(factors[f]);
            }
        }
    }
}
