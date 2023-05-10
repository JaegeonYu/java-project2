package com.example.javaproject2.week4.day3;

public class ConsolePrinter implements Printer {
    @Override
    public void doPrint(String[] messages) {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
