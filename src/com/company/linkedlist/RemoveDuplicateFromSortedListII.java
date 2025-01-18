package com.company.linkedlist;

public class RemoveDuplicateFromSortedListII {
    public static Node removeDuplicateII(Node head){
        Node curr = head;
        Node prev = null;

        while (curr.next != null){
            if (curr.data == curr.next.data){
                prev.next = curr.next.next.next;

                curr.next = curr.next.next;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next= new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(4);
        node.next.next.next.next.next = new Node(4);
        node.next.next.next.next.next.next = new Node(5);
        //output 1->2->5

        Node result = removeDuplicateII(node);

        printRemoveList(result);

    }
    private static void printRemoveList(Node head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

}
