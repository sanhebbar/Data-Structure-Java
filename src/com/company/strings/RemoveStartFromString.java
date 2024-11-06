package com.company.strings;

import java.util.Stack;

public class RemoveStartFromString {
    public static void removeStar(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '*') {
               stack.pop();
            }
        }

       for (char c : stack){
           sb.append(c);
       }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s = "erase*****";

        removeStar(s);
    }
}
