package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        for(int i=1;i<=val1;i++){
            for(int j=1;j<=val2;j++) System.out.println(i +" "+j);
        }
    }
}
