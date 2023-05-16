package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertSortGeneric <T>{
    public T[] sort(T[] arr, boolean isAscending) {
        return arr;
    }
    public T[] sort(T[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
//      int [] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'f', 'e', 'g', 'a', 'c'};
        InsertSortGeneric<Character> is = new InsertSortGeneric();
        cArr = is.sort(cArr, false);
        System.out.println(Arrays.toString(cArr));
    }
}
