package com.company.Arrays;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void firstAndLast(int[] nums, int t){
        int[] result = new int[]{-1, -1};  // Default to [-1, -1] if not found

        if (nums.length == 0) {
            return ;  // Return early for empty array
        }

//        for (int i =0;i<nums.length;i++){
//            if (nums[i] == t){
//                result[0] = i;
//                break;
//            }
//        }
//        for (int i = nums.length-1;i>=0;i--){
//            if (nums[i] == t){
//                result[1] = i;
//                break;
//            }
//        }
        int ind = 0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]  == t){
                result[ind] = i;
                ind++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        //output [3,4]
        firstAndLast(nums, target);

        int nums1[] = {5,7,7,8,8,10}, target1 = 6;
//OUTPUT [-1 , -1]
        firstAndLast(nums1, target1);

    }
}
