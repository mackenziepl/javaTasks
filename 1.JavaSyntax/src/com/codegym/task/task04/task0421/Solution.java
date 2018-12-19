package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();

        boolean x = name1.equals(name2);
        int y1 = name1.length();
        int y2 = name2.length();
        if(x) {
            System.out.println("The names are identical");
        }
        else if(y1==y2) {
            System.out.println("The names are the same length");
        }

        br.close();
    }
}
