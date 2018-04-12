//package com.company;

import java.io.*;
import java.util.*;


public class TwelveThirteen {
    // ----- Question 12.13 -----

    public static void main(String[] args) {
        // ----- Variables
        String[] specialCharacters = {"+", "-", "&&", "||", "!", "(", ")", "{", "}", "[", "]", "^",
                "~" , "*" , "?" , ":"};
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // -- Check proper input
        if (args.length != 1) { // JA
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        File file = new File(args[0]); // JA

        // -- Check if file exists
        if (!file.exists()) {
            System.out.print("File does not exist");
            System.exit(0);
        }

        Scanner input = null;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            // - File does not exist
        }

        while (input.hasNextLine()) {
            String s = input.nextLine();

            // - Line Counter
            lineCount += 1;

            // - Word Counter
            int currentWordCount = s.split("\\w+").length;

            for (int i = 0; i < s.length(); i++) {
                String letter = String.valueOf(s.charAt(i));

                // - Check if Letter is a Special Character
                for (int j = 0; j < specialCharacters.length; j++) {
                    if (letter == specialCharacters[i]) {
                        currentWordCount -= 1;
                    }
                }
            }

            wordCount = wordCount + currentWordCount;

            // - Char Counter
            String currentCharCount = s.replaceAll("\\s","");
            charCount = charCount + currentCharCount.length();
        }
    }
}
