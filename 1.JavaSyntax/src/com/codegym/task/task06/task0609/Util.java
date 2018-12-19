package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int x = x2-x1;
        int y = y2-y1;
        double z = Math.sqrt((double) (x*x + y*y));
        return z;
    }

    public static void main(String[] args) {

    }
}
