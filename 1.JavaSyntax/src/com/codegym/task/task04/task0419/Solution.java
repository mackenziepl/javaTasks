package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int x3 = Integer.parseInt(br.readLine());
        int x4 = Integer.parseInt(br.readLine());
        int [] tab = new int [4];
        tab[0] = x1;
        tab[1] = x2;
        tab[2] = x3;
        tab[3] = x4;

        int max = tab[0];

        for(int i=0; i<4; i++) {
            if(tab[i]>max)
                max=tab[i];
        }
        if(x1==x2 && x2==x3 && x3==x4)
            System.out.println(x4);
        else
            System.out.println(max);

        br.close();
    }
}
