package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y, sum = 0;
        boolean z = true;
        String e = "sum";

        while(z) {
            y = 0;
            String exit = br.readLine();
            if(exit.equals(e)) {
                z = false;
            }
            else {
                y = Integer.parseInt(exit);
                sum += y;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
