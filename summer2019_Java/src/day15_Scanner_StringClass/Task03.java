package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
		 Write program that asks first and last name, then displays them together
		 */
	Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String Fname = input.nextLine();
		
		System.out.println("What is your last name?");
		String Lname = input.nextLine();
		
		String fullname= Lname+" "+Fname;
		
		System.out.println("Your full name is "+fullname);
		
	input.close(); // gets rid of warning of scanner class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
