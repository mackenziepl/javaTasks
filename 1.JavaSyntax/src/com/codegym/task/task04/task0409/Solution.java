package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(22, -1);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int x = a - 10;
        int y = b - 10;
        if(Solution.abs(x) < Solution.abs(y))
            System.out.println(a);
        else
            System.out.println(b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}