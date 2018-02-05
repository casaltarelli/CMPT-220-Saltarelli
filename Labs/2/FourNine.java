//package com.company;

import java.util.Scanner;

public class FourNine {
    public static void main(String[] args) {
        // ----- Question 4.9 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any letter");

        String letter = input.next();

        // -- Convert Input to Unicode
        int unicode = Integer.valueOf(letter.charAt(0));

        // -- Output to User
        System.out.print("The unicode of " + letter + " is " + unicode);


    }
}
