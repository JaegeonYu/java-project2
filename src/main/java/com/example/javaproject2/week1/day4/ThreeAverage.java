package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ThreeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("세 숫자의 평균은 : %.1f", (sc.nextInt()+sc.nextInt()+sc.nextInt())/3.0);
    }
}
