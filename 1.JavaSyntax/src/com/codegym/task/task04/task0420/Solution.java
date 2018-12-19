package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int x3 = Integer.parseInt(br.readLine());


        int [] tab = new int [3];
        tab[0] = x1;
        tab[1] = x2;
        tab[2] = x3;
        int temp = 0;
        for(int j=0; j < 3; j++) {
            for (int i = 0; i < 2; i++) {
                if (tab[i+1] > tab[i]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
        }
        for(int t =0; t <tab.length; t++) {
            System.out.print(tab[t] + " ");
        }

        br.close();
    }
}
