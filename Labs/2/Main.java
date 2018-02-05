//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // ----- Question 3.2 -----
        // -- Get Random Numbers
        int numI = (int)(System.currentTimeMillis() % 10);
        int numII = (int)(System.currentTimeMillis() / 10 % 10);
        int numIII = (int)(System.currentTimeMillis() / 15 % 10);

        int sum = numI + numII + numIII;
        System.out.println(sum);

        // -- Prompt user for sum of numbers generated
        Scanner input = new Scanner(System.in);
        System.out.println("What is the sum of " + numI + " + " + numII + " + " + numIII + " ?");

        String submit = (input.next());
        int answer = Integer.parseInt(submit);

        if (answer == sum) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
    }
}
