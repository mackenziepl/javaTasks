package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    private static String s;
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = br.readLine();
            if(s.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            }
            else if(s.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            }
            else if(s.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            }
            else thePlanet = null;
        } catch (IOException e) {
        }


    }
}
