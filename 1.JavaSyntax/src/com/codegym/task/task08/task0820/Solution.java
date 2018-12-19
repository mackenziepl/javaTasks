package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result1 = new HashSet<Cat>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        result1.add(cat1);
        result1.add(cat2);
        result1.add(cat3);
        result1.add(cat4);
        return result1;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result2 = new HashSet<>();

        result2.add(new Dog());
        result2.add(new Dog());
        result2.add(new Dog());
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result3 = new HashSet<>();
        result3.addAll(cats);
        result3.addAll(dogs);
        return result3;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for(Object o : pets) {
            System.out.println(o);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
