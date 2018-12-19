package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        Scanner scanner = new Scanner(new FileInputStream(fileName));

        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            int x = Integer.parseInt(s);
            if(x % 2 == 0)
            numbers.add(x);
        }

        Collections.sort(numbers);
        for(Integer i : numbers) {
            System.out.println(i);
        }

        scanner.close();
        br.close();
    }
}
