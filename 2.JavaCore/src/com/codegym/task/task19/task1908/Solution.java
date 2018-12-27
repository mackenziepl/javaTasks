package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();

        BufferedReader brFileIn = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bwFileOut = new BufferedWriter(new FileWriter(fileName2));

        String line = null;
        while ((line = brFileIn.readLine()) != null) {
            String [] words = line.split("[\\s\\p{Punct}]+");
            for(String w : words) {
                try {
                    int i = Integer.parseInt(w);
                    bwFileOut.write(i + " ");
                } catch (NumberFormatException e) {}
            }
        }


        br.close();
        brFileIn.close();
        bwFileOut.close();

    }
}
