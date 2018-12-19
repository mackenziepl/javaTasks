package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());

        if(age>20)
            System.out.println("18 is old enough");

        br.close();
    }
}
