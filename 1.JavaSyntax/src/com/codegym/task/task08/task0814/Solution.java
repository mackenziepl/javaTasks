package com.codegym.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> hashSet = new HashSet<>();
       for(int i = 0; i < 20; i++) {
           hashSet.add(i);
       }
        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer i : set) {
            if(i <= 10)
                hashSet.add(i);
        }
        return hashSet;
    }

    public static void main(String[] args) {
    }
}
