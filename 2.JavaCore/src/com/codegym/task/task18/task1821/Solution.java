package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = args[0];
        FileInputStream file = new FileInputStream(s);
        Map<Integer, Integer> frequently = new TreeMap<>();

        while (file.available() > 0) {
            int data = file.read();
            if(frequently.keySet().contains(data)) {
                frequently.put(data, frequently.get(data) + 1);
            }
            else
                frequently.put(data, 1);
        }

        for(Map.Entry<Integer, Integer> map : frequently.entrySet()) {
            int i = map.getKey();
            char c = (char) i;
            System.out.println(c + " " + map.getValue());
        }
        br.close();
        file.close();
    }
}
