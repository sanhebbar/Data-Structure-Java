package com.company.linkedlist;

import java.util.Stack;

public class ReverseLinkedistGivenGroupSize {
    public static void reverseList(Node head, int k){
        Node temp = head;
        Stack<Integer> s = new Stack<>();

        // First, push all the values into the stack
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        // Reverse the first k nodes
        for (int i = 0; i < k && temp != null; i++) {
            temp.data = s.pop();
            temp = temp.next;
        }

        // Continue with the rest of the list
        while (temp != null) {
            temp.data = s.pop();
            temp = temp.next;
        }

        // Print the modified linked list
        printList(head);
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        reverseList(head, 2);
    }
}
