package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.next();

        for(String x : values.split("[.]")) System.out.println(x);

    }
}
