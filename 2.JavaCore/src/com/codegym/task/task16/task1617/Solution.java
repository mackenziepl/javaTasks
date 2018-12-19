package com.codegym.task.task16.task1617;

/* 
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                int num = numSeconds;
                while(!(RacingClock.interrupted())) {

                    if(num > 3) {
                        numSeconds--;
                        if(numSeconds == 1) System.out.println("4 3 2 1 Interrupted!");;
                    } else if(num <= 3) {
                        numSeconds--;
                        if(numSeconds == 0) System.out.println("3 2 1 Go!");
                    }
                    Thread.sleep(1000);
                }
            } catch(InterruptedException e) {}
        }
    }
}
