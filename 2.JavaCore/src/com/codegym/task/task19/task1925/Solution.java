package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String f1 = "e:\\temp\\source1.txt";
//        String f2 = "e:\\temp\\source2.txt";

        BufferedReader brFileIn = new BufferedReader(new FileReader(args[0]));
        FileWriter fr = new FileWriter(args[1]);

        String line = null;
        String[] words = null;
        List<String> list = new ArrayList<>();

        while ((line = brFileIn.readLine()) != null) {
            words = line.split("\\p{Blank}");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 6) {
                    list.add(words[i]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size() -1) fr.write(list.get(i) + ",");
            else fr.write(list.get(i));
        }

        brFileIn.close();
        fr.close();
    }
}
