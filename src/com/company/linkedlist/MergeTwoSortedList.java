package com.company.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList {
    public static Node mergeSortedist(Node node1, Node node2){
        List<Integer> list = new ArrayList<>();
        while (node1 != null){
            list.add(node1.data);
            node1 = node1.next;
        }
        while (node2 != null){
            list.add(node2.data);
            node2 = node2.next;
        }
        Collections.sort(list);
        Node node = new Node(0);
        Node curr = node;

        for (int val  : list){

                curr.next = new Node(val);
                curr = curr.next;

        }
        return node.next;
//        System.out.println(curr);

    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(4);

        Node node2 = new Node(1);
        node2.next = new Node(3);
        node2.next.next = new Node(4);

        Node list = mergeSortedist(node1, node2);

        printNode(list);

    }
    public static void printNode(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
