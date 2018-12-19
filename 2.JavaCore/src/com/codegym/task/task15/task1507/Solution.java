package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading

*/

public class Solution {
    public static void main(String[] args) {

        printMatrix(2, 3, "8");
        printMatrix(1,"3");
        printMatrix("4");
        printMatrix(1);
        printMatrix(1.0d);
        printMatrix(1.0f);
        printMatrix(1.0f, 3.0f);
        printMatrix(1.0f, 3.0f, "9");
        printMatrix(1.0d, 3.0d, "0");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, String value) {
        int n = 3;
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(String value) {
        int m = 1, n = 3;
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m) {
        int n = 3; String value = "5";
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(double m) {
        int n = 3; String value = "6";
        printMatrix((int) m, n, (Object) value);
    }

    public static void printMatrix(float m) {
        int n = 3; String value = "7";
        printMatrix((int) m, n, (Object) value);
    }

    public static void printMatrix(float m, float n) {
        String value = "8";
        printMatrix((int) m, (int) n, (Object) value);
    }

    public static void printMatrix(float m, float n, String value) {
        printMatrix((int) m, (int) n, (Object) value);
    }

    public static void printMatrix(double m, double n, String value) {
        printMatrix((int) m, (int) n, (Object) value);
    }
}
