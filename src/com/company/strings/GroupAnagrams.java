package com.company.strings;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> anagram(String strs[]){
       if (strs == null || strs.length == 0){
           return new ArrayList<>();
       }
        Map<String, List<String>> map = new HashMap<>();
       for (String s : strs){
           char ch[] = s.toCharArray();
           Arrays.sort(ch);
           String sorted = new String(ch);
           if (!map.containsKey(sorted)){
               map.put(sorted, new ArrayList<>());
           }
           map.get(sorted).add(s);
       }

       return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
//        Example 1:
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//        Explanation:
//        There is no string in strs that can be rearranged to form "bat".
//                The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//                The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

//        Example 2:
//        Input: strs = [""]
//        Output: [[""]]
//
//        Example 3:
//        Input: strs = ["a"]
//        Output: [["a"]]

        String s[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = anagram(s);
        System.out.println(result);

    }
}
