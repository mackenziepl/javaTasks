package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);

        List<Integer> integerList = new ArrayList<>();
        Map<Integer, Integer> integerMap = new HashMap<>();

        while (file.available() > 0) {
            int i = file.read();
            integerList.add(i);
        }

        for(Integer item : integerList) {
            if(integerMap.containsKey(item)) {
                integerMap.put(item, integerMap.get(item) + 1);
            } else {
                integerMap.put(item, 1);
            }
        }

        int min = 1;
        for(Map.Entry<Integer, Integer> map : integerMap.entrySet()) {;
            if(map.getValue() < min) min = map.getValue();
        }

        for(Map.Entry<Integer, Integer> map : integerMap.entrySet()) {
            if(map.getValue() == min)
                System.out.print(map.getKey() + " ");
        }

        br.close();
        file.close();
    }
}
