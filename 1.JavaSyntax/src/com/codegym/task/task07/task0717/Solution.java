package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for(String s : result) System.out.println(s);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> theList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            theList.add(list.get(i));
            theList.add(list.get(i));
        }
        return theList;
    }
}
