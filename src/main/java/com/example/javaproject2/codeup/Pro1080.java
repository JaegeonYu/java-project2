package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int sum = 0;
        int i=0;
        for(;sum<val;i++){
            sum += i;
        }
        System.out.println(--i);
    }
}
