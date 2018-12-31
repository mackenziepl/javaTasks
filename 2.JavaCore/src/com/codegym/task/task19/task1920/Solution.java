package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader brFile = new BufferedReader(new FileReader(fileName));

        Map<String, Double> map = new TreeMap<>();

        while (brFile.ready()) {
            String[] param = brFile.readLine().trim().split(" ");
            if (map.containsKey(param[0])) {
                map.put(param[0], map.get(param[0]) + Double.parseDouble(param[1]));
            } else
                map.put(param[0], Double.parseDouble(param[1]));
        }

        double max = 0;
        for(Map.Entry<String, Double> m : map.entrySet()) {
            if(max < m.getValue()) max = m.getValue();
        }

        for(Map.Entry<String, Double> m : map.entrySet()) {
            if (max == m.getValue()) System.out.println(m.getKey());
        }
        brFile.close();
    }
}
