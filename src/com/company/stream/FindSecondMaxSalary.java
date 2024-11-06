package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondMaxSalary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000,200,4000,590,670,800);

        Optional<Integer> integer = list.stream()
                .distinct().sorted((a,b)->b-a).skip(1).findFirst();

        integer.stream().forEach(a-> System.out.println(a));


//        Optional<Integer> secondHighest = salaries.stream()
//                .distinct() // Remove duplicates
//                .sorted((a, b) -> b - a) // Sort in descending order
//                .skip(1) // Skip the highest salary
//                .findFirst(); // Get the second highest

    }
}
