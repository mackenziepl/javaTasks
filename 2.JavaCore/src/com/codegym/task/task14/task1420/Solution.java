package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer a , b;
            try {
                a = Integer.parseInt(br.readLine());
                if (!(a > 0)) throw new Exception();
                b = Integer.parseInt(br.readLine());
                if (!(b > 0)) throw new Exception();

            } catch (Exception e) {
                e.getStackTrace();
                return;
            }
            System.out.println(nwd(a, b));
}

    public static int nwd(Integer a, Integer b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
