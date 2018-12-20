package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileReader fr = new FileReader(fileName);
        BufferedReader brFile = new BufferedReader(fr);
            List<String> list = new LinkedList<>();
            String line = null;
            int maxId = 0;

            while ((line = brFile.readLine()) != null) {
                list.add(line);
                if (maxId < Integer.parseInt(line.substring(0, 8).trim())) {
                    maxId = Integer.parseInt(line.substring(0, 8).trim());
                }
            }
            FileOutputStream fos = new FileOutputStream(fileName);
            for (String s : list) {
                fos.write((String.format("%s%n", s)).getBytes());
            }
            fos.write(String.format("%-8s%-30s%-8s%-4s%n", ++maxId, args[1], args[2], args[3]).getBytes());

        br.close();
        fr.close();
        fos.close();
        brFile.close();
    }
}
