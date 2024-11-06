package com.company.strings;

import java.util.HashSet;
import java.util.Set;

public class SplitStringMaxNumberofUniqueSubstrings {
    public static void uniqueSubString(String s){
        Set<String> set = new HashSet<>();
        int c = 0;
        for (int i =0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            for (int j = i;j<s.length();j++){
                sb.append(s.charAt(j));
                if(set.add(sb.toString())){
                    c++;
                }
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        String s = "ababccc";
        uniqueSubString(s);
    }
}
