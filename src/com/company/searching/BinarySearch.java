package com.company.searching;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] a, int search){
        int low = 0;
        int high = a.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (a[mid] == search){
                return mid;
            }else if(a[mid] < search){
                low = mid + 1;
            }else{
                high = mid - 1;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,8,9,10};
        Arrays.sort(arr);
        int search = 4;
        int result = BinarySearch.binarySearch(arr,search);
        System.out.println(result);
    }
}
