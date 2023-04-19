package com.example.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }

    public void readTwoChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode = is.read();
        int asciiCode2 = is.read();
        System.out.println(asciiCode);
        System.out.println(asciiCode2);
    }
}
