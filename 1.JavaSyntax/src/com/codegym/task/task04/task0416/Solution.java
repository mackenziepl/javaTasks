package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float x = Float.parseFloat(br.readLine());
        x = x%5;
        if(x >= 0.0 && x < 3.0)
                System.out.println("green");
        else if(x >= 3 && x < 4)
            System.out.println("yellow");
        else if(x >= 4 && x < 6)
            System.out.println("red");
        br.close();
    }
}