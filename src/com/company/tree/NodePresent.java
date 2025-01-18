package com.company.tree;

import java.util.ArrayList;
import java.util.List;

public class NodePresent {
    public static void present(Node root, List<Integer> l){
        if (root == null) {
            return;
        }

        // Add current node's data
        l.add(root.data);

        // Check and visit left child
        if (root.left == null) {
            l.add(-1);  // If the left child is null, add -1
        } else {
            present(root.left, l);  // Otherwise, recursively visit the left child
        }

        // Check and visit right child
        if (root.right == null) {
            l.add(-1);  // If the right child is null, add -1
        } else {
            present(root.right, l);  // Otherwise, recursively visit the right child
        }

    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.right.left = new Node(5);
        node.right.right = new Node(6);
        node.left.left.right = new Node(7);
        List<Integer> l = new ArrayList<>();
        present(node,l);
        System.out.println(l);
    }
}
