package com.example.javaproject2.week5.day3;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value) {
        arr[pointer++] = value;
        System.out.println(pointer);
    }

    public void push2(int value) {
        this.arr[pointer] = value;
        this.pointer++;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException();
        return this.arr[--pointer];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }
}
