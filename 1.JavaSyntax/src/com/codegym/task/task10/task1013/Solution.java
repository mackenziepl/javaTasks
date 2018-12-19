package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private byte s1;
        private short s2;
        private int s3;
        private long s4;
        private String s5;
        private char s6;

        public Human() {}

        public Human(byte s1, short s2, int s3, long s4, String s5, char s6) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
            this.s4 = s4;
            this.s5 = s5;
            this.s6 = s6;
        }

        public Human(byte s1) {
            this.s1 = s1;
        }

        public Human(short s2) {
            this.s2 = s2;
        }

        public Human(int s3) {
            this.s3 = s3;
        }

        public Human(long s4) {
            this.s4 = s4;
        }

        public Human(String s5) {
            this.s5 = s5;
        }

        public Human(char s6) {
            this.s6 = s6;
        }

        public Human(byte s1, short s2, int s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        public Human(long s4, String s5, char s6) {
            this.s4 = s4;
            this.s5 = s5;
            this.s6 = s6;
        }
    }
}
