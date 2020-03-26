package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoopTask2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		
		while(true) {
			
			System.out.println("Enter two numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Multiplication is: "+(a*b));
			
			System.out.println("Do you want to continue?");
			scan.nextLine();
			String answer = scan.nextLine().toLowerCase();
			
			while(!(answer.equals("yes") || answer.equals("no")) ){
				System.out.println("Invalid entry, please re enter");
				System.out.println("Do you want to continue");
				answer = scan.nextLine().toLowerCase();
			}
			
			if(answer.equals("no")) {
				break;
			}
			
			}
			
			/*
			 calculator program
			 		write a program that asks user if he she wants to:*, /, %, -, +
			 		
			 		then ask user to enter two numbers
			 		
			 		then return the result to the console
			 		
			 		and then ask user if they want to continue to do another math
			 		if yes ==> repeat steps 
			 		if no  ==> stop
			 		otherwise, ask user to re enter
			 */
			
		System.out.println("Do you want to do multiplication?");
		System.out.println("Do you want to do addition?");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
