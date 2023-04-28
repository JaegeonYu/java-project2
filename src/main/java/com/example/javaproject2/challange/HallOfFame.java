package com.example.javaproject2.challange;

import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < answer.length; i++) {
            if (i > k - 1) {
                if (score[i] > Q.peek()) {
                    Q.poll();
                    Q.offer(score[i]);
                }
            } else {
                Q.offer(score[i]);
            }
            answer[i] = Q.peek();
        }
        return answer;
    }
}
