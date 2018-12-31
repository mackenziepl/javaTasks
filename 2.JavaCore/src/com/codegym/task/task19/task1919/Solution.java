package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader brFile = new BufferedReader(new FileReader(args[0]));

        Map<String, Double> map = new TreeMap<>();

        while (brFile.ready()) {
            String[] params = brFile.readLine().split(" ");
            if(map.containsKey(params[0])) {
                map.put(params[0], map.get(params[0]) + Double.parseDouble(params[1]));
            } else
                map.put(params[0], Double.parseDouble(params[1]));
        }

        for(Map.Entry<String, Double> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        brFile.close();
    }
}
