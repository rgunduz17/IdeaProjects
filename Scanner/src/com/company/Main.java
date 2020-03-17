package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Test= new Scanner(System.in);
        System.out.println("Put your number between 1-9;");
        int result = Test.nextInt();

        System.out.println("Your number is: " + result);

        System.out.println("Put another number between 1-9;");
        int result2 = Test.nextInt();

        System.out.println("Your second number is: " + result2);

        System.out.println("Sum of your numbers are: "+ (result + result2));
//        char FinalGrade = 'D';
//        String Group = "";
//
//
//        Group =   FinalGrade == 'A' ? "Super"
//                : FinalGrade == 'B' ? "Guzel"
//                : FinalGrade == 'C' ? "Fena Degil"
//                : FinalGrade == 'D' ? "Idare Eder"
//                : "Kotu";
//
//        System.out.println(Group);

    }
}
