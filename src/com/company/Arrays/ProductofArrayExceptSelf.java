package com.company.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static int[] productItSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        //expected Output: [24,12,8,6]

        int nums1[] = {-1,1,0,-3,3};
        //Output: [0,0,9,0,0]

       int[] result =  productItSelf(nums);
        System.out.println(Arrays.toString(result));
        int[] result1 =  productItSelf(nums1);
        System.out.println(Arrays.toString(result1));


    }
}
