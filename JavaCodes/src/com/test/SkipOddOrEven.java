package com.test;

import java.util.Scanner;

public class SkipOddOrEven {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = scanner.nextInt();




        for (int i=0; i < a; i++) {

            if (i%2 ==0 ) {
                continue;
            }

            System.out.print(i + " ");
        }



    }
}
