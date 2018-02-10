package com.company;

import java.util.Scanner;

public class FiveOne {
    public static void main(String[] args) {
        // ----- Question 5.1 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0:");

        // -- Load Array Accordingly
        double[] numbers = new double[10];
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
                double[] temp = new double[numbers.length * 2];

                // - Load Original Values
                for (int i = 0; i < numbers.length; i++) {
                    temp[i] = numbers[i];
                }

                numbers = temp;
            }

            count++;
        }

        // -- Get Info
        double posNums = 0;
        double negNums = 0;
        double sum = 0;
        double length = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                if (numbers[1] > 0) {
                    posNums++;
                } else if (numbers[i] < 0) {
                    negNums++;
                }

                sum = sum + numbers[i];
                length++;
            }
        }

        double avg = sum/length;

        // -- Output to User
        System.out.println("The number of positives is: " + posNums);
        System.out.println("The number of negatives is: " + negNums);
        System.out.println("The total is: " + sum);
        System.out.println("The average is: " + avg);

    }
}
