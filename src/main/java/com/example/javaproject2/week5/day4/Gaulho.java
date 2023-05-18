package com.example.javaproject2.week5.day4;

public class Gaulho {

        public static void main(String[] args) {
            String s = "(())()";

            while (s.contains("()")) s = s.replace("()", "");
            if (s.isEmpty()) System.out.println(true);
            else System.out.println(false);
        }

}
