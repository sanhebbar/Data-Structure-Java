package com.company.linkedlist;
class Node{
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node(){

    }
}
class LList{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null){
            head = node;
        }else {
            Node node1 = head;
            while (node1.next != null){
                node1 = node1.next;
            }
            node1.next = node;
        }
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node cuurent = head;
        for (int i =0;i<index-1;i++){
            cuurent = cuurent.next;
        }
        node.next = cuurent.next;
        cuurent.next = node;
    }
    public void show(){
        Node node = head;
        while (node !=null){
            System.out.println(node.data);
            node = node.next;

        }
    }

    public void deleteAt(int index){
      if (index == 0){
          head = head.next;
      }else{
          Node current = head;
          Node n1 = null;
          for (int i =0;i<index-1;i++){
              current = current.next;
          }
          n1 = current.next;
          current.next = n1.next;
      }
    }
    public void deleteByData(int data){
        while (head != null && head.data == data) {
        head = head.next;
    }

        Node current = head;
        Node n1 = null;
        while (current != null && current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }


    }
}
public class LinkedList {
    public static void main(String[] args) {
        LList list = new LList();
        list.insert(1);
        list.insert(2);
        list.insert(6);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
//        list.insertAtStart(1);
//        list.insertAt(2,56);
//        list.deleteAt(3);


        list.deleteByData(6);
        list.show();
    }
}
