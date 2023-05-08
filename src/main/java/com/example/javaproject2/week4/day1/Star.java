package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("%s","*");
        }
    }
}
