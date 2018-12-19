package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String name = scanner.nextLine();
        scanner.close();

        System.out.println(name + " will take over the world in " + number + " years. Mwa-ha-ha!");
    }
}
