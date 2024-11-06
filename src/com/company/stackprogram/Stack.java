package com.company.stackprogram;
class StackProgram{
    int[] stack = new int[5];
    int top = -1;

    public void push(int data){
        stack[++top] = data;
    }
    public int pop(){
        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }
    public boolean isFull(){
        if (top == stack.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("value is not there");
        }else {
            for (int i =0;i<stack.length-1;i++){
                System.out.println(stack[i]);
            }
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        StackProgram sp = new StackProgram();
        sp.push(2);
        sp.push(67);
        sp.push(55);
        sp.push(5);
        sp.push(3);

        System.out.println( "pop" + sp.pop());
        System.out.println("peek" + sp.peek());
        sp.display();

    }
}
