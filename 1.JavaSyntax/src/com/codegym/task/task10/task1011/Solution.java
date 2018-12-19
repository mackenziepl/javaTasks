package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";
        int i = 0;
        String s2;
        while(i<43) {
            s2 = s.substring(i, s.length());
            System.out.println(s2);
            i++;
        }
    }

}

