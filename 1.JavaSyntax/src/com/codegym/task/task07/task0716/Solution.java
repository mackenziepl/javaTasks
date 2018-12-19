package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("measure"); // 0
        list.add("rose"); // 1
        list.add("love"); // 2
        list.add("lyre"); // 3
        list.add("wade"); // 4
        list.add("bark"); // 5
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--) {
            String x = list.get(i);
                if(x.contains("r")) {
                    if (!x.contains("l"))
                    list.remove(i);
                }
                else if(x.contains("l")) {
                    if (!x.contains("r"))
                    copy.add(x);
                }
            }
        for(String s : copy) {
            list.add(s);
        }
        return list;
    }
}