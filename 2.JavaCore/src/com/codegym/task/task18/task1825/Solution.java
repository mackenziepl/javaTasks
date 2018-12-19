package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;

        Set<String> fileSet = new TreeSet<>();

        while (!(fileName = br.readLine()).equals("end")) {
            fileSet.add(fileName);
        }

        br.close();

        String fileNameOut = ((TreeSet<String>) fileSet).first().split(".part")[0];
        FileOutputStream fileOut = new FileOutputStream(fileNameOut);

        for (String f : fileSet) {
            String withoutPart = f.substring(0, f.length()-5);
            FileInputStream fileIn = new FileInputStream(f);

            byte[] buffor = new byte[fileIn.available()];
            fileIn.read(buffor);
            fileOut.write(buffor);
            fileIn.close();
        }

        fileOut.close();
    }
}