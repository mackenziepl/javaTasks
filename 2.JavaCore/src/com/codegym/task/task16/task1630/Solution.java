package com.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
        firstFileName = reader.readLine();
        //firstFileName = reader.readLine();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        //systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread implements ReadFileInterface, Runnable {
        private String fullFileName;

        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        public String getFileContents() {
            return fullFileName;
        }

        public void join() throws InterruptedException {}

        public void start() {}

        @Override
        public void run() {
            try {
//                BufferedWriter writer = new BufferedWriter();
//                System.out.println("ggg");
//                while (file.available() > 0) {
//                    String s = Integer.toString(file.read());
//                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
