package com.codegym.task.task08.task0816;

import sun.util.calendar.BaseCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", df.parse("JUNE 1 1980"));
        map.put("Stallone2", df.parse("MAY 1 1980"));
        map.put("Stallone3", df.parse("JULY 1 1980"));
        map.put("Stallone4", df.parse("DECEMBER 1 1980"));
        map.put("Stallone5", df.parse("JUNE 1 1980"));
        map.put("Stallone6", df.parse("APRIL 1 1980"));
        map.put("Stallone7", df.parse("JULY 2 1980"));
        map.put("Stallone8", df.parse("AUGUST 1 1980"));
        map.put("Stallone9", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallone0", df.parse("FEBRUARY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        Calendar c = Calendar.getInstance();
        int s1 = 6;
        int s2 = 7;
        int s3 = 8;
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
            int month = Integer.parseInt(dateFormat.format(date));
            if(s1==month||s2==month||s3==month){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
