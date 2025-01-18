package com.company.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ConstructStringWithRepeatLimit {
    public static void constructString(String s, int r){
        Map<Character, Integer>  map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

    }
    public static void main(String[] args) {
        String s = "cczazcc";
        int repeat = 3;

        constructString(s, repeat);
    }
}
