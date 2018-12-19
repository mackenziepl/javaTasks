package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner3 = new Scanner(System.in);
        String name = scanner3.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        String number1 = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        String number2 = scanner2.nextLine();

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
