package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringProgram {
    public static void main(String[] args) {
//        String s = "hello world";
//
//        int len  =0;
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.println(s.charAt(i));
//            if(s.charAt(i) != ' '){
//                len++;
//            }else if (len>0){
//                break;
//            }
//        }
//        System.out.println(len);
        String str = "Sanath";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length()-1;i++){
            if(map.containsKey(str.charAt(i))){
                int c = map.get(str.charAt(i));
                map.put(str.charAt(i),++c);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);

        String s = "welcome to java welcome to java";
        Map<String, Integer> map1 = new HashMap<>();
        String[] word = s.split(" ");
        for (String w : word){

            if (map1.containsKey(w)){
                map1.put(w,map1.get(w)+1);
            }else {
                map1.put(w, 1);
            }
        }
        System.out.println(map1);
        map1.forEach((a,b)-> System.out.println(a+"-"+b));
        ArrayList<Integer> arrayList = new ArrayList<>();

        String s1 = new String("hello");
        String s2 = new String("hello");
        if (s1==s2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
