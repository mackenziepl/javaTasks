package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int x3 = Integer.parseInt(br.readLine());

        int[] tab = new int[3];
        tab[0] = x1;
        tab[1] = x2;
        tab[2] = x3;
        int countPositive = 0;
        int countNegative = 0;
        for(int i = 0; i < tab.length; i++) {
            if (tab[i]!=0) {
                if (tab[i] > 0)
                    countPositive++;
                else
                    countNegative++;
            }
        }

        System.out.println("Number of negative numbers: " + countNegative);
        System.out.println("Number of positive numbers: " + countPositive);

        br.close();
    }
}
