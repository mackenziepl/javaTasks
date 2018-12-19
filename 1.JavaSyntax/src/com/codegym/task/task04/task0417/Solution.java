package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        if(x1 == x2) {
            if(x1 == x3)
                System.out.println(x1 + " " + x2 + " " + x3);
            else
                System.out.println(x1 + " " + x2);
        }
        else if(x1 == x3)
        System.out.println(x1 + " " + x3);
        else if(x2 == x3)
            System.out.println(x2 + " " + x3);
        scanner.close();
    }
}