//package com.company;

import java.util.Scanner;

public class TwelveThree {
    // ----- Question 12.3 -----

    public static void main(String[] args) {
        // -- Create & Populate Array
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            int num = (int)(Math.random() * 10);
            numbers[i] = num;
        }

        // -- Get Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter what index you would like to see (0-100)");

        int index = input.nextInt();

        if (index > numbers.length) {
            System.out.print("Please enter a valid index");
        } else {
            System.out.print("The value at index " + index + " is " + numbers[index]);
        }
    }
}
