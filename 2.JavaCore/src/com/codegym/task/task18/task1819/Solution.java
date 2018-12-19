package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
//    static String fileName1 = "E:\\temp\\source1.txt";
//    static String fileName2 = "E:\\temp\\source2.txt";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        FileInputStream fileIn1 = new FileInputStream(fileName1);
        List<Integer> list = new ArrayList<>();

        while (fileIn1.available() > 0) {
            int data = fileIn1.read();
            list.add(data);
        }

        FileInputStream fileIn2 = new FileInputStream(fileName2);
        FileOutputStream fileOut1 = new FileOutputStream(fileName1);

        while (fileIn2.available() > 0) {
            int data = fileIn2.read();
            fileOut1.write(data);
        }
        for(int i = 0; i < list.size(); i++) {
            fileOut1.write(list.get(i));
        }

        fileIn1.close();
        fileIn2.close();
        fileOut1.close();
    }
}
