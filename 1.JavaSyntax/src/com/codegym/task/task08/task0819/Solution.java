package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Cat> copy = cats;
        for(Cat c : copy) {
            cats.remove(c);
            break;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        HashSet<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat c : cats) {
            System.out.println(c);
        }
    }

    public static class Cat {
    }
}
