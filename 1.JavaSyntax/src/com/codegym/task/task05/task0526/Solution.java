package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("John1", 30, "London");
        Man man2 = new Man("John2", 28, "London");
        Woman woman1 = new Woman("Sonia1", 25, "New York");
        Woman woman2 = new Woman("Sonia2", 23, "New York");
        man1.view();
        man2.view();
        woman1.view();
        woman2.view();
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void view() {
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public void view() {
            System.out.println(name + " " + age + " " + address);
        }
    }
}
