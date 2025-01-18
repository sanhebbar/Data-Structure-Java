package com.company.DoublyLL;

import java.awt.dnd.InvalidDnDOperationException;

class Dnode{
    int data;
    Dnode next;
    Dnode prev;

    public Dnode(int data, Dnode next, Dnode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public Dnode(int data){
        this.data = data;
        this.next=this.prev = null;
    }
}
public class DoublyLinkedList {
  public  static Dnode convertArrToDLL(int[] arr){
        Dnode head = new Dnode(arr[0]);
        Dnode prev = head;
        for (int i =1 ;i<arr.length;i++){
            Dnode temp = new Dnode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
//      for(int i = 1;i<arr.length;i++){
//          Dnode curr = new Dnode(arr[i]);
//          curr.next = null;
//          curr.prev= prev;
//          prev.next = curr;
//          prev = curr;
//      }
        return head;
    }
public static void printList(Dnode head){
      while (head!=null){
          System.out.println(head.data + " ");
          head = head.next;
      }
}

    public static Dnode deleteHead(Dnode head) {
        if (head == null) return null;
        if (head.next == null) return null;
        Dnode curr = head;
        head = head.next;
        head.prev = null;
        curr.next = null;
        return head;
    }

    public static Dnode deleteTail(Dnode head){
      if (head == null ||  head.next == null){
          return null;
      }
      Dnode curr = head;
      while (curr.next !=null){
          curr= curr.next;
      }
      Dnode newTail = curr.prev;
      newTail.next = null;
      curr.prev = null;
      return head;
    }

    public static Dnode deleteKthElement(Dnode head, int k){
        if (head == null) return null;
        if (k <= 0) return head; // Invalid position
        int c = 1;
        Dnode curr = head;
        while (curr != null && c < k) {
            curr = curr.next;
            c++;
        }
        if (curr == null) return head; // k is greater than the length of the list
        if (curr.prev == null) return deleteHead(head); // Deleting the head
        if (curr.next == null) return deleteTail(head); // Deleting the tail
        Dnode prev = curr.prev;
        Dnode front = curr.next;
        prev.next = front;
        front.prev = prev;
        curr.next = curr.prev = null;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8};

        Dnode  head =  convertArrToDLL(arr);
        //printList(head);


        head = deleteHead(head);
      //printList(head);

        head = deleteTail(head);
        //printList(head);

        head = deleteKthElement(head, 3);
        printList(head);


    }
}
