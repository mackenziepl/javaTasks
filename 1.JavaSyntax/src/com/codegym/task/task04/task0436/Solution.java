package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        char z = 56;
        for(int i = 0; i < x; i++) {
            for(int j = 0; j< y; j++) {
                System.out.print(z);
            }
            System.out.println();
        }
        br.close();
    }
}
