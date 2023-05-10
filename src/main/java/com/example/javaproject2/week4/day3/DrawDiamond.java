package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeat(String symbol, int n){
        return symbol.repeat(n);
    }
    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if(i <= pivot){
                System.out.printf("%s%s\n", getRepeat(" ", -2 + h - i - 2), getRepeat("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getRepeat(" ", i - pivot), getRepeat("*", 2 * (h - i) - 1));
            }
        }

    }
}
