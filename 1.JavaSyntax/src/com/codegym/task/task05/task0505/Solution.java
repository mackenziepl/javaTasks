package com.codegym.task.task05.task0505;

/* 
Feline carnage

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty1", 2, 5, 2);
        Cat cat2 = new Cat("Kitty2", 3, 7, 5);
        Cat cat3 = new Cat("Kitty3", 4, 9, 7);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat3.fight(cat1));
        System.out.println(cat3.fight(cat2));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
