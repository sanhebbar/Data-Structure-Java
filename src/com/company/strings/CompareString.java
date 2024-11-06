package com.company.strings;

import java.util.HashMap;
import java.util.Map;

public class CompareString {
    public static int compare(char[] ch){
        Map<Character, Integer> map = new HashMap<>();
        int count =0;
        for (int i =0;i<ch.length-1;i++){
            if (map.containsKey(ch[i])){
                 count = map.get(ch[i]);
                map.put(ch[i],++count);
            }else {
                map.put(ch[i],1);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        char[] str = {'a','a','b','b','c','c','c'};
        int r = CompareString.compare(str);
        System.out.println(r);
    }
}
