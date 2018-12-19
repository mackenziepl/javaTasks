package com.codegym.task.task14.task1408;

class NorthAmericanHen extends Hen {

    public int getMonthlyEggCount() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " I come from " +  Continent.NORTHAMERICA + ". I lay " +  getMonthlyEggCount() + " eggs a month.";
    }
}