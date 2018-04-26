package com.company;

import java.util.Scanner;

public class EighteenSeventeen {
    // ----- Question 18.17 -----
    // ----- Global Variables

    public static void main(String[] args) {
        // -- Input
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Series of Characters on One Line: ");
        String str = input.nextLine();

        // -- Convert & Get Char
        char[] chars = new char[str.length()];
        char c = str.charAt(str.length() - 1);

        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }

        // -- Get Count
        int count = count(chars, c);

        // -- Output
        System.out.println("The count for character '" + c + "' is " + count);
    }

    // ----- Methods
    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high < 0) {
            return high;
        } else if (chars[high] == ch) {
            return 1 + count(chars, ch, high - 1);
        } else {
            return count(chars, ch, high - 1);
        }
    }
}
