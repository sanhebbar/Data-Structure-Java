package com.company.strings;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static String compress(String s){
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()){
            sb.append(e.getKey()).append(e.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbccc";
        System.out.println(compress(s));
    }
}
