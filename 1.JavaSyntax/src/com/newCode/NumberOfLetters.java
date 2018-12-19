package com.newCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Number of letters

*/

public class NumberOfLetters {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> quantityLetter = new HashMap<>();

        for(Character c : alphabet) {
            quantityLetter.put(c, 0);
        }

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).length(); j++) {
                char c = list.get(i).charAt(j);
//                    if(!quantityLetter.containsKey(c)){
//                        quantityLetter.put(c,0);
//                    }
                if(c > 96 && c < 123)
                    quantityLetter.put(c, quantityLetter.get(c)+1);
            }
        }

        for(Map.Entry<Character, Integer> m : quantityLetter.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
