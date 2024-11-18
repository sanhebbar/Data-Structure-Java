package com.company.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
    public static void oddEven(Node node){
        List<Integer> list = new ArrayList<>();
        Node curr = node;
        while (curr != null){
            if (curr.data % 2 != 0){
                list.add(curr.data);
            }
            curr = curr.next;
        }
        curr = node;
        while (curr != null){
            if (curr.data % 2 == 0){
                list.add(curr.data);
            }
            curr = curr.next;
        }
        System.out.println(list);

        Node dummy = new Node(0);
        curr = dummy;
        for (int l : list){
           curr.next = new Node(l);
           curr = curr.next;
        }
        curr = dummy.next;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);

        oddEven(node);
    }
}
