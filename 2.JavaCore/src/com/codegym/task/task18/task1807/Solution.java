package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);

        int count = 0;
        while (file.available() > 0) {
            int data = file.read();
            if(data == 44) count++;
        }

        System.out.println(count);

        br.close();
        file.close();
    }
}
