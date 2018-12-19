package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int N = Integer.parseInt(br.readLine());
        while(N>0) {
            System.out.println(text);
            N--;
        }
        br.close();
    }
}
