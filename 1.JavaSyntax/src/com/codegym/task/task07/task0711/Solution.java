package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }
        for(int j = 0; j < 13; j++) {
            String x = strings.remove(4);
            strings.add(0, x);
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
