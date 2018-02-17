package com.company;

import java.util.Scanner;
import java.util.Random;

public class SixSeventeen {
    public static void main(String[] args) {
        // ----- 6.17 -----
        // Prompt User
        Scanner getN = new Scanner(System.in);
        System.out.println("Please enter a single integer:");

        int n = getN.nextInt();

        // Create Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n); j++) {
                System.out.print(getMatrix());
            }

            System.out.println("");
        }
    }

    public static int getMatrix() {
        Random r = new Random();
        return r.nextInt((1 - 0) + 1) + 0;
    }


}
