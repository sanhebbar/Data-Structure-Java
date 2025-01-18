package com.company.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateOperation {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,30,29,67,90,45);
//        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
//        IntSummaryStatistics s = list.stream().mapToInt(Integer::intValue).summaryStatistics();
//        int minn = s.getMin();
//        int max = s.getMax();
//        long sum = s.getSum();
//        double avg = s.getAverage();
//        long c = s.getCount();

        List<Integer> l1 = Arrays.asList(2,5,4,6,8,9);
        List<Integer> val = l1.stream().filter(n->n %2 ==0).collect(Collectors.toList());
        System.out.println(val);
    }
}
