package com.example.javaproject2.week2.day8;

public class TwoDimArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        printArray(arr);
        rowInsertOne(arr,1);
        printArray(arr);
    }
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) System.out.print(arr[i][j]);
            System.out.println();
        }
    }
    public static void rowInsertOne(int[][] arr, int rowNum){
        for(int i=0;i<arr[0].length;i++){
            arr[rowNum][i]=1;
        }
    }
}
