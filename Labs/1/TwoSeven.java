package com.company;

import java.util.Scanner;

public class TwoSeven {
    public static void main(String[] args) {
        // ----- Question 2.7 -----
        Scanner getMins = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");

        int mins = getMins.nextInt();

        // -- Convert Minutes
        // - To days
        int days = mins / 1440;
        int extraMins = mins % 1440;

        // - Days to Years
        int years = days / 365;
        int extraDays = days % 365;

        // - Return conversion
        System.out.println(mins + " minutes is approximately "
                + years + " years and about " + extraDays +
                " days and about " + extraMins + " minutes");
    }

}
