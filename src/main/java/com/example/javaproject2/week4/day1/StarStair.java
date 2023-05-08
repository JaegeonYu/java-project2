package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class StarStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String stair = "**";
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.printf(" ");
            }
            System.out.printf(stair+"\n");
        }
    }
}
