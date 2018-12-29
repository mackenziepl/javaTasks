package com.codegym.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedReader brFile = new BufferedReader(new FileReader(fileName));

        List<String> fileList = brFile.lines().collect(Collectors.toList());

        for(String s : fileList) {
            int i = 0;
            for(String w : words) {
                if(s.contains(w)) i++;
            }
            if(i==2) System.out.println(s);
        }

        br.close();
        brFile.close();
    }
}
