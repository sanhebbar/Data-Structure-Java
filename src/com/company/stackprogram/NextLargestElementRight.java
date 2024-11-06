package com.company.stackprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextLargestElementRight {
    public static int[] largestElement(int a[]){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        list.add(-1);
        for (int i = a.length-1;i>=0;i--){
            while (!s.isEmpty() && s.peek() <= a[i]){
                s.pop();
            }
            if (!s.isEmpty()){
                list.add(s.peek());
            }
            s.push(a[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int n[] = {1,3,2,4};
        int[] result = NextLargestElementRight.largestElement(n);
        System.out.println(Arrays.toString(result));
    }
}
