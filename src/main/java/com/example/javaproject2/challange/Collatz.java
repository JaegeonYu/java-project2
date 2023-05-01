package com.example.javaproject2.challange;

public class Collatz {
    int solution(int num) {
        int cnt = 0;
        long n = num;
        if (num == 1) return 0;
        while (n != 1 && cnt < 500) {
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            cnt++;
        }
        if (cnt == 500) return -1;
        else return cnt;
    }

    public static void main(String[] args) {
        Integer integer = 1;
        System.out.println(integer.toString());
    }
}
