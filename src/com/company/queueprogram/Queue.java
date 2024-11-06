package com.company.queueprogram;
class QueueProgram{
    int queue[] = new int[5];
    int size, front, rear;
    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear+1)%5;
        size++;
    }
    public int deQueue(){
        int data = queue[front];
        front = (front +1)%5;
        size--;
        return data;
    }
    public void display(){
        for (int i =0;i<size;i++){
            System.out.println(queue[(front + i) % 5] + " ");
        }
    }
}
public class Queue {
    public static void main(String[] args) {
        QueueProgram qp = new QueueProgram();
        qp.enQueue(3);
        qp.enQueue(13);
        qp.enQueue(73);
        qp.enQueue(38);
        qp.deQueue();
        qp.enQueue(73);
        qp.enQueue(38);
        qp.enQueue(38);
        qp.enQueue(73);
        qp.enQueue(38);
        qp.enQueue(38);
        qp.display();

    }
}
