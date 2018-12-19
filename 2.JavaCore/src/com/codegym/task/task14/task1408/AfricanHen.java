package com.codegym.task.task14.task1408;

class AfricanHen extends Hen {

    public int getMonthlyEggCount() {
        return 400;
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " I come from " +  Continent.AFRICA + ". I lay " +  getMonthlyEggCount() + " eggs a month.";
    }
}
