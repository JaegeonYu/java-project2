package com.example.javaproject2.week4.day4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalParser {
    List<Hospital> hospitals = new ArrayList<>();
    private String path = "E:\\hospital\\hospitalInfofo.txt";

    public void readFile()  {
        try(BufferedReader br = new BufferedReader
                (new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
            parseHospital(br);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void parseHospital(BufferedReader br) {
        hospitals = br.lines().map(line -> {
            String[] split = line.split(",");
            return new Hospital(split[1], split[9], split[10]);
        }).collect(Collectors.toList());
    }

    public void printHospital(int index){
        if(hospitals.get(index) != null){
            System.out.println(hospitals.get(index));
        }else {
            System.out.println("등록되지 않은 병웝입니다.");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        HospitalParser hospitalParser = new HospitalParser();
        hospitalParser.readFile();
        hospitalParser.printHospital(2);

    }
}
