package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt(); //
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();


        System.out.println(val3 > (val1 > val2 ? val2 : val1) ? (val1 > val2 ? val2 : val1) : val3);
    }
}
