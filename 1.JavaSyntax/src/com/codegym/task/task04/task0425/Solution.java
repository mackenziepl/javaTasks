package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());

        if(x1>0 && x2>0)
            System.out.println(1);
        else if(x1<0 && x2>0)
            System.out.println(2);
        else if(x1<0 && x2<0)
            System.out.println(3);
        else if(x1>0 && x2<0)
            System.out.println(4);

        br.close();
    }
}
