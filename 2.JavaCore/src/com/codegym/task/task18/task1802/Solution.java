package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);

        int min = file.read();
        while (file.available() > 0) {
            int current = file.read();
            if(min > current) min = current;
        }
        System.out.println(min);
        char ch = (char)min;
        System.out.println(ch);

        br.close();
        file.close();
    }
}
