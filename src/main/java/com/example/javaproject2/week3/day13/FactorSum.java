package com.example.javaproject2.week3.day13;

public class FactorSum {
    public static void main(String[] args) {
        int n = 36;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.printf("약수의 합은 %d",sum);
    }
}
