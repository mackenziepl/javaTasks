package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(printStream);

        String[] out = result.split(" ");
        int i = Integer.parseInt(out[0]);
        int r = 0;
        int k = Integer.parseInt(out[2]);
        if(out[1].charAt(0) == 43) r = i + k;
        else if(out[1].charAt(0) == 42) r = i * k;
        else if(out[1].charAt(0) == 45) r = i - k;


        System.out.println(out[0] + " " + out[1].charAt(0) + " " + out[2] + " = " + r);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

