package com.InterviewQuestions;

import java.util.Scanner;

public class AlTeRnAtEcAsE {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        int len = s.length();
        for (int i = 0;  i < len; i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0) {
                System.out.print(Character.toLowerCase(ch));
            } else {
                System.out.print(Character.toUpperCase(ch));
            }
        }










    }
}
