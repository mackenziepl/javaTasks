package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        double x = (double) a / (double) b;
        return x;
    }

    public static double percent(int a, int b) {
        double x = (double) b*((double) a/100);
        return x;
    }

    public static void main(String[] args) {
        double x1 = Calculator.divide(10,3);
        double x2 = Calculator.percent(10, 100 );
        System.out.println(x1);
        System.out.println(x2);
    }
}