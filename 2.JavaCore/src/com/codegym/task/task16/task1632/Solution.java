package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
            for(Thread t : threads) {
                t.start();
                t.interrupt();
            }
    }

    static {
        class Thread1 extends Thread {
            @Override
            public void run() {
                int i = 0;
                while(true){
                    i++;
                }
            }
        }
        threads.add(new Thread1());

        class Thread2 extends Thread {
            @Override
            public void run() {
                try{
                    sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
        threads.add(new Thread2());

        class Thread3 extends Thread {
            @Override
            public void run() {
                while(true) {
                    try {
                        System.out.println("Hurray");
                        sleep(500);
                    } catch(InterruptedException e) {}
                }
            }
        }
        threads.add(new Thread3());

        class Thread4 extends Thread implements Message {
            @Override
            public void showWarning() {
            }

            @Override
            public void run() {
                if(isAlive()) {
                    showWarning();
                    Thread.currentThread().interrupt();
                }
            }
        }
        threads.add(new Thread4());

        class Thread5 extends Thread {

            @Override
            public void run() {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int y = 0;
                try {
                    while(true) {
                        String s = br.readLine();
                        if(s.equals("N")) break;
                        int x = Integer.parseInt(s);
                        y += x;
                    }
                    System.out.println(y);
                } catch(IOException e) {}
            }
        }
        threads.add(new Thread5());
    }
}