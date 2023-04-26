package com.example.javaproject2.week2.day8;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        System.out.println(students[0]); // null
        System.out.println(students[1]); // null
        System.out.println(students[0].age); // NullPointerException 발생
    }
}
