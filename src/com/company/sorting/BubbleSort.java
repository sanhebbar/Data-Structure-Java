package com.company.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,11,67,34,23,2,5};
        for (int i = 0; i<arr.length-1;i++){
            for (int j = 0; j<arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int n : arr){
            System.out.print(n + " ");
        }
    }
}
