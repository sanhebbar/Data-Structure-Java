package com.company.map;

import java.util.*;

public class SecondMostRepeatedWord {
    public static void secondMost(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        List<Map.Entry<String, Integer>> l = new ArrayList<>(map.entrySet());
        l.sort((a,b) -> b.getValue().compareTo(a.getValue()));
        System.out.println(l);
        //System.out.println(map);
        System.out.println(l.get(1));



    }
    public static void main(String[] args) {
        String s[] = {"aaa", "abc", "aaa", "ac", "de","abc","aaa","abc","aaa"};

        secondMost(s);
    }
}
