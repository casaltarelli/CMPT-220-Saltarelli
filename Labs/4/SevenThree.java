//package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class SevenThree {
    public static void main(String[] args) {
        // ----- Question 7.3 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter integers between 1 and 100:");

        // -- Load Array Accordingly
        int[] numbers = new int[10];
        boolean gettingNums = true;
        int count = 0;

        while (gettingNums) {
            if (count < (numbers.length - 1)) {
                numbers[count] = getNums.nextInt();

                if (numbers[count] == 0) {
                    gettingNums = false;
                }

            } else {
                // - Create Bigger Array
                int[] temp = new int[numbers.length * 2];

                // - Load Original Values
                for (int i = 0; i < numbers.length; i++) {
                    temp[i] = numbers[i];
                }

                numbers = temp;
            }

            count++;
        }

        // -- Find out Occurrences
        for (int i = 0; i < numbers.length; i++) {
            int occurences = 0;

            // Skip if last element
            if (numbers[i] == 0) {
                continue;
            }

            // - Find Occurrences
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    occurences++;
                }
            }

            // - Output Accordingly
            if (occurences == 1) { // JA: You should not output the same number more than once
                System.out.println(numbers[i] + " occurs " + occurences + " time");
            } else if (occurences > 1) {
                System.out.println(numbers[i] + " occurs " + occurences + " times");
            }
        }
    }
}
