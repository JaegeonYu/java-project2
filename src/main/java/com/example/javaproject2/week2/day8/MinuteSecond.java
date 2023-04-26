package com.example.javaproject2.week2.day8;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 244;
        int minute = seconds / 60;
        int remainSecond = seconds % 60;
        System.out.printf("%d분 %d초", minute, seconds);
    }
}
