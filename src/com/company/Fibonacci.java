package com.company;

public class Fibonacci {
    public static int fibonacci(int n){
//        int a = 0, b = 1, c;
//        for (int i = 2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return b;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i =2;i<=n;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
}
