package com.company.sorting;

public class SelectionSort {

    public static void main(String[] args) {
    int[] arr = {64,25,12,22,11};
    int temp = 0;
    int minIndex = -1;
    for (int i = 0;i < arr.length-1;i++){
        minIndex = i;
        for (int j = i+1;j<arr.length;j++){
            if (  arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        temp =  arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
    for (int i : arr){
        System.out.print( i + " ");
    }
    }
}
