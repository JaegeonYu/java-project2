package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FilePrinter implements Printer{
    @Override
    public void doPrint(String[] messages) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(".aaa.txt"));
        for(String message: messages){
            bw.write(message);
        }
        bw.flush();
        bw.close();
    }
}
