package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1096 {
    public static void main(String[] args) {
        int[][] arr = new int[19][19];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            arr[x][y] = 1;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
