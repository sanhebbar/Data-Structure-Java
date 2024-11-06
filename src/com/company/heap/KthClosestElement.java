package com.company.heap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class KthClosestElement {
    public static void kthClosest(int a[], int k, int x){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((num1, num2) -> {
            int dist1 = Math.abs(num1 - x);
            int dist2 = Math.abs(num2 - x);
            return Integer.compare(dist2, dist1); // Max-heap based on distance
        });

        for (int num : a) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the farthest element if size exceeds k
            }
        }

        // Collecting the k closest elements
        Integer[] closestElements = new Integer[k];
        for (int i = 0; i < k; i++) {
            closestElements[i] = maxHeap.poll();
        }

        // Print the k closest elements
        for (int element : closestElements) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        int k = 4,x = 3;
        KthClosestElement.kthClosest(a,k,x);
    }
}
