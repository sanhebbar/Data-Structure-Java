package com.company.tree;

public class GreaterSumTree {
  private   int sum = 0;
    public  void greatSumTree(Node tree){
        if(tree == null){
            return;
        }
        greatSumTree(tree.right);
        sum +=tree.data;
        tree.data = sum;
        greatSumTree(tree.left);
    }
    public static void main(String[] args) {
        Node tree = new Node(11);
        tree.left = new Node(2);
        tree.right = new Node(15);
        tree.left.left = new Node(1);
        tree.left.right = new Node(7);
        tree.right.right = new Node(29);
        tree.right.right.left = new Node(19);
        tree.right.right.right = new Node(35);
        tree.right.right.right.right = new Node(40);

        GreaterSumTree greaterSumTree = new GreaterSumTree();
;               greaterSumTree .greatSumTree(tree);
        printInOrder(tree);
    }
    public static void printInOrder(Node node) {
        if (node == null) return;

        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}
