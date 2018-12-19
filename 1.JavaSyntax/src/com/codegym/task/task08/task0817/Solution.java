package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("LastName1", "John");
        map.put("LastName2", "Kevin");
        map.put("LastName3", "Arnold");
        map.put("LastName4", "Will");
        map.put("LastName5", "John");
        map.put("LastName6", "Bruce");
        map.put("LastName7", "John");
        map.put("LastName8", "George");
        map.put("LastName9", "Steven");
        map.put("LastName10", "John");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        int count = 0;
        for (Map.Entry<String, String> pair1 : copy.entrySet()) {
            for (Map.Entry<String, String> pair2 : map.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue()))
                    count++;
            }
            if(count > 1) {
                removeItemFromMapByValue(map, pair1.getValue());
                count = 0;
            }
            else
                count = 0;
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
