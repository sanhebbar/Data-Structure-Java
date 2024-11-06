package com.company.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] a){
        int t[] = new int[a.length];
        int k =0;
        for(int i=a.length-1;i>0;i-- ){
            t[k] = a[i];
            k++;
        }
        return t;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,-5,6,8};
        int[] result = RotateArray.rotateArray(arr);
        for(int a : result){
            System.out.println(a);
        }
    }
}
