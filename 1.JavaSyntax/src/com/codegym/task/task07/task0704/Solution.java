package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(rd.readLine());
        }

        for(int i = 9; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }
}

