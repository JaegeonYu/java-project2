package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro4956 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;

        int maxValue = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int now = sc.nextInt();
                if(maxValue < now){
                    maxValue = now;
                    x = j;
                    y = i;
                }
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d", y, x);
    }
}
