package com.company.sorting;

public class QuickSort {
    private static void  quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i =low -1;
        for (int j = low;j<high;j++){
            if ((arr[j] < pivot)){
                i++;
                int t =  arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t =  arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = t;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
         QuickSort.quickSort(arr, 0,arr.length-1);
         for (int a:arr){
             System.out.print(a + " ");
         }
    }
}
