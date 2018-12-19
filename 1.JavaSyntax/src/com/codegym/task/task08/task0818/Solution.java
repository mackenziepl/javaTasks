package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("LastName1", 2000);
        map.put("LastName2", 1000);
        map.put("LastName3", 300);
        map.put("LastName4", 800);
        map.put("LastName5", 350);
        map.put("LastName6", 1200);
        map.put("LastName7", 400);
        map.put("LastName8", 750);
        map.put("LastName9", 800);
        map.put("LastName10", 600);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}