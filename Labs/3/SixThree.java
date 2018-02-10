package com.company;

import java.util.Scanner;

public class SixThree {
    public static void main(String[] args) {
        // ----- Question 6.3 -----
        // -- Prompt User
        Scanner getNum = new Scanner(System.in);
        System.out.println("Please enter an integer (10 - 99):");

        int num = getNum.nextInt();

        // -- Get Reverse
        int reverseNum = reverse(num);

        // -- Find if Palindrome
        boolean isPalindrome = isPalindrome(num);


        // -- Output to User
        System.out.println("The reverse of " + num + " is " + reverseNum);

        if (isPalindrome){
            System.out.println("The number " + num + " is a palindrome");
        } else if (isPalindrome == false) {
            System.out.println("The number " + num + " is not a palindrome");
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int remainder;

        // -- Reverse
        while (number != 0) {
            remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number = number / 10;
        }

        return reverseNum;
    }

    public static boolean isPalindrome(int number) {
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        boolean palindrome = false;

        if (firstDigit == secondDigit) {
            palindrome = true;
        } else {
            palindrome = false;
        }

        return palindrome;
    }
}
