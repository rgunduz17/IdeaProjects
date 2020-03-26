package day20_JavaRecap;

import java.util.Scanner;

public class warmUp4 {
	/*
	 4. write a program that asks user to enter number 5 times:
	 	3. find the minimum number and the minimum number
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 999999999;
		
		for(int i=1; i<=5; i++){
			System.out.println("Enter a number");
			int inputNum = scan.nextInt();
			if (inputNum<min) {
				min=inputNum;
			}
		}
		System.out.println("min num is: "+ min);
		
		
		
		
		
		
		
		
		
	}		
}
