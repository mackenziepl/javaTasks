package com.codegym.task.task19.task1913;

/* 
Output only digits

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

        String[] out = result.split("[^0-9]");
        for(String s : out) {
            System.out.print(s);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
