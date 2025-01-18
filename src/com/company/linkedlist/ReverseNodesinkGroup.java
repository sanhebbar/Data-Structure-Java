package com.company.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesinkGroup {
    public static void reverseNode(Node head, int k){
        List<Integer> list = new ArrayList<>();

        for (Node curr = head; curr!=null;curr = curr.next){
            list.add(curr.data);
        }
       for (int i =0;i+k<list.size();i+=k){
           int l = i, r = i+k-1;
           while (l <r){
               int t = list.get(l);
               list.set(l, list.get(r));
               list.set(r,t);
               l++;
               r--;
           }
       }
        System.out.println(list);
       Node curr = head;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);

        int k =2;
        reverseNode(node, k);

    }
}
