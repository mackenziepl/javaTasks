package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
//        static String fileName1 = "E:\\temp\\source1.txt";
//        static String fileName2 = "E:\\temp\\source2.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        FileInputStream fileIn1 = new FileInputStream(fileName1);
        Scanner scanner = new Scanner(fileIn1);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));
        List<Double> list = new ArrayList<>();

        scanner.useLocale(Locale.ENGLISH);

        while (scanner.hasNext()){
            list.add(scanner.nextDouble());
        }

        for (int i = 0; i < list.size(); i++) {
            bw.write(Math.round(list.get(i)) + " ");
        }

        br.close();
        fileIn1.close();
        bw.close();
    }
}
