package com.codegym.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Static modifiers: part 2

*/

public class Solution {
    public static int A;
    public static int B;

    public static int MIN;

    public static void main(String[] args) {

        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(br.readLine());
            A = x;
            x = Integer.parseInt(br.readLine());
            B = x;
            MIN  = min(A, B);

            br.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
