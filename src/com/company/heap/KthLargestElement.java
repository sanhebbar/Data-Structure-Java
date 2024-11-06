package com.company.heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void kthLargest(int a[], int k){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int i = 0;i < k;i++){
            min.offer(a[i]);
        }
        for (int i =k;i<a.length;i++){
            if (a[i] > min.peek()){
                min.poll();
                min.offer(a[i]);
            }
        }
        System.out.println(min.peek());
    }
    public static void main(String[] args) {
        int a[] = {3,2,3,1,2,4,5,5,6}, k =4;

        KthLargestElement.kthLargest(a,k);
    }
}
