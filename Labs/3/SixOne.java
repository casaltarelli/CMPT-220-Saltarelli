//package com.company;

import java.util.Scanner;

public class SixOne {
    public static void main(String[] args) {
        // ----- Question 6.1 -----
        // -- Prompt User
        Scanner getNum = new Scanner(System.in);
        System.out.println("Please enter an number:");

        int num = getNum.nextInt();

        // -- Get Pentagonal Number
        int pentNum = getPentagonalNumber(num);

        System.out.println("The Pentagonal Number for " + num + " is: " + pentNum);

    }

    public static int getPentagonalNumber(int n) {
        return (n * (((3 * n)) - 1))/2;
    }
}
