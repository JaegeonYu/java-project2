package com.example.javaproject2.week4.day1;

public class Gugudan {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
