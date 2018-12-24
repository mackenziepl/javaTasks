package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName1= br1.readLine();
        String fileName2= br1.readLine();

        BufferedReader br2 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));

        String line = null;
        while ((line = br2.readLine()) != null) {
            bw.write(line.replaceAll("[\\p{Punct}|\\n]",""));
        }
        br1.close();
        br2.close();
        bw.close();
    }
}
