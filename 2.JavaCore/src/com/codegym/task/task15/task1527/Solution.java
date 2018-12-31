package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = "index.html?lvl=15&view&name=Amigo&obj=10&obj=test=Jkl&obj=2.232&obj=3.45";
        String line = br.readLine();

        List<String> strings = new LinkedList<>();
        for (String l : line.split("\\?")[1].split("&")) {
            String[] params = l.split("=");
            if (params[0].equals("obj")) {
                strings.add(params[1]);
            }
            System.out.print(params[0] + " ");
        }

        for(String l : strings) {
            try {
                alert(Double.parseDouble(l));

            } catch (NumberFormatException e) {
                alert(l);
            }
        }
        br.close();
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println(value);
    }
}
