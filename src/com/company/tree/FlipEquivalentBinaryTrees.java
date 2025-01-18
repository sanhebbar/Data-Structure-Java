package com.company.tree;

public class FlipEquivalentBinaryTrees {
    public static boolean flipFlop(Node root1, Node root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null || root2 == null || root1.data != root2.data){
            return false;
        }
        boolean val = flipFlop(root1.left, root2.right) && flipFlop(root1.right , root2.left);
        boolean val1 = flipFlop(root1.left,root2.left) && flipFlop(root1.right, root2.right);
        return val || val1;
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.left = new Node(7);
        root1.left.right.right = new Node(8);
        root1.right.left = new Node(6);

        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.left.right = new Node(6);
        root2.right.left = new Node(4);
        root2.right.right = new Node(5);
        root2.right.right.left = new Node(8);
        root2.right.right.right = new Node(7);

        boolean result1 = flipFlop(root1, root2);
        System.out.println(result1);

        Node node1 = null;
        Node node2 = null;
        boolean result2 = flipFlop(node1, node2);
        System.out.println(result2);

        Node n1= null;
        Node n2 = new Node(1);
        boolean result3 = flipFlop(n1, n2);
        System.out.println(result3);

    }
}
