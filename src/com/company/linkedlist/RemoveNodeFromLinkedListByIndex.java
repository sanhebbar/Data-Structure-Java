package com.company.linkedlist;

public class RemoveNodeFromLinkedListByIndex {
    public static Node removeByIndexFromLast(Node head, int pos){
    if (pos == 0){
        return head.next;
    }
    Node curr = head;
    int len =0;
    while(curr !=null){
        len++;
        curr = curr.next;
    }
    curr = head;
    for(int i =0;i <len-pos;i++){
        curr = curr.next;
    }
    curr.next = curr.next.next;
    return head;
    }
    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(4);
        node.next.next = new Node(6);
        node.next.next.next = new Node(8);
        node.next.next.next.next = new Node(11);
        node.next.next.next.next.next = new Node(10);
        int index = 2;

        node = removeByIndexFromLast(node, index);

        Node curr = node;
        while (curr !=null){
            System.out.println(curr.data);
            curr = curr.next;
        }

    }
}
