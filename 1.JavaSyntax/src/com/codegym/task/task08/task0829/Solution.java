package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> familyAddresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            String family;

            if (city.isEmpty()) break;
            else {
                family = reader.readLine();
            }
            familyAddresses.put(city, family);
        }

        String nameCity = reader.readLine();

        for(Map.Entry<String, String> pair : familyAddresses.entrySet())
        if (nameCity.equals(pair.getKey())) {
            System.out.println(pair.getValue());
        }
    }
}
