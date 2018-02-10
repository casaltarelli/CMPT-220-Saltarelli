package com.company;

import java.util.Scanner;

public class SixFive {
    public static void main(String[] args) {
        // ----- Question 6.5 -----
        // -- Prompt User
        Scanner getNum = new Scanner(System.in);
        System.out.println("Please enter three single digit numbers separated by a space:");

        // -- Get Sorted Numbers
        double numI = getNum.nextDouble();
        double numII = getNum.nextDouble();
        double numIII = getNum.nextDouble();

        double[] sortedNumbers = displaySortedNumbers(numI, numII, numIII);

        // -- Output to User
        System.out.println("The sorted numbers are as follows (Smallest - Largest)");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }

    public static double[] displaySortedNumbers(double numI, double numII, double numIII) {
        double[] sortedNums = new double[3];

        boolean sorting = true;

        // -- Put Numbers into List
        sortedNums[0] = numI;
        sortedNums[1] = numII;
        sortedNums[2] = numIII;

        // -- Sort Numbers
        for (int i = 0; i < sortedNums.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < sortedNums.length; j++)
                if (sortedNums[j] < sortedNums[index])
                    index = j;

            double smallerNumber = sortedNums[index];
            sortedNums[index] = sortedNums[i];
            sortedNums[i] = smallerNumber;
        }

        // -- Return
        return sortedNums;
    }
}
