package com.codegym.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Locale.ENGLISH;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    //public static ArrayList<String> list = new ArrayList<>();


    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    static List<Person> create(String[] s) {
        String name = s[1];
        String date = s[3];
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
        try {
            Date date1 = sdf.parse(date);
            if(s[2].contains("m"))
                allPeople.add(Person.createMale(name, date1));
            else if(s[2].contains("f"))
                allPeople.add(Person.createFemale(name, date1));
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println(allPeople.size()-1);
        return allPeople;
    }

    static List<Person> update(String[] s) {
        int id = Integer.parseInt(s[1]);
        Person person = allPeople.get(id);
        String name = s[2];
        person.setName(name);
        if(s[3].contains("m")) person.setSex(Sex.MALE);
        else if(s[3].contains("f")) person.setSex(Sex.FEMALE);
        String date = s[4];
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
        try {
            Date date1 = sdf.parse(date);
            person.setBirthDate(date1);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return allPeople;
    }

    static void view(String[] s) {
        int id = Integer.parseInt(s[1]);
        Person person = allPeople.get(id);
        Date date = person.getBirthDate();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", ENGLISH);
        String d = sdf.format(date);
        System.out.println(person.getName() + " " + person.getSex() + " " + d);
    }

    static void delete(String[] s) {
        int id = Integer.parseInt(s[1]);
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }


//    private static List<String> elementsString(String s) {
//        list = new ArrayList<>();
//        String regex = "[\\s\\p{Punct}]+";
//
//        Pattern pattern = Pattern.compile(regex);
//
//        String[] words = pattern.split(s);
//        String e = "";
//        for (int i = 2; i < words.length; i++) {
//            if(words.length == 3) {
//                list.add(words[i]);
//            }
//            else if(words.length == 8) {
//                e += words[i] + " ";
//                if (i == 2 || i == 5 || i == 6) continue;
//                else {
//                    e = e.trim();
//                    list.add(e);
//                    e = "";
//                }
//            } else {
//                e += words[i] + " ";
//                if (i == 3 || i == 6 || i == 7) continue;
//                else {
//                    e = e.trim();
//                    list.add(e);
//                    e = "";
//                }
//            }
//        }
//        return list;
//    }


    public static void main(String[] args) {

            if (args[0].equals("-c")) {
                create(args);
            }
            if (args[0].equals("-u")) {
                update(args);
            }
            if (args[0].equals("-d")) {
                delete(args);
            }
            if (args[0].equals("-i")) {
                view(args);
            }
    }
}
