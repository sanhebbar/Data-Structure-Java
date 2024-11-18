package com.company.strings;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s){
        int result = 0;
        for (int i =0;i<s.length();i++){
            result = result * 26 + (s.charAt(i) - 'A' +1);
            System.out.println("cal" + (s.charAt(i) - 'A' +1));
            System.out.println("result" + result);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));   // Output: 1
        System.out.println(titleToNumber("AZ"));  // Output: 28
        System.out.println(titleToNumber("ZY"));
    }
}
