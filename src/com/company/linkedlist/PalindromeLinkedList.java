package com.company.linkedlist;

import java.util.Stack;

public class PalindromeLinkedList {
    public static boolean palindrome(Node head){
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // Compare the first and second half nodes
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

//    Node temp = head;
//    Stack<Integer> s= new Stack<>();
//    while (temp != null){
//        s.push(temp.data);
//        temp = temp.next;
//    }
//    temp = head;
//    while(temp != null){
//        if (temp.data != s.pop()) {
//            return false;
//        }
//        temp= temp.next;
//        }
//    return true;
//    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(1);

        boolean isTrue = palindrome(node);
        System.out.println(isTrue);
    }
}
