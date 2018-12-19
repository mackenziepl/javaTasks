package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }
        int min = strings.get(0).length();
        for(int i = 0; i < 5; i++) {
            if(strings.get(i).length() < min)
                min = strings.get(i).length();
        }

        for(String s : strings) {
            if(s.length()==min)
                System.out.println(s);
        }
    }
}
