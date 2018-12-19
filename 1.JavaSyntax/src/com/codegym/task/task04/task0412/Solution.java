package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x > 0)
            System.out.println(x+x);
        else if(x < 0)
            System.out.println(x+1);
        else
            System.out.println(0);
        scanner.close();
    }

}