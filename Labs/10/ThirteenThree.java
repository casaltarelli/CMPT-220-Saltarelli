package com.company;

import java.util.ArrayList;

public class ThirteenThree  {
    // ----- Question 13.3 -----

    public static void main(String[] args) {
        // -- Make ArrayList
        ArrayList<Number> numbers = new ArrayList<>();

        // -- Populate List
        for (int i = 0; i < 10; i++) {
            Number num = (Math.random() * 10) + 1;
            numbers.add(num);
        }

        // - Sort
        sort(numbers);

        // -- Output
        System.out.println("Sorted Array List: " + numbers);
    }

    // ----- Methods
    public static void sort(ArrayList<Number> list) {
        // -- Sort
        for (int i = 0; i < list.size() - 1; i++) {
            // - Get first value to compare
            Number numI = list.get(i);
            int numIIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                // - Check if greater than next Number
                if (numI.doubleValue() > list.get(j).doubleValue()) {
                    numI = list.get(j);
                    numIIndex = j;
                }
            }

            // - Check if values should swap
            if (numIIndex != i) {
                list.set(numIIndex, list.get(i));
                list.set(i, numI);
            }
        }
    }
}
