package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,2,1,6,4};

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
