package com.company.searching;

public class LinearSearch {
    public static int linearSearch(int a[], int search){
        for (int i =0; i < a.length-1; i++){
            if (a[i] == search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,8,9,10,4};
        int search = 8;
        int result = LinearSearch.linearSearch(arr,search);
        System.out.println(result);
    }
}
