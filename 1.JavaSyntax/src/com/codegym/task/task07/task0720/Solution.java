package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for(int j = 0; j < m; j++) {
            list.add(list.size()-j, list.get((m-1)-j));
            list.remove((m-1)-j);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
