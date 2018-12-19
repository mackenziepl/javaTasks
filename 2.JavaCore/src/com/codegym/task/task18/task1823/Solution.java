package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while (!(s = br.readLine()).equals("exit")) {
                ReadThread rt = new ReadThread(s);
                rt.start();
            }
            br.close();
        }catch (IOException e) {}

        for(Map.Entry<String, Integer> m : resultMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static class ReadThread extends Thread {
        private String name;

        public ReadThread(String fileName) {
            // Implement constructor body
            this.name = fileName;
        }
        // Implement file reading here

        @Override
        public void run() {
            try {
                FileInputStream file = new FileInputStream(name);
                Map<Integer, Integer> map = new TreeMap<>();
                int max = 0, ourByte = 0;
                    while (file.available() > 0) {
                        int data = file.read();
                        map.merge(data, 1, Integer::sum);
                        if (map.get(data) > max) {
                            max = map.get(data);
                            ourByte = data;
                        }
                    }file.close();
                    resultMap.put(name, ourByte);
            }catch (IOException e) {}
        }
    }
}
