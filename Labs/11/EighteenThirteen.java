package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EighteenThirteen {
    // ----- Question 18.13 -----
    public static void main(String[] args) {
        // -- Input
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Eight Integers: ");

        int[] numbers = new int[8];
        for (int i = 0; i < 8; i++) {
            int num = input.nextInt();
            numbers[i] = num;
        }

        // -- Get Largest Value
        int largest = largestNum(numbers);

        // -- Output
        System.out.println("For the Array " + Arrays.toString(numbers) + " is " + largest);
    }

    // ----- Methods
    public static int largestNum(int[] numbers) {
        return largestNum(numbers, 0);
    }

    public static int largestNum(int[] numbers, int largest) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                return largestNum(numbers, largest);
            }
        }

        return largest;
    }
}
