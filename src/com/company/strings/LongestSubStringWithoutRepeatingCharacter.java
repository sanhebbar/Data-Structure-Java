package com.company.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
    public static int nonRepeatingChar(String s){
        int c = 0;
        int max =0;
        if(s.length() == 0){
            return 0;
        }
        if(s.length() ==1){
            return 1;
        }
        Set<Character> set = new HashSet<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            while (set.contains(ch)){
                set.remove(s.charAt(c));
                c++;
            }
            set.add(ch);
            max = Math.max(max, i - c +1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabc";
       int result =  LongestSubStringWithoutRepeatingCharacter.nonRepeatingChar(s);
        System.out.println(result);
    }
}
