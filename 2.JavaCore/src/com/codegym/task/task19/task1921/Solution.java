package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.SimpleFormatter;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        while (br.ready()) {
            String line = br.readLine();
            String word = line.replaceAll("[0-9]", "").trim();
            String[] words1 = line.substring(word.length()).trim().split(" ");

            Date date = new GregorianCalendar(Integer.parseInt(words1[2]),
                                                Integer.parseInt(words1[0]) - 1,
                                                Integer.parseInt(words1[1])).getTime(); //year, month, day

            PEOPLE.add(new Person(word, date));
        }
        br.close();
    }
}
