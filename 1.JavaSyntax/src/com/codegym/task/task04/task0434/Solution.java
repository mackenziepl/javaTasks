package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 1;
        int y = 1;
        while(x<11) {
            while (y<11) {
                System.out.print(x * y + " ");
                y++;
            }
            x++;
            y=1;
            System.out.println();
        }
    }
}
