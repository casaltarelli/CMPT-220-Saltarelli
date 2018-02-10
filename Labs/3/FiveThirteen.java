package com.company;

import java.util.Scanner;

public class FiveThirteen {
    public static void main(String[] args) {
        // ----- Question 5.13 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");

        int n = input.nextInt();
        boolean searching = true;

        // -- Look for Biggest Int
        while (searching) {
            int nCubed = n * n * n;

            // - Check
            if (nCubed < 12000) {
                n = n + 1;
            } else if (nCubed > 12000 && n < 23) {
                n--;
                searching = false;
                System.out.println("The largest integer is " + n);
            } else if (n > 23) {
                System.out.println("The integer " + n + " is too big. Please enter a smaller number");
                searching = false;
            }
        }
    }
}
