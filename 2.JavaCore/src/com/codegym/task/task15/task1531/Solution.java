package com.codegym.task.task15.task1531;

import javafx.util.converter.BigIntegerStringConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String s = Integer.toString(n);
        BigInteger bI = new BigInteger(s);
        s = bigInteger(bI).toString();
        return s;
    }

    public static BigInteger bigInteger (BigInteger n) {
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        int i = n.compareTo(zero);
        if(i < 0) return zero;

        else if (i == 0) return one;

        else return n.multiply(bigInteger(n.subtract(one)));
    }
}
