package com.company.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrayUsingStream {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();

        System.out.println(Arrays.toString(result));
    }
}
