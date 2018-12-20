package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = null;

        while(true) {
            String fileName = br.readLine();
            try {
                fis = new FileInputStream(fileName);
                fis.close();

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                br.close();
                return;
            }
        }
    }
}
