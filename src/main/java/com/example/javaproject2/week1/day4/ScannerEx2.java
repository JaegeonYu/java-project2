package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하시오.");
        System.out.println("첫번째 숫자 :");
        System.out.println("첫번째 숫자는 " + sc.nextInt()+"입니다");
        System.out.println("두번째 숫자 :");
        System.out.println("두번째 숫자는 " + sc.nextInt()+"입니다");
    }
}
