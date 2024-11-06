package com.company.stackprogram;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerToRight {
    public static void smallerToRight(int[] a){
        int n[] = new int[a.length];
        Stack<Integer> s= new Stack<>();
        Arrays.fill(n,-1);
        for (int i = a.length-1;i>=0;i--){
            while (!s.isEmpty() && s.peek() >= a[i]){
                s.pop();
            }
            if (!s.isEmpty()){
                n[i] = s.peek();
            }else {
                n[i] = -1;
            }
            s.push(a[i]);
        }
        System.out.println(Arrays.toString(n));
    }
    public static void main(String[] args) {
        int a[] = {4,5,2,10,8};
        NearestSmallerToRight .smallerToRight(a);
    }
}
