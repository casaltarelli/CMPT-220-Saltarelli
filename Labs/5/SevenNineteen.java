package com.company;

import java.util.Scanner;

public class SevenNineteen {
    public static void main(String[] args) {
        // ----- Question 7.19 -----
        // -- Prompt User
        // - Length
        Scanner getNums = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");

        int length = getNums.nextInt();
        int[] numbers = new int[length];

        // - Contents
        System.out.println("Enter the contents of the list: ");

        for (int i = 0; i < numbers.length; i++) {
            int num =  getNums.nextInt();
            numbers[i] = num;
        }

        // -- Find if Sorted
        boolean sorted = isSorted(numbers);

        // -- Output
        if (sorted) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        boolean sorted = true;

        // -- Check
        for (int i = 0; i < list.length; i++) {
            if (i == (list.length - 1)) {
                if (list[i] < list[0]) {
                    sorted = false;
                }
            } else if (list[i] > list[i+1]) {
                sorted = false;
            }
        }

        // -- Return
        return sorted;
    }
}
