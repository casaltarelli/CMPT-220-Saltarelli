package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ElevenEleven {
    // ----- Question 11.11 -----
    // ----- Global Variables

    public static void main(String[] args) {
        // -- Get Input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five integers: ");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextInt());
        }

        // -- Sort
        ArrayList<Integer> sortedNums = sort(numbers);

        // -- Return
        System.out.print("[");
        for (int j = 0; j < sortedNums.size(); j++) {
            if (j < (sortedNums.size() - 1)) {
                System.out.print(sortedNums.get(j) + ", ");
            } else {
                System.out.print(sortedNums.get(j));
            }
        }
        System.out.print("]");

    }

    // ----- Methods
    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        ArrayList<Integer> sorted = list;

        // - Sort
        Collections.sort(sorted);
        Collections.reverse(sorted);

        // - Return
        return sorted;

    }

}
