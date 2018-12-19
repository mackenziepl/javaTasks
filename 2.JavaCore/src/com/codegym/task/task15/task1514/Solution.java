package com.codegym.task.task15.task1514;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();


    public static void main(String[] args) {
            System.out.println(labels);
    }

    static {
        for(int i = 0; i < 5; i++) {
            Double j = (double) i;
            labels.put(j, "s" + i);
        }
    }
}
