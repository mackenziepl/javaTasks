package com.codegym.task.task19.task1904;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() {
            Person person = null;
            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.split(" ");
                SimpleDateFormat spf = new SimpleDateFormat("ddMMyyyy");
                String birthDay = words[4] +  words[3] +  words[5];
                Date date = null;
                try {
                    date = spf.parse(birthDay);
                }catch (Exception e){}
                person = new Person(words[2], words[0], words[1], date);
            }
            return person;
        }

        @Override
        public void close() {
            fileScanner.close();
        }
    }
}
