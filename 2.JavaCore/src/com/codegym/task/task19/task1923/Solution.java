package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String f1 = "E:\\temp\\source1.txt";
//        String f2 = "E:\\temp\\source2.txt";

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);

        while (br.ready()) {
            String[] words = br.readLine().split(" ");
            for (String s : words) {
                if (!s.matches("^\\D*$")) {
                    fw.write(s + " ");
                }
            }
        }

        br.close();
        fw.close();
    }
}
