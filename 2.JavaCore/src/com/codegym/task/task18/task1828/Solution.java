package com.codegym.task.task18.task1828;

/* 
Prices 2

*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileReader fr = new FileReader(fileName);
        BufferedReader brFile = new BufferedReader(fr);

        Map<Integer, String> map = new HashMap<>();
        String line = null;
        int id = 0;

        while ((line = brFile.readLine()) != null) {
            map.put(Integer.parseInt(line.substring(0, 8).trim()), line.substring(8, line.length()));
        }

        if(args[0].equals("-d")) {
            id = Integer.parseInt(args[1]);
            map.remove(id);
        }
        else if(args[0].equals("-u")) {
            id = Integer.parseInt(args[1]);
            String update = String.format("%-30s%-8s%-4s", args[2], args[3], args[4]);
            map.replace(id, update);
        }

        int i = 0;
        FileOutputStream fos = new FileOutputStream(fileName);
        for(Map.Entry<Integer, String> m : map.entrySet()) {
            fos.write((String.format("%-8s%s%n", ++i, m.getValue())).getBytes());
        }

        br.close();
        fr.close();
        fos.close();
        brFile.close();
    }
}
