package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String words = s;

        int a = words.length();
        StringBuffer sb = new StringBuffer(a);
        boolean lod = false;

        for(int i = 0; i < a; i++) {
            int cp = words.codePointAt(i);
            sb.appendCodePoint(lod ? Character.toLowerCase(cp) : Character.toUpperCase(cp));
            lod = Character.isLetterOrDigit(cp);
            if(!Character.isBmpCodePoint(cp)) i++;
        }

//        String sb = Stream.of(words.trim().split("\\s"))
//                .filter(word -> word.length() > 0)
//                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
//                .collect(Collectors.joining(" "));


//        String[] words = s.split(" ");
//        StringBuffer sb = new StringBuffer();
//       // String str = "";
//
//        for(int i = 0; i < words.length; i++) {
//            sb.append(Character.toUpperCase(words[i].charAt(0)))
//                    .append(words[i].substring(1)).append(" ");
//        }


//        for ( word : s.toCharArray()) {
//            String first = word.substring(0,1);
//            first = first.toUpperCase();
//            str +=  first + word.substring(1) + " ";
//        }


        System.out.println(sb);
    }
}
