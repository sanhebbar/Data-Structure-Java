package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {

        int num[] = {1,2,0,0};
        int k = 34;
        int sum =0;
        StringBuilder builder = new StringBuilder();
        for(int n : num){
            builder.append(n);
        }
        int n1 = Integer.parseInt(builder.toString());
        sum = n1+k;
         System.out.println(sum);
        int s =0;
        List<Integer> list = new ArrayList<>();

    }
}
