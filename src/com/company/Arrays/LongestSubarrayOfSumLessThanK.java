package com.company.Arrays;

public class LongestSubarrayOfSumLessThanK {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int k = 14;
        // answer is 3

        int l =0, r=0,sum=0,max=0;

        while (r<arr.length-1){
            sum +=arr[r];
            if (sum >k){
                sum = sum-arr[l];
                l++;
            }
            if (sum <=k){
                max = Math.max(max, r-l+1);
                r++;
            }
        }
        System.out.println(max);
    }
}
