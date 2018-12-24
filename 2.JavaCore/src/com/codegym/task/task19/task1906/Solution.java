package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        FileReader fr = new FileReader(fileName1);
        FileWriter fw = new FileWriter(fileName2);
        int i = 0;
        while (fr.ready()) {
            int data = fr.read();
            i++;
            if(i%2 == 0) fw.write(data);
        }
        br.close();
        fr.close();
        fw.close();
    }
}
