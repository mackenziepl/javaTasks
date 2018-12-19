package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
       HashSet<String> list = new HashSet<>();
        list.add("watermelon");
        list.add("banana");
        list.add("cherry");
        list.add("pear");
        list.add("cantaloupe");
        list.add("blackberry");
        list.add("ginseng");
        list.add("strawberry");
        list.add("iris");
        list.add("potato");

        for(String s : list) {
            System.out.println(s);
        }











    }
}
