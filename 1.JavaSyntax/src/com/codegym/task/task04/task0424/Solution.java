package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int x3 = Integer.parseInt(br.readLine());

        if(x1==x2)
            System.out.println(3);
        else if(x2==x3)
            System.out.println(1);
        else if(x1==x3)
            System.out.println(2);

        br.close();
    }
}
