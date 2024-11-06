package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LL {
Node head;
private int size;
LL(){
    this.size=0;
}
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //adding list
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
// adding last in the list
    public void addLast(String data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node cNode=head;
        while (cNode.next!=null){
            cNode=cNode.next;
        }
        cNode.next=newNode;
    }
    //printing
    public void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node cNode=head;
        while (cNode!=null){
            System.out.print(cNode.data+" -> ");
            cNode=cNode.next;
        }
        System.out.println("null");
    }
    //deletefirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondNode=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondNode=secondNode.next;
        }
        secondNode.next=null;
    }
    public int getSize(){
    return size;
    }
    public void reverseList(){
    Node pnode = head;
    Node cnode=head.next;
    while (cnode!=null){
        Node next=cnode.next;
        cnode.next=pnode;
        //update
        pnode=cnode;
        cnode=next;
    }
    head.next=null;
    head=pnode;
    }
    public static void main(String[] args) {
        // write your code here
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("b");
        list.display();
        list.addLast("c");
        list.addLast("d");
        list.display();
        System.out.println(list.getSize());
        list.reverseList();
        list.display();
//        var name=12;
//        System.out.println(name);

//        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
//        for(int i:list1){
//            System.out.println(i);
//        }
    }
}

