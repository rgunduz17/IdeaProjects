package com.test;

import java.util.Scanner;

public class NestedLoopTest {

    public static void main(String[] args) {


       while (true) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter two numbers:");
           int a = scan.nextInt();
           int b = scan.nextInt();

           System.out.println("Addition is : " + (a+b));
           System.out.println("Do you want to continue ?");
           scan.nextLine();
           String answer = scan.nextLine().toLowerCase();


           while (!(answer.equals("yes") || answer.equals("no"))) {

               System.out.println("Invalid Entry please re-enter");
               System.out.println("Do you want to continue ?");
               answer = scan.nextLine();
           }
           if(answer.equals("no") ) {
                break;
            }
       }

  

    }
}
