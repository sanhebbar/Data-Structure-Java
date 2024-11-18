package com.company.matrix;

public class TwoDMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,4,6},{4,5,6,6}};
        for (int i = 0;i < 3;i ++){
            for (int j = 0;j < a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}

