package com.company.Arrays;

public class MinimumSizeSubarraySum {
    public static void minimumSize(int[] nums, int t){
        int minLength = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= t) {

                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
         if (minLength == Integer.MAX_VALUE){
             System.out.println(0);
         }else {
             System.out.println(minLength);
         }


    }
    public static void main(String[] args) {
//        Example 1:
//
//        Input: target = 7, nums = [2,3,1,2,4,3]
//        Output: 2
//        Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//        Example 2:
//
//        Input: target = 4, nums = [1,4,4]
//        Output: 1
//        Example 3:
//
//        Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//        Output: 0
        int nums[] = {1,2,3,4,5}, target = 11;

        minimumSize(nums, target);

    }
}
