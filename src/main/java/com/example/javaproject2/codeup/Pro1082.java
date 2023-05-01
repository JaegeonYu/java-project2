package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valStr = sc.next();
        int val = Integer.parseInt(valStr, 16);

        for(int i=1;i<16;i++){
            System.out.printf("%s*%x=%x\n", valStr, i,val*i);
        }

    }
}
