package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        String fileName3 = br.readLine();
        FileInputStream fileIn = new FileInputStream(fileName1);
        FileOutputStream fileOut2 = new FileOutputStream(fileName2);
        FileOutputStream fileOut3 = new FileOutputStream(fileName3);

        int b = fileIn.available();
        int c = 0;
        if(b%2 != 0) {
          c = (b / 2) + 1;
        } else c = b/2;

        while (fileIn.available() > 0) {
            byte[] buffer1 = new byte[c];
            byte[] buffer2 = new byte[b/2];
            int count1 = fileIn.read(buffer1);
            int count2 = fileIn.read(buffer2);
            fileOut2.write(buffer1);
            fileOut3.write(buffer2);
        }

        br.close();
        fileIn.close();
        fileOut2.close();
        fileOut3.close();

    }
}
