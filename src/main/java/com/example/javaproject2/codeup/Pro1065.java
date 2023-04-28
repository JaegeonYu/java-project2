package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2== 0)
                System.out.println(arr[i]);
        }
    }
}
