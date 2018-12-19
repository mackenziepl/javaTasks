package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("Kate1", false, 55);
        Human human2 = new Human("Kate2", false, 55);
        Human human3 = new Human("John1", true, 55);
        Human human4 = new Human("John2", true, 55);
        Human human5 = new Human("Kate5", false, 55, human3, human1);
        Human human6 = new Human("Kate6", false, 55, human4, human2);
        Human human7 = new Human("Kate7", false, 55, human3, human2);
        Human human8 = new Human("Kate8", false, 55, human4, human1);
        Human human9 = new Human("Kate9", false, 55, human3, human1);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}