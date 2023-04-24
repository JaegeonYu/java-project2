package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    public boolean isSameXy() {
        return x == y;
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.x);
    }
}
