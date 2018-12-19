package com.codegym.task.task04.task0428;

/* 
Positive number

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
        if(countNegative==3) {
            System.out.println(0);
        }
        else
            System.out.println(countPositive);

        br.close();
    }
}
