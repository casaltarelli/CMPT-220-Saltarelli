//package com.company;

import java.util.Scanner;

public class ThreeFive {
    public static void main(String[] args) {
        // ----- Question 3.5 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter today's day (int) and the desired time elapsed (int)");

        // -- Check Day and Return to User
        /*
        Note: Had to use two switch statements because a single switch statement does not accept
        multiple arguments, could've used an if/else system however it would have be extremely redundant
         */

        String currentDay = "";
        String futureDay = "";

        int day = input.nextInt();
        int elapsed = input.nextInt();
        int elapsedDay = elapsed % 7;

        switch (day) {
            case 0:
                currentDay = "Sunday";
                break;

            case 1:
                currentDay = "Monday";
                break;

            case 2:
                currentDay = "Tuesday";
                break;

            case 3:
                currentDay = "Wednesday";
                break;

            case 4:
                currentDay = "Thursday";
                break;

            case 5:
                currentDay = "Friday";
                break;

            case 6:
                currentDay = "Saturday";
                break;

            default:
                currentDay = "(error: invalid value)";
                break;
        }

        switch (elapsedDay) {
            case 0:
                futureDay = "Sunday";
                break;

            case 1:
                futureDay = "Monday";
                break;

            case 2:
                futureDay = "Tuesday";
                break;

            case 3:
                futureDay = "Wednesday";
                break;

            case 4:
                futureDay = "Thursday";
                break;

            case 5:
                futureDay = "Friday";
                break;

            case 6:
                futureDay = "Saturday";
                break;

            default:
                futureDay = "(error: invalid value)";
                break;
        }

        // -- Return Data to User
        System.out.println("Today is " + currentDay + " and the future day will be " + futureDay);
    }
}
