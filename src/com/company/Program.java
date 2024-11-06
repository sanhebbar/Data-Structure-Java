package com.company;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<List<Integer>> locations = new ArrayList<>();
        locations.add(new ArrayList<>(List.of(1, 1)));
        locations.add(new ArrayList<>(List.of(5, 1)));
        locations.add(new ArrayList<>(List.of(5, 6)));

        // Call the function and print the result
        List<Integer> missingPrisoner = missingPrisoner(locations);
        System.out.println(missingPrisoner.get(0) + " " + missingPrisoner.get(1));
    }
    public static List<Integer> missingPrisoner(List<List<Integer>> locations) {
        int xSum = 0;
        int ySum = 0;

        // Calculate the sum of x and y coordinates
        for (List<Integer> location : locations) {
            xSum += location.get(0);
            ySum += location.get(1);
        }

        // Calculate the missing prisoner's coordinates
        int missingX = 2 * locations.get(0).get(0) - xSum;
        int missingY = 2 * locations.get(0).get(1) - ySum;

        // Create and return the list with missing prisoner's coordinates
        List<Integer> result = new ArrayList<>();
        result.add(missingX);
        result.add(missingY);
        return result;
    }
}
