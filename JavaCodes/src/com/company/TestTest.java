package com.company;

import java.util.Scanner;

public class TestTest {

    public static void main(String[] args) {


//        Inputs:
//        String word;
//
//        Write a for loop that will loop
//        through every character of a word
//        and print out each character,
//        each on a separate line
//
//        Sample inputs/outputs:
//        In: hello
//        h
//        e
//        l
//        l
//        o

        Scanner userInput = new Scanner(System.in);
        System.out.println("Put your word here: ");
        String word = userInput.nextLine();

        for (int i=0; i < word. length(); i++) {
            System.out.print(word.charAt(i) + "\n");
        }

        System.out.println("Put a number here: ");
        int number = userInput.nextInt();

        for (int i = 0; i <= number; i++) {

            System.out.print(i + " ");
        }
    }
}
