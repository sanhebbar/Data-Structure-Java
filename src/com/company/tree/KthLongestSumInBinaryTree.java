package com.company.tree;

import java.util.*;

public class KthLongestSumInBinaryTree {
    public static long kthLongestSum(Node root, int k){
        if (root == null) {
            return -1;
        }

        List<Long> levelSums = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            long sum = 0;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                sum += node.data;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levelSums.add(sum);
        }

        Collections.sort(levelSums, Collections.reverseOrder());

        if (k > levelSums.size()) {
            return -1;
        }

        return levelSums.get(k - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1); // Using the existing Node class
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int k =2;
        long l = KthLongestSumInBinaryTree.kthLongestSum(root,k );
        System.out.println(l);

    }
}
