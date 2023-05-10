package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class HelloPrinter {
    private final Printer printer;

    public HelloPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) throws IOException {
        Printer consolePrinter = new ConsolePrinter();
        consolePrinter.doPrint(new String[]{"11","22"});
    }
}
