package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		// ----- Question 1.4 -----
    	int a = 1;

	    for (int i = 0; i < 4; i++) {
	        // -- Print original value
	        System.out.print("a: " + a + ", ");

	        // -- Print original value squared
	        int temp = a * a;
	        System.out.print("a^2 " + temp + ", ");

	        // -- Print original value to the third
	        temp = a * a * a;
	        System.out.print("a^3: " + temp + ", ");

	        System.out.println("");

	        // -- Add 1 to 'a'
            a++;
        }
    }
}
