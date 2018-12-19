package com.codegym.task.task15.task1501;

/* 
OOP: Arrange interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        public boolean isMovable() {
            return false;
        }

        public Object getAllowedAction(String name) {
            return new Object();
        }

        public Object getAllowedAction() {
            return new Object();
        }
    }
}
