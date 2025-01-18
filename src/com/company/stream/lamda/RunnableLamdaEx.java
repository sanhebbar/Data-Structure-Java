package com.company.stream.lamda;

import java.util.Comparator;

public class RunnableLamdaEx {
    public static void main(String[] args) {
// lamda syntac

// syntax () -> {}
//        Runnable runnable = () ->{
//            System.out.println("runnable");
//        };
//        new Thread(runnable).start();
//
//        new Thread(() -> System.out.println("runnable in new thread directly")).start();


  // comparator
        Comparator <Integer> comparator = (Integer a, Integer b) ->a.compareTo(b);
        System.out.println("comprataor example: " + comparator.compare(2,4));

        Comparator <Integer> comparator1 = ( a,  b) ->a.compareTo(b);
        System.out.println("Comparator1  example: " + comparator1.compare(2,5));


    }
}
