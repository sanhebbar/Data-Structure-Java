package com.company.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void kthSmallest(int a[], int k){
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i =0;i<k;i++){
            max.offer(a[i]);
        }
        for (int i =k;i<a.length;i++){
            if(a[i] < max.peek()){
                max.poll();
                max.offer(a[i]);
            }
        }
        System.out.println(max.peek());
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k = 3;
        KthSmallestElement.kthSmallest(arr,k);
    }
}
