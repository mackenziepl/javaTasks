package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }
            list.remove(2);

        for(int i = 3; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


