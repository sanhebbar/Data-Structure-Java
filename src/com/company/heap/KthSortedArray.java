package com.company.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSortedArray {
    public static void kthSorted(int[] a, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k + 1);
        int n = a.length;

        int arr[] = new int[a.length];
        // Add the first k + 1 elements to the min-heap
        for (int i = 0; i < Math.min(k + 1, n); i++) {
            minHeap.offer(a[i]);
        }

        // Index to place sorted elements
        int index = 0;

        // Process the rest of the array
        for (int i = k + 1; i < n; i++) {
            // Get the smallest element from the heap and add it to the sorted position
            arr[index++] = minHeap.poll();
            // Add the current element to the min-heap
            minHeap.offer(a[i]);
        }

        // Extract the remaining elements from the min-heap
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int a[] = {6,5,3,2,8,10,9}, k = 3;
        KthSortedArray.kthSorted(a, k);


    }
}
