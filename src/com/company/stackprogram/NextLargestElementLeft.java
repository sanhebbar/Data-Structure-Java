package com.company.stackprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextLargestElementLeft {
    public static void largestElementLeft(int a[]){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        if (s.size() == 0){
            list.add(-1);
        }
        for (int i = 0;i < a.length-1;i++){
            while (!s.isEmpty() && s.peek() <= a[i]){
                s.pop();
            }
            if (!s.isEmpty()){
                list.add(s.peek());
            }else{
                list.add(-1);
            }
            s.push(a[i]);
        }
        list.stream().forEach(i-> System.out.println(i));
    }
    public static void main(String[] args) {
        int[] a = {1,3,2,4};
        NextLargestElementLeft.largestElementLeft(a);
    }
}
