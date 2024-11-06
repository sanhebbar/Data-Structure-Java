package com.company.bitmanupulation;

public class DecimalToBinary {
    public static void decimalToBinary(int n){
        int[] ans = new int[500];
        int i =0;
        while (n>0){
            ans[i] = n%2;
            n/=2;
            i++;
        }
        for (int j = i-1;j>=0;j--){
            System.out.print(ans[j]);
        }
    }
    public static void binaryToDecimal(String str){
        int dec= 0, base = 1;
        for (int i = str.length()-1;i>=0;i--){
            if (str.charAt(i) == '1'){
                dec+=base;
                base = base*2;
            }
        }


    }
    public static void main(String[] args) {
//        DecimalToBinary.decimalToBinary(2);
        DecimalToBinary.binaryToDecimal("0010");


    }
}
