package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.IOException;;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream file = new FileInputStream(fileName);
        int i = 0;

        while(file.available() > 0) {
            int data = file.read();
            if((data > 64 && data < 91) || (data > 96 && data < 123)) {
                i++;
            }
        }

        System.out.println(i);
        file.close();
    }
}
