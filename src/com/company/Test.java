package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static int[] sort(int a[]){
        // bubble sort
//        for(int i=0;i< a.length;i++){
//            for (int j =i+1;j<a.length;j++){
//                if(a[i]>a[j]){
//                    int t = a[i];
//                    a[i] =a[j];
//                    a[j] =t;
//                }
//            }
//        }
//selection sort
        for(int i =0;i<a.length-1;i++){
            int min = i;
            for (int j = i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int t = a[min];
            a[min] =a[i];
            a[i] = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Test test= new Test();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        int n = scanner.nextInt();
        System.out.println("enter elements");
        int a[] = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int arr[] = sort(a);
        for (int i =0;i<arr.length;i++){
            System.out.println(a[i]);
        }


    }
}

