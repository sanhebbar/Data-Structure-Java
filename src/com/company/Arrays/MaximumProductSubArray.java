package com.company.Arrays;

public class MaximumProductSubArray {

    public static int maxProduct(int nums[]){
        int maxp = nums[0];
        int minp = nums[0];
        int result = nums[0];
        if (nums == null || nums.length == 0){
            return 0;
        }
        for(int i = 1;i < nums.length;i++){
            int curr = nums[i];
            if(curr < 0){
                int t = maxp;
                maxp = minp;
                minp = t;
            }
            maxp = Math.max(curr, maxp * curr);
            minp = Math.min(curr, minp* curr);
            result = Math.max(result, maxp);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums ={2,3,-2,4};
       // Output: 6
        System.out.println("max subarray: " +maxProduct(nums) );

        int[] nums1 = {-2,0,-1};
        //Output: 0
        System.out.println("max subarray1: " +maxProduct(nums1) );
    }
}
