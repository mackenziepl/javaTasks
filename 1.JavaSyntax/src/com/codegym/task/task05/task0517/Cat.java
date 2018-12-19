package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 10;
        this.weight = 5;
        this.color = "grey";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "grey";
    }

    public Cat(int weight, String color) {
        this.age = 10;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.age = 10;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
