package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        if(x1 + x2 > x3) {
            if(x1 < x2 + x3 && x2 < x1 + x3)
                System.out.println("The triangle is possible.");
            else
                System.out.println("The triangle is not possible.");
        }
        else if(x1 + x3 > x2) {
            if(x1 < x2 + x3 && x3 < x1 + x2)
                System.out.println("The triangle is possible.");
            else
                System.out.println("The triangle is not possible.");
        }
        else if(x2 + x3 > x1) {
            if(x2 < x1 + x3 && x3 < x1 + x2)
                System.out.println("The triangle is possible.");
            else
                System.out.println("The triangle is not possible.");
        }
        else
            System.out.println("The triangle is not possible.");
        scanner.close();
    }
}