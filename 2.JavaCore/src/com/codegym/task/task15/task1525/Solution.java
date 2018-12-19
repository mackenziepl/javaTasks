package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try {
            Scanner scanner = new Scanner(new FileInputStream((Statics.FILE_NAME)));
            while(scanner.hasNextLine()) {
                String s = scanner.nextLine();
                lines.add(s);
            }
            scanner.close();

        } catch (IOException e) {

        }
    }
}
