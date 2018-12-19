package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] tab = new int [20];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(br.readLine());
        }
        return tab;
    }

    public static int max(int[] array) {
        int high = array[0];
        for(int i = 0; i < array.length-1; i++) {
            if(high < array[i+1])
                high = array[i+1];
        }
        return high;
    }
}
