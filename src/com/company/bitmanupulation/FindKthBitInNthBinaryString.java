package com.company.bitmanupulation;

public class FindKthBitInNthBinaryString {
    public static void nthBinaryString(int n, int k ){
       int len = (1 << n)-1;
        System.out.println(len);
    }
    public static void main(String[] args) {
        int n = 3, k = 1;
        nthBinaryString(n,k);


    }
}
