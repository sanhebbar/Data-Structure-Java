package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public boolean findTwoSum(int[] a, int x){
        for(int i =0;i<a.length-1;i++){
            for(int j =i+1;j<a.length-1;j++){
                if (a[i] + a[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static List<List<Integer>> CustomTwoSum(int[] nums, int t){
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == t){
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int x = 55;
        int[] arr = {2,1,4,-5,6,8};

        boolean result = twoSum.findTwoSum(arr,x);
        System.out.println(result);

        //different approch
        int[] nums = {2, 7, 11, 15, 3, 6, -2, 4};
        int target = 9;

        List<List<Integer>> list = CustomTwoSum(nums, target);
        System.out.println(list);

    }
}
