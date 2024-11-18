package com.company.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] nums, int left, int right){
        if (left< right){
            int mid = (left + right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1,right);

            merge(nums, left, mid, right);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i =0;i<n1;i++){
            leftArray[i] = nums[left + i];
        }
        for(int j = 0;j<n2;j++){
            rightArray[j] = nums[mid + 1 + j];
        }

        //merge temp to to main array it is nums array

        int i =0, j=0, k = left;
        while (i <n1 && j<n2){
            if (leftArray[i] <= rightArray[j]){
                nums[k] = leftArray[i];
                i++;
            }else{
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // remaining element in leftarray and reight array to main nums array
        while (i < n1){
            nums[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2){
            nums[k] = rightArray[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int[] nums = {3,4,2,6,5,1};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
