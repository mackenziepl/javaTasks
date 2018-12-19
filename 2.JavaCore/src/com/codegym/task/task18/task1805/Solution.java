package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);

        SortedSet<Integer> set = new TreeSet<>();

        while (file.available() > 0) {
            int i = file.read();
            set.add(i);
        }

        for (Integer item : set) {
            System.out.print(item.intValue() + " ");
        }

        br.close();
        file.close();
    }
}
