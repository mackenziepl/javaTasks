package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int m = Collections.min(array);
        return m;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < x; i++) {
            int y = Integer.parseInt(br.readLine());
            list.add(y);
        }

        return list;
    }
}
