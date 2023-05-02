package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String valStr = "X";
        for (int i = 1; i <=val; i++) {

            if (i == 3 ||i == 6 ||i == 9  ) {
                System.out.print(valStr+" ");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}
