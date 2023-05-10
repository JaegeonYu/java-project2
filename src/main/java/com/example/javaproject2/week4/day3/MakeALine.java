package com.example.javaproject2.week4.day3;

public class MakeALine {
    public static String getRepeat(String symbol, int n){
        return symbol.repeat(n);
    }
    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot){
            return String.format("%s%s\n", getRepeat("0", pivot - i), getRepeat("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeat("0", i - pivot), getRepeat("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h= 7;
        for(int i=0;i<h;i++){
            System.out.println(makeALine(h,i));
        }
    }
}
