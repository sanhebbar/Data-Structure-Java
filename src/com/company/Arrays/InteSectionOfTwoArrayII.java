package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InteSectionOfTwoArrayII {
    public static void intersectionArray(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j=0;
        List<Integer> list = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        int index =0;
        for (int n : list){
            result[index++] = n;
        }
        System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args) {
//        Example 1:
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2,2]
//
//        Example 2:
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [4,9]
//        Explanation: [9,4] is also accepted.

        int[] nums1 = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        intersectionArray(nums1, nums2);
    }
}
