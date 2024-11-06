package com.company.map;

import java.util.HashMap;
import java.util.Map;

public class NumberOfMatchingSubSequence {
    public static int  subSequence(String s, String[] words){
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (String word : words){
            map.put(word, map.getOrDefault(word,0) +1);
        }
        for (String word : map.keySet()){
            int i =0,j = 0;
            while (i < s.length() && j < word.length()){
                if(word.charAt(j) == s.charAt(i)){
                    j++;
                }
                i++;
            }
            if(j == word.length()){
                ans += map.get(word);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};

        int result = subSequence(s,words);
        System.out.println(result);
    }
}
