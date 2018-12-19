package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileReader fileIn = new FileReader(fileName);
        BufferedReader fileBufReader = new BufferedReader(fileIn);

        String s;

        while ((s = fileBufReader.readLine()) != null) {
            if (s.startsWith(args[0] + " ")) {
                System.out.println(s);
                break;
            }
        }

        br.close();
        fileIn.close();
        fileBufReader.close();
    }
}
