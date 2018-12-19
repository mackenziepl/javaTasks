package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int[] tab = new int[5];
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
        tab[3] = d;
        tab[4] = e;
        Arrays.sort(tab);
//        int temp = 0;
//        for(int i = 0; i < tab.length; i++) {
//            for(int j = 0; j < tab.length-1; j++) {
//                if(tab[j]> tab[j+1]) {
//                    temp = tab[j];
//                    tab[j] = tab[j+1];
//                    tab[j+1] = temp;
//                }
//            }
//        }
//        for(int t : tab) {
//            System.out.print(t+ " ");
//        }
        return tab[0];
    }
}
