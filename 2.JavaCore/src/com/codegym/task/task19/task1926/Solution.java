package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        BufferedReader brFile = new BufferedReader(new FileReader(file));

        while (brFile.ready()) {
            String line = brFile.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(line);
            System.out.println(sb.reverse());
        }

        br.close();
        brFile.close();
    }
}
