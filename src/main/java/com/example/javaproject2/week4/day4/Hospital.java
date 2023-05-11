package com.example.javaproject2.week4.day4;

public class Hospital {
    private String name;
    private String zipcode;
    private String address;


    public Hospital(String name, String phoneNumber, String address) {
        this.name = name;
        this.zipcode = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",name, zipcode, address);
    }
}
