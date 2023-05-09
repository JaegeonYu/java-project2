package com.example.javaproject2.week4.day2;

import java.util.Arrays;

public class Oop1098 {
    private int[][] arr;
    private boolean printSeparator;

    public Oop1098(int rowCnt, int colCnt){
        this.arr = new int[rowCnt][colCnt];
    }
    public Oop1098() {
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public Oop1098(boolean printSeparator) {
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }



    public void setBeam(int l, int direction, int x, int y) {
        for (int i = 0; i < l; i++) {
            if(direction == 0){ // 가로
                arr[y - 1][x + i - 1] = 1;
            } else { // 세로
                arr[y + i - 1][x - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        Oop1098 c1098 = new Oop1098(rowCnt, colCnt);
        c1098.printArr();
        c1098.setBeam(2, 0, 1, 1);
        c1098.printArr();
        c1098.setBeam(3, 1, 2, 3);
        c1098.printArr();
    }

}
