package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }


    public boolean fight(Cat anotherCat) {
        if(this.age > anotherCat.age && this.strength > anotherCat.strength) {
            if(this.weight > anotherCat.weight) {
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 12;
        cat2.age = 11;
        cat1.weight = 12;
        cat2.weight = 11;
        cat1.strength = 5;
        cat2.strength = 1;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
