//package com.company;

import java.util.Scanner;

public class SevenFifteen {
    public static void main(String[] args) {
        // ----- Question 7.15 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter 10 integers:");

        int[] numbers = new int[10];

        // -- Load Array
        for (int i = 0; i < numbers.length; i++) {
            int num = getNums.nextInt();
            numbers[i] = num;
        }

        // -- Eliminate Duplicates
        int[] elimNums = eliminateDuplicates(numbers);

        // -- Output to User
        String output = "";

        for(int i = 0; i < elimNums.length; i++) {
            if (elimNums[i] == 0) {
                continue;
            } else {
                output = output + " " + Integer.toString(elimNums[i]);
            }
        }
        System.out.println("The distinct numbers are:" + output);

    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] newList = new int[list.length];

        // -- Check
        for (int i = 0; i < list.length; i++) {
            int count = 0;

            // -- Compare to All Other Values
            for (int j = i + 1; j < list.length; j++) { // JA
                if (list[i] == list[j]) {
                    count++;
                }
            }

            // -- Check if Number Appears More Than Once
            if (count > 1) {
                continue;
            } else {
                newList[i] = list[i];
            }
        }

        // -- Return
        return newList;
    }
}
