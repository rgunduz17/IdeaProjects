package InterviewQuestions;

import java.util.Scanner;

public class FindMinOfnNumbers {

//    2. write a program that can ask the user "enter a number"
//    five times and return the minimum number

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Minimum number is: "+min);

    }
}
