package com.company.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsetOfGivenArray {
    public static void subSetOfGivenArray(int[] a) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Start with the empty subset

        for (int n : a) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> subset : result) {
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(n); // Add the current element to the subset
                newSubsets.add(newSubset); // Store the new subset
            }
            // Add all new subsets to the result
            result.addAll(newSubsets);
            System.out.println("result" + result);
        }
       // Return the final list of subsets
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Input array
       subSetOfGivenArray(arr); // Get subsets
         // Print all subsets
    }
}
