package com.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Turnip

*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Turnip"));
        plot.add(new Person("Grandpa"));
        plot.add(new Person("Grandma"));
        plot.add(new Person("Granddaughter"));
        TurnipStory.tell(plot);
    }

    public static class Person implements TurnipItem {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void pull(Person person) {
            System.out.println(name + " behind " + person.getName());
        }
    }
}
