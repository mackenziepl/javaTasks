package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        while(true) {
            String words = br.readLine();

            if(words.equals("exit")) {
                bw.write(words);
                break;
            }

            bw.write(words);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
