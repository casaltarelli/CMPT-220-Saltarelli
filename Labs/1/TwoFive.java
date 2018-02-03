package com.company;

import java.util.Scanner;

public class TwoFive {
    public static void main(String[] args) {
        // ----- Question 2.5 -----
        // -- Ask user for the subtotal and gratuity rate
        Scanner getSG = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");

        int subtotal = getSG.nextInt();
        double gratuityRate = (getSG.nextInt()) / 10.0;

        // -- Calculate tip and total
        double tip = subtotal * gratuityRate;
        double total = subtotal + tip;

        System.out.println("Your tip will be " + tip + " and you total comes out to "
                + total);
    }
}
