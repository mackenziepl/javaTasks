package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if((x%4==0 && x%100!=0) || x%400==0)
            x=366;
        else
            x=365;
            System.out.println("Number of days in the year: " + x);
        br.close();
    }
}