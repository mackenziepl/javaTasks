package com.codegym.task.task14.task1419;

import org.omg.CORBA.ExceptionList;

import java.io.*;
import java.rmi.server.ExportException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sun.awt.image.PixelConverter.Argb.instance;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            method2();

        } catch (CharConversionException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[] {1, 2, 3};
                System.out.println(array[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            System.out.println(s.charAt(0));

        } catch (NullPointerException e) {
            exceptions.add(e);
        }


        try {
            Class loadedClass = Class.forName("main.java.Utils");
            System.out.println("Class " + loadedClass + " found!");

        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("C:/text.txt");

        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            method1();

        } catch (NotSerializableException e) {
            exceptions.add(e);
        }

        try {
            int n = Integer.parseInt ("Test") ;
            System.out.println(n);

        } catch(NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            String s = "string";
            System.out.println(s.charAt(10));

        } catch(StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
                method3();
        } catch(IllegalArgumentException e) {
            exceptions.add(e);
        }
    }

    static void method1() throws NotSerializableException {
        throw new NotSerializableException();
    }

    static void method2() throws CharConversionException {
        throw new CharConversionException();
    }

    static void method3() {
        throw new IllegalArgumentException();
    }

}
