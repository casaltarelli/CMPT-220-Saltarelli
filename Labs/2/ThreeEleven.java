//package com.company;

import java.util.Scanner;

public class ThreeEleven {
    public static void main(String[] args) {
        // ----- Question 3.11 -----
        // -- Prompt User
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month and year seperated by a space");

        int month = input.nextInt();
        int year = input.nextInt();

        // -- Check if year is a leap year
        boolean leap = false;

        // - Check if year is a leap year
        if ((year % 4 == 0) && (year / 100 != 0)) {
            leap = true;
        }

        // - Check days in desired month accordingly
        int outputDays = 0;
        String outputMonth = "";

        switch (month) {
            case 1:
                outputDays = 31;
                outputMonth = "January";
                break;

            case 2:
                if (leap) {
                    outputDays = 29;
                } else {
                    outputDays = 28;
                }
                outputMonth = "February";

                break;

            case 3:
                outputDays = 31;
                outputMonth = "March";
                break;

            case 4:
                outputDays = 30;
                outputMonth = "April";
                break;

            case 5:
                outputDays = 31;
                outputMonth = "May";
                break;

            case 6:
                outputDays = 30;
                outputMonth = "June";
                break;

            case 7:
                outputDays = 31;
                outputMonth = "July";
                break;

            case 8:
                outputDays = 31;
                outputMonth = "August";
                break;

            case 9:
                outputDays = 30;
                outputMonth = "September";
                break;

            case 10:
                outputDays = 31;
                outputMonth = "October";
                break;

            case 11:
                outputDays = 30;
                outputMonth = "November";
                break;

            case 12:
                outputDays = 30;
                outputMonth = "December";
                break;

        }

        if (outputMonth == "") {
            outputMonth = "(error: invalid number)";
        }

        // -- Return to User
        System.out.println(outputMonth + year + " has " + outputDays + " days in it.");
    }
}

