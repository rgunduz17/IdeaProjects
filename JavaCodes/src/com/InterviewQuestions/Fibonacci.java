package com.InterviewQuestions;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {


//        The fibonacci sequence is a sequence of numbers in which the next number is the sum of the previous two numbers.
//
//        The first two numbers of the fibonacci sequence are 0, 1.
//
//        The first 8 numbers of the fibonacci sequence are 0, 1, 1, 2, 3, 5, 8, 13
//
//        Write some code to print out the first X numbers of the fibonacci sequence.
//
//        Your output should be on one line, with each number separated by a space.  You may assume that x is at least 2.

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();
        //write your code below




        int num1=0;
        int num2=1;

        for (int i = 1; i <= x; i++) {

            System.out.print(num1+ " ");

            int total= num1 +num2;
            num1 = num2;
            num2 = total;

            System.out.println("total is "+total);
        }



    }
}
