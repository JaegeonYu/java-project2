package com.example.javaproject2.week4.day4;

public class User {
    String name;
    String phoneNumber;
    int age;

    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }


    boolean isAdult() {
        return age >= 18;
    }

}
