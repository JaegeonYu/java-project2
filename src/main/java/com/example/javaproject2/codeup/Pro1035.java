package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(Integer.toOctalString(Integer.parseInt(s, 16)));
    }
}
