package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean t = true;
        int sum = 0;
        while(t) {
            int x = 0;
            x = Integer.parseInt(br.readLine());
            if(x==-1)
                t=false;
            sum+=x;
        }
        System.out.println(sum);
        br.close();
    }
}
