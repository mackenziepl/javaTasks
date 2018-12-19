package com.newCode;

import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    public static void main(java.lang.String[] args) {

        ArrayList<Integer> bingoDrum = new ArrayList<>(49);
        for (int i = 1; i <= 49; i++) {

            bingoDrum.add(i);// add the numbers 1 to 49 to the drum
        }

        Collections.shuffle(bingoDrum);// Mix it up
        System.out.println ("Your attention, please! Here are the first 10 numbers from the drum!");
        for (int i = 0; i < 6; i++) {

            System.out.print(bingoDrum.get(i) + " ");
        }

    }
}
