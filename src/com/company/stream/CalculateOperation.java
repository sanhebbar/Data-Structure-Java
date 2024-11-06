package com.company.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class CalculateOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,30,29,67,90,45);
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        IntSummaryStatistics s = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        int minn = s.getMin();
        int max = s.getMax();
        long sum = s.getSum();
        double avg = s.getAverage();
        long c = s.getCount();

    }
}
