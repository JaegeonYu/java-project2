package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long g = sc.nextLong();
        long b  = sc.nextLong();
        double f = (double)r*g*b/8/1024/1024;

        System.out.printf("%.2f MB",f);
    }
}
