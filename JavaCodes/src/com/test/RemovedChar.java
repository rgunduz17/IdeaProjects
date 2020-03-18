package com.test;



import java.util.Scanner;

public class RemovedChar {
    public static void main(String[] args) {




        String removed = "";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your word: ");
        String word = scanner.nextLine();



        for(int i= 0; i< word.length(); i++) {
            if (!removed.contains(word.substring(i, i+1))){
                    //          ("" + word.charAt(i))
                removed += word.substring(i, i+1);
            }

        }

        System.out.println("Removed repeating chars: "+removed);

    }
}