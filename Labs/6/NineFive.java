package com.company;

import java.util.GregorianCalendar;

public class NineFive {
    // ----- Question 9.5 -----
    public static void main(String[] args) {
        GregorianCalendar gCalendar = new GregorianCalendar();

        // -- Current Date
        // 3-2-18
        String month = String.valueOf(gCalendar.get(GregorianCalendar.MONTH));
        String day = String.valueOf(gCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        String year = String.valueOf(gCalendar.get(GregorianCalendar.YEAR));

        System.out.println("The current date is: " + month + "-" + day + "-" + year);

        // -- Use Elapsed Time
        gCalendar.setTimeInMillis(1234567898765L);

        String monthE = String.valueOf(gCalendar.get(GregorianCalendar.MONTH));
        String dayE = String.valueOf(gCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        String yearE = String.valueOf(gCalendar.get(GregorianCalendar.YEAR));

        System.out.println("Based on the time elapsed, the date would be: " + monthE + "-" + dayE + "-" + yearE);
    }
}
