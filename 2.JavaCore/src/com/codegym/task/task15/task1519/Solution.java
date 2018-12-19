package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = br.readLine();

            if(s.equals("exit")) break;

            else if(integer(s)) {
                Integer x = Integer.parseInt(s);
                print(x);
            }

            else if(shor_t(s)) {
                short y = Short.parseShort(s);
                print(y);
            }

            else if(doubl_e(s)) {
                Double d = Double.parseDouble(s);
                print(d);
            }

            else print(s);
        }
    }

    public static boolean integer(String s) {
        try {
            Integer num = Integer.parseInt(s);
            if (num <= 0 || num >= 128)
                return true;
            else
                return false;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean shor_t(String s) {
        try {
            short num = Short.parseShort(s);
            if (num > 0 && num < 128)
                return true;
            else
                return false;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean doubl_e(String s) {
        try {
            Double num = Double.parseDouble(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
