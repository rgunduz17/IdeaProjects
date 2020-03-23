package InterviewQuestions;

import java.util.Scanner;

public class PrintOddsBetweenAandB {


    public static void main(String[] args) {

//      1. Question

        // You are given two inputs
        // int num1;
        // int num2;

        // You can assume that num2 > num1 == true;

        // Print all ODD  numbers between num1 and num2 inclusive.
        //Your output should all be on one line, separated by spaces
//        #1: 3
//        #2: 11
//        3 5 7 9 11


        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();


        for (int i= num1; i <= num2; i++) {

            if (i % 2 == 0){
                continue;
            }

            System.out.print(i+ " ");
        }




        //2. Question

//      You are to write a program that will calculate
//      and print out the SUM OF ODD numbers in between
//      num1 and num2 inclusive.
//      Your output should all be on one line, separated by spaces.
//      Sample input/output:
//        #1: 3
//        #2: 11
//        35

//        int count=0;
//        for (int i= num1; i <= num2; i++) {
//
//            if (i % 2 == 0){
//                continue;
//
//            }
//            count += i;
//
//        }
//        System.out.print(count);




    }



}
