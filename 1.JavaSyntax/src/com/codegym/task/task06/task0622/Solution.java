package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] tab = new int[5];
        tab[0] = Integer.parseInt(reader.readLine());
        tab[1] = Integer.parseInt(reader.readLine());
        tab[2] = Integer.parseInt(reader.readLine());
        tab[3] = Integer.parseInt(reader.readLine());
        tab[4] = Integer.parseInt(reader.readLine());
        int temp = 0;
        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab.length-1; j++) {
                if(tab[j] > tab[j+1]) {
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }

        for(int t : tab) {
            System.out.println(t);
        }
    }
}