package com.company.objects;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenanArrayofObjects {
    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}};
        Object[] flattened = flattenArray(array);
        System.out.println(Arrays.toString(flattened));
    }
    public static Object[] flattenArray(Object[] array) {
        return Arrays.stream(array) .flatMap(o -> o instanceof Object[] ? Arrays.stream(flattenArray((Object[]) o)) : Stream.of(o)) .toArray();
       }
}
