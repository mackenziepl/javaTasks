package com.codegym.task.task14.task1408;

class AsianHen extends Hen {

    public int getMonthlyEggCount() {
        return 300;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " I come from " +  Continent.ASIA + ". I lay " +  getMonthlyEggCount() + " eggs a month.";
    }
}
