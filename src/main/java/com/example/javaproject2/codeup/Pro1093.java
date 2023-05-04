package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[24];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            answer[arr[i]]++;
        }
        for (int i = 1; i < 24; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
