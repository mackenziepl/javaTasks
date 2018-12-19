package com.codegym.task.task06.task0602;

/* 
Zombie cats, zombie dogs

*/

public class Cat {
    public static void main(String[] args) {

    }

    public Cat() {
    }

    public void finalize() {
        System.out.println("A Cat was destroyed");
    }

}

class Dog {

    public Dog() {
    }

    public void finalize() {
        System.out.println("A Dog was destroyed");
    }
}
