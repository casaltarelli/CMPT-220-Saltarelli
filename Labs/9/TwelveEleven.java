//package com.company;

import java.util.*;
import java.io.*;

public class TwelveEleven {
    // ----- Question 12.11 -----

    public static void main(String[] args) {
        // -- Check proper input
        if (args.length != 2) {
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        File file = new File(args[1]);

        // -- Check if file exists
        if (!file.exists()) {
            System.out.print("File does not exist");
            System.exit(0);
        }

        File temp = new File("temp.txt"); // JA

        Scanner input = null;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            // - File does not exist
        }

        // -- PrintWriter
        PrintWriter output = null;

        try {
            output = new PrintWriter(temp);
        } catch (FileNotFoundException e) {
            // - File doesn't exits so stack
            e.printStackTrace();
        }

        while (input.hasNextLine()) {
            String sI = input.nextLine();

            // - Replace
            String sII = sI.replaceAll(args[0], "");
            output.println(sII);
        }

        // -- Close
        output.flush();
        input.close();
        output.close();
        file.delete();

        // -- Rename Temp & delete Temp
        temp.renameTo(file);
        temp.delete();
    }
}
