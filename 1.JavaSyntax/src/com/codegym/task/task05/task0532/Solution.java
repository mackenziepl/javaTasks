package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(reader.readLine());
        int [] tab = new int [quantity];
        for(int i = 0; i < quantity; i++) {
            int maximum = Integer.parseInt(reader.readLine());
            tab[i] = maximum;
            maximum = 0;
        }
        Arrays.sort(tab);

        System.out.println(tab[quantity-1]);
        reader.close();
    }
}
