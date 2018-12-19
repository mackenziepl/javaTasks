package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        br.close();
        return x;
    }

    public static int readInt() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        return x;

    }

    public static double readDouble() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());
        br.close();
        return x;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean x = Boolean.parseBoolean(br.readLine());
        br.close();
        return x;

    }

    public static void main(String[] args) {

    }
}
