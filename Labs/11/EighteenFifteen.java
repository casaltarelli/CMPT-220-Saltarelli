//package com.company;

import java.util.Scanner;

public class EighteenFifteen {
    // ----- Question 18.15 -----
    public static void main(String[] args) {
        // -- Input
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a String of Text: ");
        String str = input.nextLine();

        System.out.println("Enter a Letter: ");
        String character = input.nextLine();
        char c = character.charAt(0);

        // -- Get Count
        int count = count(str, c);

        // -- Output
        System.out.println("The count for character '" + c + "' is " + count);
    }

    // ----- Methods
    public static int count(String str, char a) {
        return count(str, a, str.length() - 1);
    }

    public static int count(String str, char a, int high) {
        if (high < 0) {
            return 0;
        } else if (str.charAt(high) == a) {
            return 1 + count(str, a, high - 1);
        } else {
            return count(str, a, high - 1);
        }
    }
}
