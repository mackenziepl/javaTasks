package com.codegym.task.task15.task1523;

/* 
Overloading constructors

*/

public class Solution {
    private int x;
    private String s;

    public Solution() {}

    Solution(int x) {
        this.x = x;
    }

    protected Solution(String s) {
        this.s = s;
    }

    private Solution(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public static void main(String[] args) {

    }
}

