package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int x= 0, y=0;
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            x--; y--;
            for(int j=0;j<arr.length;j++){
                arr[x][j] = arr[x][j]== 1 ? 0 : 1;
            }
            for(int j=0;j<arr.length;j++){
                arr[j][y] = arr[j][y]== 1 ? 0 : 1;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
