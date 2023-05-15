package com.example.javaproject2.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortOOP {
    private Comparator<Integer> comparator;

    public BubbleSortOOP(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }
    public int[] sort(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            arr = sortAround(arr, arr.length-i);
        }
        return arr;
    }

    private int[] sortAround(int[] arr, int until) {
        for(int i=0;i<until;i++){
            if(comparator.compare(arr[i], arr[i+1])>0){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        BubbleSortOOP bubbleSortOOP = new BubbleSortOOP(comparator);
        int[] arr ={7,2,3,9,28,11};
        arr = bubbleSortOOP.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
