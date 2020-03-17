package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hour:");
         boolean hasNextInt = scanner.hasNextInt();

         if (hasNextInt) {

             int hour = scanner.nextInt();


             System.out.println("Enter minute:");
             int minute = scanner.nextInt();


             System.out.println("Enter second:");
             int second = scanner.nextInt();

             if (hour > -1 && hour < 24 && minute>0 && minute <60 && second >0 && second <60) {
                 System.out.println(hour +" Hours, " +minute+ " minutes, " +  + second + " seconds");
             } else {
                 System.out.println("invalid hour/minute/second entry");
             }



         } else {
             System.out.println("Wrong time format");
         }
















scanner.close();

    }
}
