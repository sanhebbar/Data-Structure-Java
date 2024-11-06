package com.company.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void removeDuplicate(int[] a){
        Set<Integer> set = new HashSet<>();
        for (int n : a){
            set.add(n);
        }
        for (int n : set){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2,4,6,7,8,8,9,5,3};
        RemoveDuplicate.removeDuplicate(a);

    }
}
