package com.company.Arrays;

public class FindKthElement {
    public static int[] findKthElement(int[] nums, int k){
      if (k > nums.length) {
            k = k % nums.length;
        }
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            arr[j++] = nums[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            if (j < nums.length - 1)
                arr[j++] = nums[i];
            else
                arr[j] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,6,8};
        int d = 2;
        int[] result = FindKthElement.findKthElement(arr, d);
        for(int a : result){
            System.out.print(a);
        }
    }
}
