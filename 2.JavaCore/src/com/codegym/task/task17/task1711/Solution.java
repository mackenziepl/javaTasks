package com.codegym.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Locale.ENGLISH;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    static List<Person> create(String[] s) {
        String name = null;
        String date = null;
        String sex = null;
        for(int i = 1, x = 2, y = 3; i < s.length; i+=3, x+=3, y+=3) {
                name = s[i];
                sex = s[x];
                date = s[y];

            SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
            try {
                Date date1 = sdf.parse(date);
                if (sex.contains("m"))
                    allPeople.add(Person.createMale(name, date1));
                else if (sex.contains("f"))
                    allPeople.add(Person.createFemale(name, date1));
            } catch (Exception e) {
                e.getStackTrace();
            }

            System.out.println(allPeople.size() - 1);
        }
        return allPeople;
    }

    static List<Person> update(String[] s) {
        String id = null;
        String name = null;
        String date = null;
        String sex = null;
        for(int i = 1, x = 2, y = 3, z = 4; i < s.length; i+=4, x+=4, y+=4, z+=4) {
            id = s[i];
            name = s[x];
            sex = s[y];
            date = s[z];
            int idi = Integer.parseInt(id);
            Person person = allPeople.get(idi);
            person.setName(name);
            if (sex.contains("m")) person.setSex(Sex.MALE);
            else if (sex.contains("f")) person.setSex(Sex.FEMALE);
            SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
            try {
                Date date1 = sdf.parse(date);
                person.setBirthDate(date1);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return allPeople;
    }

    static void delete(String[] s) {
        for(int i = 1; i < s.length; i++) {
            int id = Integer.parseInt(s[i]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    static void view(String[] s) {
        for(int i = 1; i < s.length; i++) {
            int id = Integer.parseInt(s[i]);
            Person person = allPeople.get(id);
            Date date = person.getBirthDate();
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", ENGLISH);
            String d = sdf.format(date);
            System.out.println(person.getName() + " " + person.getSex() + " " + d);
        }
    }

    public static void main(String[] args) {
            switch (args[0]) {
                case "-c": {
                    synchronized (allPeople) {
                        create(args);
                        break;
                    }
                }
                case "-u": {
                    synchronized (allPeople) {
                        update(args);
                        break;
                    }
                }
                case "-d": {
                    synchronized (allPeople) {
                        delete(args);
                        break;
                    }
                }
                case "-i": {
                    synchronized (allPeople) {
                        view(args);
                        break;
                    }
                }
            }
    }
}
