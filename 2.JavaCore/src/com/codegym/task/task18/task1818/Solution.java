package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
//    static String fileName1 = "E:\\temp\\source1.txt";
//    static String fileName2 = "E:\\temp\\source2.txt";
//    static String fileName3 = "E:\\temp\\source3.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        String fileName3 = br.readLine();
        FileOutputStream file1 = new FileOutputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);
        FileInputStream file3 = new FileInputStream(fileName3);

        while (file2.available() > 0) {
            int data = file2.read();
            file1.write(data);
        }

        while (file3.available() > 0) {
            int data = file3.read();
            file1.write(data);
        }

        br.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
