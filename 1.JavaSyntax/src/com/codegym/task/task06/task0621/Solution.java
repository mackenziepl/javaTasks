package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, grandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null,  grandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1) {
            this.name = name;
            this.parent1 = parent1;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2==null) {
                return "The cat's name is " + name + ", no mother," + " no father ";
            } else if (parent2 == null) {
                return "The cat's name is " + name + ", no mother, " + parent1.name + " is the father ";
            } else if (parent1 == null) {
                return "The cat's name is " + name + ", " + parent2.name + " is the mother," + " no father ";
            } else
                return "The cat's name is " + name + ", " + parent1.name + " is the mother"
                    + ", " + parent2.name + " is the father ";
        }
    }
}
