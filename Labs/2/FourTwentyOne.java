package com.company;

import java.util.Scanner;

public class FourTwentyOne {
    public static void main(String[] args) {
        // ----- Question 4.21 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a social security number (Format: ###-##-#### Please put your own dashes");

        String social = input.next();

        // -- Check
        boolean notValid = false;
        String[] alphabet = new String[]{"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L",
        "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"};

        // - Check if there are any letters
        for (int i = 0; i < alphabet.length; i++) {
            if (social.contains(alphabet[i])) {
                notValid = true;
            }
        }

        // - Check for Three Dashes
        if (social.contains("-")) {
            notValid = false;
        } else {
            notValid = true;
        }

        // -- Output to User
        if (notValid) {
            System.out.println("Please enter a valid social security number");
        } else {
            System.out.println("The social security number: " + social + " is valid.");
        }
    }
}
