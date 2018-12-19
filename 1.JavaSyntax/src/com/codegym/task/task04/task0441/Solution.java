package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int x3 = Integer.parseInt(br.readLine());

        if(x1==x2 || x1==x3 || x2==x3) {
            if(x1==x2)
                System.out.println(x1);
            else if(x1==x3)
                System.out.println(x1);
            else
                System.out.println(x2);
        }
        else if(x1==x2 && x1==x3)
            System.out.println(x1);
        else if(x1!=x2 || x1!=x3 || x2!=x3) {
            int[] tab = new int[3];
            tab[0] = x1;
            tab[1] = x2;
            tab[2] = x3;

            for (int i = 0; i < tab.length; i++) {
                for(int j = 0; j < tab.length-1; j++) {
                    if(tab[j] > tab[j+1]){
                        int temp = tab[j];
                        tab[j]= tab[j+1];
                        tab[j+1] = temp;
                    }
                }
            }
            System.out.println(tab[1]);
        }
        br.close();
    }
}
