package com.company;

import java.util.Scanner;

public class PaperProblem {
    static Scanner getPaper = new Scanner(System.in);

    public static void main(String[] args) {
        // ----- A1 Paper Problem -----
        // -- Prompt User/Get Paper
        int smallPaperSize = getPaper.nextInt();
        int[] numSheets = new int[smallPaperSize];

        for (int i = 1; i < smallPaperSize; i++) {
            numSheets[i] = getPaper.nextInt();
        }


        // -- Get Tape Lengths
        double[] tape = new double[smallPaperSize];

        for (int i = 1; i < smallPaperSize; i++) {
            tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0);
        }

        double tapeUsed = 0;
        int nextPageSize = 1;

        for (int i = 0; i < smallPaperSize; i++) {
            tapeUsed += tape[i] * ((double) (nextPageSize / 2));

            // -- Check If Enough Pages
            if (numSheets[i] >= nextPageSize) {
                nextPageSize = 0;
                break;
            } else {
                nextPageSize = (nextPageSize - numSheets[i]) * 2;
            }
        }

        // -- Output
        if (nextPageSize > 0) {
            System.out.println("impossible");
        } else {
            System.out.println(tapeUsed);
        }

    }

}
