package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;

    public void moveLeft(){
        location = location -1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public void moveRight(){
        location = location +1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable si = new SpaceInvadersMemberVariable();
        si.moveLeft();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        System.out.printf("최종 위치 : %d", si.location);
    }
}
