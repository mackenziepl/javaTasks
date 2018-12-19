package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] tab1 = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for(int i = 0; i < tab1.length; i++) {
            tab1[i] = Integer.parseInt(br.readLine());
        }

        int l =0;
        for(int i = 0; i < tab1.length; i++) {
            if(i<10) {
                array1[i] = tab1[i];
            } else {
                array2[l] = tab1[i];
                l++;
            }
        }

        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
