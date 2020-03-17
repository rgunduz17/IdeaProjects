package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1. WRITE YOUR CODE HERE:
        int hour;
        int minute;
        int second;
        String amOrPm;


        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour:");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt ) {
            hour = scanner.nextInt();
            if (hour > -1 && hour < 24) {
                System.out.println();
            } else {
                System.out.println("invalid hour selection");

            }

            System.out.println("Enter minute:");
            minute = scanner.nextInt();

            if (minute >= 0 && minute < 60) {
                System.out.println();
            } else {
                System.out.println("invalid minute selection");

            }



            System.out.println("Enter second:");
            second = scanner.nextInt();

            System.out.println("AM or PM");
            amOrPm = scanner.next();



            System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

            //#############################F




        } else {
            System.out.println("Put hour 0-23");

        }


    }
}
