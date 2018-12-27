package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedReader brFile = new BufferedReader(new FileReader(fileName));

        int i = 0;

        while (brFile.ready()) {
            String line = brFile.readLine();
            String[] words = line.split("\\W");
            for(String w : words) {
                if(w.equals("world"))
                    i++;
            }
        }
        System.out.println(i);

        br.close();
        brFile.close();
    }
}
