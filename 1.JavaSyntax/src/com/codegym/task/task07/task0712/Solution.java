package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            strings.add(br.readLine());
        }
        int max = 0;
        int min = strings.get(0).length();
        for(int j = 0; j < 10; j++) {
            if(strings.get(j).length() < min)
                min = strings.get(j).length();
            if(max < strings.get(j).length())
                max = strings.get(j).length();
        }
        for(int k = 0; k < 10; k++) {
            if(strings.get(k).length() == min || strings.get(k).length() == max) {
                System.out.println(strings.get(k));
                break;
            }
        }
    }
}
