package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.println(i + " " + j + " " + k);
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
