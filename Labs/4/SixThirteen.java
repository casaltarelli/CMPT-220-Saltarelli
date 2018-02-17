package com.company;

public class SixThirteen {
    public static void main(String[] args) {
        // ----- Question 6.13 -----
        // Set Up Table
        System.out.println("---------------------------");
        System.out.println("| i          | m(i)       |");

        for (double i = 1; i < 21; i++) {
            // - Separator
            System.out.println("---------------------------");

            double sumSeries = sumSeries(i);

            // - Align Accordingly
            if (i < 10) {
                System.out.printf("| %.0f          | %.4f     ", i, sumSeries);
            } else if (i < 13 && i > 9) {
                System.out.printf("| %.0f         | %.4f     ", i, sumSeries);
            } else if ( i > 12 ) {
                System.out.printf("| %.0f         | %.4f    ", i, sumSeries);
            }

            System.out.println("|");
        }
        // - Bottom of Table
        System.out.println("---------------------------");
    }

    public static double sumSeries(double i) {
        double sum = 0;

        // -- Calculate
        for (double j = 1; j < i+1; j++) {
            double numSum = j / (j+1);
            sum = sum + numSum;
        }

        return sum;
    }
}
