package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class SevenFive {
    public static void main(String[] args) {
        // ----- Question 7.5 -----
        // -- Prompt User
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter 10 integers:");

        int[] nums = new int[10];
        int distinctNums = 0;

        // -- Find Distinct Numbers
        for (int i = 0; i < nums.length; i++) {
            int num = getNums.nextInt();
            boolean distinct = true;

            for (int j = 0; j < nums.length; j++) {
                if (num == nums[j]) {
                    distinct = false;
                }
            }

            if (distinct) {
                nums[i] = num;
                distinctNums++;
            } else {
                continue;
            }
        }

        // -- Output to User
        System.out.println("The number of distinct numbers is " + distinctNums);
        System.out.println("The distinct numbers are:" + (Arrays.toString(nums)));
    }
}
