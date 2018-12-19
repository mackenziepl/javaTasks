package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int salary = 0;
        int sum = 0;
        while(true) {
            int x = 0;
            x = Integer.parseInt(br.readLine());
            if(x==-1)
                break;
            sum+=x;
            salary++;
        }
        double result = (double)sum/salary;
        System.out.println(result);
        br.close();
    }
}

