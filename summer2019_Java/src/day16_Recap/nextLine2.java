package day16_Recap;

import java.util.Scanner;

public class nextLine2 {

	public static void main(String[] args) {
		
		/*
		 write a program that accepts zip-code, city, state, phone number
		 and then display all those gathered information
		 
		 Do not use next() method
		 */
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your zip code");
		int zipcode = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter your City Name");
		String cityname = input.nextLine();

		System.out.println("Enter your phone number");
		long pn = input.nextLong();
		
		input.nextLine();
		System.out.println("Enter State");
		String statename = input.nextLine();
		

		
		System.out.println("zip code is: \n\t"+zipcode);
		System.out.println("City Name is: \n\t"+cityname);
		System.out.println("State is: \n\t"+statename);
		System.out.println("Phone number is: \n\t"+pn);
		
		
	}
}
