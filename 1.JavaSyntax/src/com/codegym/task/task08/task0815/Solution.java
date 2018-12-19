package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("John", "Rambo1");
        map.put("Sylvester", "Stallone");
        map.put("George", "Willis");
        map.put("Kevin", "Rambo2");
        map.put("Will", "Smith");
        map.put("Tom", "Hanks");
        map.put("Nicolas", "Cage");
        map.put("Bruce", "Rambo3");
        map.put("Peter", "Falk");
        map.put("Arnold", "Rambo4");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for(Map.Entry<String, String> mapentry : map.entrySet()) {
            if(mapentry.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> mapentry : map.entrySet()) {
            if(mapentry.getKey().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
