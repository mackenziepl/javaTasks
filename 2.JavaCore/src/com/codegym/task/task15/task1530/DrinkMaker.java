package com.codegym.task.task15.task1530;

public abstract class DrinkMaker {
    abstract public void getRightCup();
    abstract public void addIngredients();
    abstract public void pour();

    public void makeDrink() {
        getRightCup();
        addIngredients();
        pour();
    }
}
