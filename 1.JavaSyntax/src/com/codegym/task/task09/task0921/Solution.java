package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> integers = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                int number = Integer.parseInt(br.readLine());
                integers.add(number);
            }
        } catch(NumberFormatException e) {
            for(Integer i : integers) {
                System.out.println(i);
            }
        } catch(IOException e) {

        }
    }
}
