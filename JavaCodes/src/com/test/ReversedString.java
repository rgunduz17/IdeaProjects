package com.test;

import java.util.Scanner;

public class ReversedString {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String reversed ="";
        int len = s.length();
        for(int i=len-1; i >= 0; i--) {

            //reversed = ""+s.charAt(i-1);
            reversed = ""+s.charAt(i);

            System.out.print(reversed);
        }

    }
}
