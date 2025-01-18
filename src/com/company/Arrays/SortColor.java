package com.company.Arrays;

public class SortColor {
    public static void sorting(int arr[]){
        for (int i =0;i< arr.length-1;i++){
//            for(int j =0;j<arr.length;j++){
//                if (arr[i] < arr[j]){
//                    int t = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = t;
//                }
//            }

            if (arr[i+1] > arr[i]){
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
        }
        for (int n : arr){
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        //output = 0,0,1,1,2,2
        sorting(arr);
        System.out.println("test case 2");
        int arr1[] = {2,0,1};
        //output = 0,1,2
        sorting(arr1);
    }
}
