package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String month = br.readLine();
        String[] s = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
        int i = 1;
        for(String str : list) {
            if(month.equals(str))
                System.out.println(str + " is month " + i);
            i++;
        }
    }
}
