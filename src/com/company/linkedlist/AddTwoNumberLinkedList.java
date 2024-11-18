package com.company.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoNumberLinkedList {
    public static void addTwoNumber(Node l1, Node l2){
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        while (l1 != null) {
            a1.add(l1.data);
            l1 = l1.next;
        }

        while (l2 != null) {
            a2.add(l2.data);
            l2 = l2.next;
        }

        int max = Math.max(a1.size(), a2.size());
        int carry = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            int x = (i < a1.size()) ? a1.get(i) : 0;
            int y = (i < a2.size()) ? a2.get(i) : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            result.add(sum % 10);
        }

        if (carry > 0) {
            result.add(carry);
        }

        // Convert the result list back to a linked list
        Collections.reverse(result);
        System.out.println(result);
    }
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

       addTwoNumber(l1, l2);

    }
}
