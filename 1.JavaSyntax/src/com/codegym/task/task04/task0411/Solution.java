package com.codegym.task.task04.task0411;

/* 
Seasons on Terra

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(month == 12 || month < 3)
            System.out.println("winter");
        else if (month > 2 && month < 6)
            System.out.println("spring");
        else if (month > 5 && month < 9)
            System.out.println("summer");
        else
            System.out.println("autumn");
    }
}