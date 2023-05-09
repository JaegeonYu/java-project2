package com.example.javaproject2.week4.day2;

public class paralleloDrawer extends ShapeDrawer {
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(h));
    }
}
