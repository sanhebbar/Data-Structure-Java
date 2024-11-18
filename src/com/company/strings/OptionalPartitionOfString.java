package com.company.strings;

import java.util.HashSet;
import java.util.Set;

public class OptionalPartitionOfString {
    public static void optionalPartitionOfString(String s){
        int c =1;
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()){
            if (set.contains(ch)){
                c++;
                set.clear();
            }
            set.add(ch);
            System.out.println(c);
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        String s = "abacaba";
        optionalPartitionOfString(s);
    }
}
