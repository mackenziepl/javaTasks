package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        try {
            while(true) {
                String s = reader.readLine();
                Integer id = Integer.parseInt(s);
                if (s.isEmpty()) {
                    break;
                }
                String name = reader.readLine();
                if (name.isEmpty()) {
                    map.put(name, id);
                    break;
                }
                map.put(name, id);
            }
        } catch (NumberFormatException e) {

        }
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}
