package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);

        List<Integer> integers = new ArrayList<>();
        Map<Integer, Integer> integerMap = new HashMap<>();

        while (file.available() > 0) {
            int current = file.read();
            String s = Integer.toString(current);
            integers.add(current);
        }

        for (Integer item : integers){
            if (integerMap.containsKey(item)){
                integerMap.put(item, integerMap.get(item) + 1);
            } else {
                integerMap.put(item, 1);
            }
        }

        int max = 0;
        for(Map.Entry<Integer, Integer> m : integerMap.entrySet()) {
            if(max < m.getValue()) max = m.getValue();
        }

        for(Map.Entry<Integer, Integer> m : integerMap.entrySet()) {
            if(m.getValue() == max)
            System.out.print(m.getKey() + " ");
        }

        br.close();
        file.close();
    }
}
