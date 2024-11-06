package com.company.Arrays;

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
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int x = 55;
        int[] arr = {2,1,4,-5,6,8};

        boolean result = twoSum.findTwoSum(arr,x);
        System.out.println(result);

    }

}
