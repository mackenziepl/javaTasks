package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tab = new int[15];
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < tab.length; i++) {
            if(i!=0) {
                if (i % 2 == 0)
                    countEven += tab[i];
                else
                    countOdd += tab[i];
            }
        }

        System.out.println(countEven +"   " + countOdd);

        if(countEven > countOdd)
            System.out.println("Even-numbered houses have more residents.");
        else
            System.out.println("Odd-numbered houses have more residents.");
    }
}
