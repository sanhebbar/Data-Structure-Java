package com.company.strings;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSpecialSubstringThatOccursThriceI {
    public static int longestSubString(String s){
        int n = s.length();
        Map<String, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            StringBuilder specialSubstring = new StringBuilder();

            for (int j = i; j < n; j++) {
                if (s.charAt(j) == currentChar) {
                    specialSubstring.append(currentChar);
                    String substring = specialSubstring.toString();
                    freqMap.put(substring, freqMap.getOrDefault(substring, 0) + 1);
                } else {
                    break;
                }
            }
        }

        int maxLength = -1;
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() >= 3) {
                maxLength = Math.max(maxLength, entry.getKey().length());
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aaaa";
       int result =  longestSubString(s);
        System.out.println(result);
    }
}
