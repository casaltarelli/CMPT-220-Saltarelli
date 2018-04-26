package com.company;
import java.util.Scanner;

public class EighteenEleven {
    // ----- Question 18.11 -----
    public static void main(String[] args) {
        // -- Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");

        long num = input.nextInt();

        // -- Get Result
        int result = sumDigits(num);

        // -- Output
        System.out.print("The sum of " + num + "'s digits is: " + result);
    }

    // ----- Methods
    // -- SumDigits
    public static int sumDigits(long n) {
        return sumDigits(n, 0);
    }

    public static int sumDigits(long n, long result) {
        int nI = (int)(long)n;
        int length = String.valueOf(nI).length();

        // - Check & Calculate
        String sub = String.valueOf(nI).substring(0, length - 1);

        // - Get Next n Value
        int nII = 0;

        try {
            if(sub != null) {
                nII = Integer.parseInt(sub);
            }
        }
        catch (NumberFormatException e) {
            // - If Substring is null then return
            return (int)result + Integer.parseInt(String.valueOf(nI).substring(length - 1));
        }

        return sumDigits(nII, Integer.parseInt(String.valueOf(nI).substring(length - 1)) + result);
    }
}
