package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        double total = h*b*c*s;
        double result = ((total/8)/Math.pow(2, 10)/Math.pow(2, 10));
        System.out.format("%.1f MB",result);
    }
}
