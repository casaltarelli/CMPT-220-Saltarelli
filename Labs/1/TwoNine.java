package com.company;

import java.util.Scanner;

public class TwoNine {
    public static void main(String[] args) {
        // ----- Question 2.9 -----
        // -- Prompt User
        Scanner getData = new Scanner(System.in);
        System.out.println("Please enter an initial velocity, ending velocity, and " +
                "period of time all separated by one space");

        // -- Collect Data
        float initial = getData.nextFloat();
        float ending = getData.nextFloat();
        float time = getData.nextFloat();

        // -- Find Average Acceleration
        float avgAccel = ((ending - initial) / time);

        // -- Return Avg Acceleration to user
        System.out.println("The average acceleration from the data you entered is: " + avgAccel);

    }
}
