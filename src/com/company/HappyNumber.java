package com.company;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean happy(int n ){
        Set<Integer>  set = new HashSet<>();
        while (n != 1){
            if (set.contains(n)){
                return false;
            }
            set.add(n);
            n = getNext(n);
        }
        return true;
    }

    private static int getNext(int n){
        int s = 0;
        while ( n > 0){
            int rem = n%=10;
            s = rem * rem;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        int n  = 19;
        boolean bool = happy(n);
        System.out.println(bool);
    }
}
