package InterviewQuestions;

import java.util.Scanner;

public class FindMaxOfnNumber {

    //1. write a program that can ask the user "enter a number"
    //              five times and return the maximum number
    //				hint: you will need for loop and if statement


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i=0; i < 5; i++){
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if (number > max){
                max= number;
            }
        }
        System.out.println("Maximum number is: "+max);


    }
}
