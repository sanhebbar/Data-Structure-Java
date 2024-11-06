package com.company.linkedlist;

import java.util.Stack;

public class ReverseLList {
    static void reverseLlist(Node head){
        Node curr = head;
        Stack<Integer> stack = new Stack<>();
        while (curr != null){
            stack.push(curr.data);
            curr= curr.next;
        }
        curr = head;
        while (curr != null){
            curr.data = stack.pop();
            curr = curr.next;
        }
        while (head!=null){
            System.out.println(head.data);
            head= head.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        reverseLlist(head);

    }
}
