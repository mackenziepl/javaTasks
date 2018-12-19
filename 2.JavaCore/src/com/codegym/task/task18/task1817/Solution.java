package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream file = new FileInputStream(fileName);
        int n1 = 0, n2 = 0;

        while (file.available() > 0) {
            int data = file.read();
            if(data == 32) n2++;
            n1++;
        }

        double d = (double)n2/n1 * 100;
        System.out.printf("%6.2f", d);
        file.close();
    }
}
