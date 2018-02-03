package com.company;

import java.util.Scanner;

public class TwoOne {
    public static void main(String[] args) {
        // ----- Question 2.1 -----
        // -- Ask user for degree
        Scanner getCelsius  = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");

        int celsius = getCelsius.nextInt();

        // -- Convert
        double fahrenheit = ((9.0 / 5.0) * celsius) + 32;

        // -- Return to user
        System.out.println(celsius + " in degrees fahrenheit is equal to: "
                + fahrenheit + " degrees fahrenheit.");
    }
}
