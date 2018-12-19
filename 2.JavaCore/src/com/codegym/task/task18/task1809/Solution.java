package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        List<Integer> list = new ArrayList<>();

        while (file1.available() > 0) {
            int data = file1.read();
            list.add(data);
        }

        for (int i = list.size()-1; i >= 0; i--) {
            file2.write(list.get(i));
        }

        br.close();
        file1.close();
        file2.close();
    }
}
