package com.codegym.task.task04.task0405;

/* 
Setting the number of cats

*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {
        System.out.println(Cat.catCount);
        Cat.setCatCount(4);
        System.out.println(Cat.catCount);
        Cat.setCatCount(0);
        System.out.println(Cat.catCount);
    }
}
