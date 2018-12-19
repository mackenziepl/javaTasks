package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x!=0) {
            int y = x / 10;

            if (y >= 0 && y < 1) {
                if (x % 2 == 0)
                    System.out.println("even single-digit number");
                else
                    System.out.println("odd single-digit number");
            } else if (y >= 1 && y < 10) {
                if (x % 2 == 0)
                    System.out.println("even two-digit number");
                else
                    System.out.println("odd two-digit number");
            } else if (y >= 10 && y < 100) {
                if (x % 2 == 0)
                    System.out.println("even three-digit number");
                else
                    System.out.println("odd three-digit number");
            }
        }
        br.close();
    }
}
