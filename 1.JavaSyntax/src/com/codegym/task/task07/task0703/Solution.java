package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tab1 = new String[10];
        int[] tab2 = new int[10];

        for(int i = 0; i < tab1.length; i++) {
            tab1[i] = br.readLine();
            tab2[i] = tab1[i].length();
        }

        for(int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }
    }
}
