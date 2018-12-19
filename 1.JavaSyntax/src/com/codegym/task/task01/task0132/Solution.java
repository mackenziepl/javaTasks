package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String num = Integer.toString(number);
        int x = 0;
        for (int i = 0; i < num.length(); i++) {
            x += (num.codePointAt(i) - 48);
        }
        return x;
    }
}