package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {

    public int getMonthlyEggCount() {
        return 200;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " I come from " +  Continent.EUROPE + ". I lay " +  getMonthlyEggCount() + " eggs a month.";
    }
}
