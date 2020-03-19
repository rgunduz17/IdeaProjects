package com.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {

    private static int count = 0;
    // main method just to add example
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

                           @Override
                           public void run() {
                               System.out.println("Count is: " + count);
                               if (count == 1) {
                                   System.err.println("... quitting");
                                   System.exit(0);
                               }
                               count++;
                           }
                       },
                // starting now
                new Date(),
                // 5 minutes
                300000l
        );
    }
}