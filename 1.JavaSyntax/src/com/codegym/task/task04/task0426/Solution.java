package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        if(x>0) {
            if(x%2==0)
                System.out.println("Positive even number");
            else
                System.out.println("Positive odd number");
        }
        else if(x<0) {
            if(abs(x)%2==0)
                System.out.println("Negative even number");
            else
                System.out.println("Negative odd number");
        }
        else
            System.out.println("Zero");

        br.close();
    }
}
