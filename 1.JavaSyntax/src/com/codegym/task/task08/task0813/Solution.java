package com.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    public static Set<String> createSet() {
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i < 20; i++) {
            hashSet.add("L" + i);
        }
        return hashSet;
    }

    public static void main(String[] args) {

    }
}
