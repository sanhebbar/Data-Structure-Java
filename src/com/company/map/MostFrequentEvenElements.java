package com.company.map;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElements {
    public static void frquentEvenelement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        int maxCurr=0;
        for(int n : nums){
            if (n %2 ==0){
                map.put(n, map.getOrDefault(n, 0)+1);
                int freq = map.get(n);
                if ( freq> maxCurr || (freq == maxCurr && n < result)){
                    maxCurr = freq;
                    result = n;
                }

            }
        }


        System.out.println(map);
        System.out.println(result);
    }
    public static void main(String[] args) {
//        Example 1:
//        Input: nums = [0,1,2,2,4,4,1]
//        Output: 2
//        Explanation:
//        The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
//                We return the smallest one, which is 2.
//        Example 2:
//        Input: nums = [4,4,4,9,2,4]
//        Output: 4
//        Explanation: 4 is the even element appears the most.
//                Example 3:
//        Input: nums = [29,47,21,41,13,37,25,7]
//        Output: -1
//        Explanation: There is no even element.


        int nums[] = {0,1,2,2,4,4,1};

        frquentEvenelement(nums);
    }
}
