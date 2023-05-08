package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        if (first == second) System.out.println("tie");
        else if ((first == 0 && second == 2) || (first == 1 && second == 0) || (first == 2 && second == 1))
            System.out.println("lose");
        else
            System.out.println("win");
    }
}
