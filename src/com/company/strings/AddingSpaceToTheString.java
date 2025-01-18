package com.company.strings;

import java.util.HashSet;
import java.util.Set;

public class AddingSpaceToTheString {
    public static void addingSpace(String s, int space[]){
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        for(int n : space){
            set.add(n);
        }
        for (int i =0;i<s.length();i++){
            if (!set.contains(i)){
                sb.append(s.charAt(i));
            }else {
                sb.append(" ").append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] space = {8,13,15};
        addingSpace(s, space);

        String s1= "icodeinpython";
        int space1[] = {1,5,7,9};
        addingSpace(s1, space1);

        String s2 = "spacing";
        int space2[] = {0,1,2,3,4,5,6};
        addingSpace(s2, space2);

    }
}
