package com.company.Arrays;

public class SearchRotatedSortedArray {
    public static int rotateArray(int[] nums, int target){
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {4,5,6,7,0,1,2};
        int t = 0;
        int r = rotateArray(a,t);
        System.out.println(r);
    }
}
