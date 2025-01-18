package com.company.thread;
class MyTHread extends Thread{
    public void run(){
        for (int i =0;i<5;i++){
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        MyTHread m = new MyTHread();
        m.start();
        System.out.println("started");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
