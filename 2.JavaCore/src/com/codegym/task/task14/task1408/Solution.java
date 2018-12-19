package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
        //System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            if(continent.equalsIgnoreCase(Continent.AFRICA)) hen = new AfricanHen();
            else if(continent.equalsIgnoreCase(Continent.EUROPE)) hen = new EuropeanHen();
            else if(continent.equalsIgnoreCase(Continent.ASIA)) hen = new AsianHen();
            else if(continent.equalsIgnoreCase(Continent.NORTHAMERICA)) hen = new NorthAmericanHen();
            return hen;
        }
    }
}
