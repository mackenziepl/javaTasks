package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean b = false;
        String r1= "", r2 = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                continue;
            else if(b != isVowel(s.charAt(i))) {

                r1 += s.charAt(i) + " ";
            }
            else
                r2 += s.charAt(i) + " ";
        }
        System.out.println(r1);
        System.out.println(r2);
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}