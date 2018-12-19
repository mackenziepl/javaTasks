package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list;
        String x = "", y = "";
        Double d = null;

        try {
            String s = br.readLine();
            list = findString(s);
            for(int i = 0; i < list.size(); i++) {
                if(!list.get(i).contains(".") && (list.get(i).charAt(0) > 47 && list.get(i).charAt(0) < 58))
                list.remove(i);
            }
                for (String l : list) {
                    try {
                        d = Double.parseDouble(l);

                    } catch (Exception e) {
                        x += l + " ";
                    }
                }
            alert(x);
            alert(d);
        } catch (Exception e) {}
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println(value);
    }

    public static boolean doubl_e(String s) {

            try {
                double d = Double.parseDouble(s);
                return true;
            } catch (Exception e) {
                return false;
            }
    }

    public static List<String> findString(String s) {
        List<String> list = new ArrayList<>();
        String a = "";
        for(int i = 0; i < s.length(); i++) {

               if(s.charAt(i) == '&' || s.charAt(i) == '?' || s.charAt(i) == '=') {
                   for(int j = i+1; j < s.length(); j++) {
                       if(s.charAt(j) > 96 && s.charAt(j) < 123)
                           a += s.charAt(j);
                       else if(s.charAt(j) > 47 && s.charAt(j) < 58 || s.charAt(j) == 46) {
                           a += s.charAt(j);
                       }
                       else {
                           if(!a.isEmpty())
                           list.add(a);
                           a = "";
                           break;
                       }
                   }
               }

        }
        return list;
    }
}
