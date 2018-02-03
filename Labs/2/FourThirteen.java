package com.company;

import java.util.Scanner;

public class FourThirteen {
    public static void main(String[] args) {
        // ----- Question 4.13 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");

        String inputLetter = input.next();

        // -- Check if Vowel or Constant
        boolean notValid = true;
        String[] vowels = new String[]{"A", "E", "I", "O", "U", "I"};
        String[] constants = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "X", "Z", "W", "Y"};

        String letter = inputLetter.toUpperCase();

        for (int i = 0; i < vowels.length; i++) {
            if (letter.equals(vowels[i])) {
                System.out.println("The letter " + letter + " is a vowel.");
                notValid = false;
            }
        }

        for (int j = 0; j < constants.length; j++) {
            if (letter.equals(constants[j])) {
                System.out.println("The letter " + letter + " is a constant.");
                notValid = false;
            }
        }

        if (notValid) {
            System.out.println("Please enter a valid number.");
        }

    }
}
