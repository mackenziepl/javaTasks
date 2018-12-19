package com.codegym.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/* 
One for all, all for one

*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();

    }

    public static void ourInterruptMethod() {
            Water.isCurrentThreadInterrupted = false;


    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;
        public static boolean isCurrentThreadInterrupted;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables
            Thread current = Thread.currentThread();
            String threadName = current.getName();
            isCurrentThreadInterrupted = !current.isInterrupted();

            try {
                while (isCurrentThreadInterrupted) {

                    System.out.println("Object " + sharedResource + ", thread " + threadName);

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
