package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        Cat ca11 = new Cat("Kitty1", 2, 5, 2);
        Cat ca12 = new Cat("Kitty2", 3, 7, 5);
        Cat ca13 = new Cat("Kitty3", 4, 9, 7);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}