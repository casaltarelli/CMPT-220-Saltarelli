//package com.company;

public class SixNine {
    public static void main(String[] args) {
        // ----- Question 6.9 -----
        // -- Set Up Table
        double feet = 1.0;
        double meters = 20.0;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("| Feet         | Meters         | |     | Meters       | Feet           |");

        for (int i = 0; i < 10; i++) {
            // - Separator
            System.out.println("-------------------------------------------------------------------------");
            double convertedMeters = footToMeter(feet);
            double convertedFeet = meterToFoot(meters);

            // - Adjust Accordingly
            if (feet < 4) {
                System.out.printf("| %.1f          | %.3f          | |     | %.1f         | %.3f         ",
                        feet, convertedMeters, meters, convertedFeet);
            } else if (feet > 3 && feet < 10) {
                System.out.printf("| %.1f          | %.3f          | |     | %.1f         | %.3f        ",
                        feet, convertedMeters, meters, convertedFeet);
            } else if (feet > 9) {
                System.out.printf("| %.1f         | %.3f          | |     | %.1f         | %.3f        ",
                        feet, convertedMeters, meters, convertedFeet);
            }

            System.out.println("|");

            feet = feet + 1;
            meters = meters + 5;

        }

        // - Bottom of Table
        System.out.println("-------------------------------------------------------------------------");
    }

    public static double footToMeter(double foot) {
        double conversion = 0.305;

        foot = conversion * foot;
        return foot;
    }

    public static double meterToFoot(double meters) {
        double conversion = 3.279;

        meters = conversion * meters;
        return meters;
    }

}
