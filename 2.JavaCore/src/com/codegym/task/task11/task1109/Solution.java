package com.codegym.task.task11.task1109;

/* 
Like cats and dogs

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar", 5);
        Dog dog = new Dog("Rover", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }

    public static class Cat {
        private String name;
        private int speed;

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getName() {
            return name;
        }

        private int getSpeed() {
            return speed;
        }

        public boolean isDogNear(Dog dog) {
            return this.speed > dog.getSpeed();
        }
    }

    public static class Dog {
        private String name;
        private int speed;

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getName() {
            return name;
        }

        private int getSpeed() {
            return speed;
        }

        public boolean isCatNear(Cat cat) {
            return this.speed > cat.getSpeed();
        }
    }
}



