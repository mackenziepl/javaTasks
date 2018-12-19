package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);
        int max = file.read();
        while(file.available() > 0) {
            int current = file.read();
            if(current > max) max = current;
        }
        System.out.println(max);
        char ch = (char)max;
        System.out.println(ch);

        br.close();
        file.close();
    }
}
