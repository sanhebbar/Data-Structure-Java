package com.company.strings;

public class ZigZagConversion {
    public static void zigzag(String s, int r){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i+=r+1){
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        int row = 3;
        //Output: "PAHNAPLSIIGYIR"
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
        zigzag(s,row);
    }
}
