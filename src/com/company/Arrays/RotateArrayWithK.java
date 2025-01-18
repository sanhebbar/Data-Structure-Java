package com.company.Arrays;

import java.util.Arrays;

public class RotateArrayWithK {
    public static int[] rotateArray(int[] a, int k){
        int result[] = new int[a.length];
        int j = 0;
        for (int i = a.length- k;i<a.length;i++){
            result[j++] = a[i];
        }
        for (int i = 0;i<a.length-k ;i++){
            result[j++] = a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int[] r1 = rotateArray(arr, k);
        System.out.println(Arrays.toString(r1));

        int arr1[] = {-1,-100,3,99};
        int k1 = 2;
        int[] r2 = rotateArray(arr1, k1);
        System.out.println(Arrays.toString(r2));
    }
}
