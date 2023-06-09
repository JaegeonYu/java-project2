package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(arr[i], min);
        }

        System.out.println(min);
    }
}
