package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine());
            arrayList.add(x);
        }

        int count = 1, i = 1;
        for(int j = 0; j < 9; j++) {
                if (arrayList.get(j + 1).equals(arrayList.get(j))) {
                    count++;
                    if (count > i) {
                        i = count;
                    }
                } else count = 1;
        }
        System.out.println(i);
    }
}