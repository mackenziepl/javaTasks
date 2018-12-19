package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<>();
        ArrayList<Human> list2 = new ArrayList<>();
        ArrayList<Human> list3 = new ArrayList<>();
        ArrayList<Human> list4 = new ArrayList<>();

        Human grandfather1 = new Human("John1", true, 71, list2);
        Human grandfather2 = new Human("John2", true, 69, list3);
        Human grandmother1 = new Human("Maria1", false, 70, list2);
        Human grandmother2 = new Human("Maria2", false, 65, list3);
        Human father = new Human("John", true, 41, list1);
        Human mother = new Human("Maria", false, 41, list1);
        Human children1 = new Human("Lola1", false, 8, list4);
        Human children2 = new Human("Lola2", false, 8, list4);
        Human children3 = new Human("Lola3", false, 8, list4);

        list1.add(children1);
        list1.add(children2);
        list1.add(children3);

        list2.add(father);
        list3.add(mother);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
