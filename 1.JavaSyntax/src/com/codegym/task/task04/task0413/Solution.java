package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x == 1)
            System.out.println("Monday");
        else if(x == 2)
            System.out.println("Tuesday");
        else if(x == 3)
            System.out.println("Wednesday");
        else if(x == 4)
            System.out.println("Thursday");
        else if(x == 5)
            System.out.println("Friday");
        else if(x == 6)
            System.out.println("Saturday");
        else if(x == 7)
            System.out.println("Sunday");
        else
            System.out.println("No such day of the week");
        scanner.close();
    }
}