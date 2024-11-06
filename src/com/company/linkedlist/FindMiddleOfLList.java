package com.company.linkedlist;

import java.util.Stack;

public class FindMiddleOfLList {
     static Node findMiddleOfLList (Node head){
        Node curr = head;
        int len =0;
         while (curr !=null){
             len++;
             curr = curr.next;
         }
         len=(len/2);
         for (int i = 0;i<len;i++){
             head = head.next;
         }
         return head;
     }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node mid = findMiddleOfLList(head);
        System.out.println(mid.data);

    }
}
