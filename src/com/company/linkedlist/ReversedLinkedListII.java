package com.company.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReversedLinkedListII {
    public static void reverseLinkedList(Node head, int left, int right){
        Node curr = head;
        List<Integer> list = new ArrayList<>();
        while (curr !=null){
            list.add(curr.data);
            curr = curr.next;
        }
        int i = 0, j = list.size()-1;
        while (i<j){
            if (list.get(i) == left && list.get(j) == right){
                int t = list.get(i);
                list.set(i,list.get(j));
                list.set(j, t);
                i++;
                j--;
            }else{
                if (list.get(i) != left){
                    i++;
                }
                if(list.get(j) != right){
                    j--;
                }
            }
        }
        System.out.println(list);
         head = new Node(list.get(0));
         curr = head;
         for (int index =1;index<list.size();index++){
             Node n1 = new Node(list.get(index));
             curr.next= n1;
            curr = n1;
         }
         curr = head;
         while (curr !=null){
             System.out.println(curr.data);
             curr = curr.next;
         }

    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
       node.next.next.next.next = new Node(5);
       int lval =2,rval= 4;

       reverseLinkedList(node, lval,rval);
    }
}
