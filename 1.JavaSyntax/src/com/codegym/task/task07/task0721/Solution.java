package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = 0;
        int minimum = tab[0];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tab[j] > maximum)
                    maximum = tab[j];
                if(tab[j] < minimum)
                    minimum = tab[j];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
