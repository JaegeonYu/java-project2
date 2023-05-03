package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val == 0 || val ==1){
            System.out.println("not prime");
            return;
        }

        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(val) ; i++) {
            if(val%i == 0) {
              flag = false;
              break;
            }
        }

        if(flag) System.out.println("prime");
        else System.out.println("not prime");
    }
}
