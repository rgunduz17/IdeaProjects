package com.javacodes;

public class WhileDoWhile {


    public static void main(String[] args) {

//         while (condition) {
//               statements;
//            increment or decrement
//            }


        int a= 9;
        while (a>8) {

            a--;

            System.out.println("Dogru");
        }

        String sentence = "I like book, I read book, book book book";

        int count=0;

        while (sentence.contains("book")) {
            count++;
            sentence= sentence.replaceFirst("book", "");
        }

        System.out.println(count);
        System.out.println(sentence);

        System.out.println("******************************************");


//        do {
//            statement executes first no matter what
//        } while (condition);
//
//

        boolean A= false;
         do {
             System.out.println("Hello");

         } while (A) ;



         int x = 1;
         do {
             if (x%2 ==0) {
                 System.out.print(x+ " ");
             }
             x++;
         } while (x <=100);

         System.out.println("*************************");

         do {

             System.out.println("Ridvan");
             break;

         }  while(true);


    }
}
